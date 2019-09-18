$(document).ready(function() {
  getCor();
});

function getCor() {
  $.ajax({
    url: 'http://localhost:8090/drag-bloco/getcor',
    type: 'GET',
    dataType: 'json'
  })
  .done(function(data) {
    $('[cor='+data.cor+']').append('<div id="bloco" identificacao='+data.id+'></div>');
    $('#bloco').draggable();
    $('#coluna-verde,#coluna-azul').droppable({
    drop:function(e, ui) {
        $(e.target).append($(ui.draggable).detach().css({'top':'', 'left':''}));
        setCor($('#bloco'));
      }
    });
  });
}

function setCor(bloco) {
  let cor = $(bloco).parent('div').attr('cor')
  let parametro = {
    id: $(bloco).attr('identificacao'),
    cor: $(bloco).parent('div').attr('cor')
  }
  $.ajax({
    url: 'http://localhost:8090/drag-bloco/setcor',
    type: 'POST',
    dataType: 'json',
    data: JSON.stringify(parametro),
    contentType: 'application/json; charset=utf-8'
  })
  .done(function() {
    console.log("success");
  })
  .fail(function() {
    console.log("error");
  })
  .always(function() {
    console.log("complete");
  });

}
