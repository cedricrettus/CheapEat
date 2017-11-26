$(document).ready(function(){

    //var danger = $('.alert-danger');

    //var success = $('.alert-success');

});

function addSuccess(msg){
    $('.alert').hide();
    $('.alert-success').empty();
    $('.alert-success').append(msg);
    $('.alert-success').show();
}

function addDanger(msg){
    $('.alert').hide();
    $('.alert-danger').empty();
    $('.alert-danger').append(msg);
    $('.alert-danger').show();
}

function getUrlParameter(sParam) {
    var sPageURL = decodeURIComponent(window.location.search.substring(1)),
        sURLVariables = sPageURL.split('&'),
        sParameterName,
        i;

    for (i = 0; i < sURLVariables.length; i++) {
        sParameterName = sURLVariables[i].split('=');

        if (sParameterName[0] === sParam) {
            return sParameterName[1] === undefined ? true : sParameterName[1];
        }
    }
}

function addEventListeners(){
    $('#callModal').click(function(){
        $('#angebotModal').modal('toggle');
    });


    $('#angebotSubmit').click(function(){
        $('#angebotForm').submit();
    });

    $('#bestellenSubmit').click(function(){
        var postData = {
            'angebot_id': $('#bestellenSubmit').data('id'),
            'email': $('#bestellenEmail').val(),
            'menge' : $('#bestellenMenge').val()
        }

        $.post('/bestellung', postData, function(){
            alert('bestellung gesendet');
            $('#bestellenModal').modal('hide');
        });
    });

    $('.bestellButton').click(function(){
        var id = $(this).data('id');
        console.log(id);
        $('#bestellenSubmit').data('id', id);
        $('#bestellenModal').modal('toggle');

    });
}