$(document).ready(function() {
  buscaData($('#data-inicial'),$('#data-final'), $('#filtrar'));
});

function buscaData(dataInicial, dataFinal, btnFiltrar) {
  $(btnFiltrar).click(function(event) {
    let lista='';
    $.ajax({
      url: 'http://localhost:8090/carro/listapordatafabricacao',
      type: 'GET',
      data: {dataInicial: $(dataInicial).val(), dataFinal: $(dataFinal).val()}
    })
    .done(function(data) {
      data = JSON.parse(data);
      console.log(data);
      $.each(data, function(index, el) {
        lista+='<li>';
        lista+='<h3>Fabricante: '+el.fabricante.nome+'</h3>';
        lista+='<h4>Nome do modelo: '+el.nome+'</h4>';
        lista+='<h4>Data de fabricação: '+el.dataFabricacao+'</h4>';
        lista+='<h4>Acessórios:</h4>';
        lista+='<ul>';
        $.each(el.acessorios, function(index, el) {
          lista+='<li>'+el.nome+'</li>';
        });
        lista+='</ul>';
        lista+='<h4>Motorista : '+el.motorista.nome+'</h4>';
        lista+='</li>';
      });
      $('#lista-carros').append(lista);
    })
    .fail(function() {
      console.log("error");
    })
    .always(function() {
      console.log("complete");
    });
  });
}
