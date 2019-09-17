$(document).ready(function() {
  geraQrCode($('#gerar-qr-code'));
});

function geraQrCode(botao) {
  $(botao).click(function(event) {
    console.log('click');
    let mensagem = $('#texto-qr-code').val();
    $.ajax({
      url: 'http://localhost:8090/gerador-qr-code/getqrcode',
      type: 'GET',
      data: {mensagem: mensagem, largura: '350', altura: '350'}
    })
    .done(function(data) {
      $('body').append('<img src="'+data+'" alt="">');
    })
    .fail(function() {
      console.log("error");
    })
    .always(function() {
      console.log("complete");
    });

  });
}
