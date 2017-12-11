$(document).ready(function(){

    //var danger = $('.alert-danger');

    //var success = $('.alert-success');

});

function addSuccess(msg){
    $('.alert').hide();
    $('.alert-success-text').empty();
    $('.alert-success-text').append(msg);
    $('.alert-success').show();
}

function addDanger(msg){
    $('.alert').hide();
    $('.alert-danger-text').empty();
    $('.alert-danger-text').append(msg);
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
            'menge' : $('#bestellenMenge').val()
        }

        $.post('/bestellung', postData, function(data){
            console.log(data);
            $('#bestellenModal').modal('hide');
            addSuccess('Bestellung gesendet');

        })
            .fail(function (jqXHR, textStatus) {
                console.log(jqXHR);
                console.log(textStatus);
                addDanger(jqXHR.responseText);
            });
    });

    $('.bestellButton').click(function(){
        var id = $(this).data('id');
        console.log(id);
        $('#bestellenSubmit').data('id', id);
        $('#bestellenModal').modal('toggle');
    });
}