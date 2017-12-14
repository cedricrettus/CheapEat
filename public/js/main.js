var postData;

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
        //$('#angebotForm').submit();

        var formData = new FormData();
        formData.append('titel', $('#titel').val());
        formData.append('beschreibung', $('#beschreibung').val());
        formData.append('zeitForm', $('#zeitForm').val());
        formData.append('kueche', $('#kueche').val());
        formData.append('datum', $('#datum').val());
        formData.append('menge', $('#menge').val());
        formData.append('preis', $('#preis').val());
        for(i = 0; i < $('#bilder')[0].files.length; i++){
            formData.append('bilder[]', $('#bilder')[0].files[i]);
        }

        /*postData = {
            'titel': $('#titel').val(),
            'beschreibung': $('#beschreibung').val(),
            'zeitForm': $('#zeitForm').val(),
            'datum': $('#datum').val(),
            'kueche': $('#kueche').val(),
            'menge': $('#menge').val(),
            'preis': $('#preis').val(),
            'bilder': $('#bilder').attr('files')
        }*/

        $.ajax({
            type: "POST",
            url: '/angebote',
            data: formData,
            enctype: 'multipart/form-data',
            contentType: false,
            processData: false
        }, function(data){
            console.log(data);
            $('#angebotModal').modal('hide');
            addSuccess('Angebot erstellt');
        }).fail(function (jqXHR, textStatus) {
            console.log(jqXHR);
            console.log(textStatus);
            addDanger(jqXHR.responseText);
        });


    });


    $('#bestellenSubmit').click(function(){
        postData = {
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