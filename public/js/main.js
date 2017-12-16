var postData;

$(document).ready(function(){

    //var danger = $('.alert-danger');

    //var success = $('.alert-success');

});

function addSuccess(msg){
    $('.alert').hide();
    $('.alert-success-text').empty();
    $('.alert-success-text').append(msg);
    $('.alert-success').fadeIn();

    $('.btn-close').click(function(){
        $('.alert').hide();
    })
}

function addDanger(msg){
    $('.alert').hide();
    $('.alert-danger-text').empty();
    $('.alert-danger-text').append(msg);
    $('.alert-danger').fadeIn();

    $('.btn-close').click(function(){
        $('.alert').hide();
    })
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
        $('#angebotModal').modal('show');
    });

    $('#angebotSubmit').click(function(e){
        //$('#angebotForm').submit();

        if ($('#angebotForm')[0].checkValidity()) {

            $('#modal-wait').modal('show');
            e.preventDefault();
            e.stopPropagation();
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

            $.ajax({
                type: "POST",
                url: '/angebote',
                data: formData,
                enctype: 'multipart/form-data',
                contentType: false,
                processData: false
            }, function(data){
                console.log(data);
                $('#modal-wait').modal('hide');
                $('#angebotModal').modal('hide');
                addSuccess('Angebot erstellt');
            }).fail(function (jqXHR, textStatus) {
                $('#modal-wait').modal('hide');
                console.log(jqXHR);
                console.log(textStatus);
                addDanger(jqXHR.responseText);
            });
        }
        //angebotForm.classList.add('was-validated');

    });


    $('#bestellenSubmit').click(function(e){

        if ($('#bestellenForm')[0].checkValidity()) {
            $('#modal-wait').modal('show');
            e.preventDefault();
            e.stopPropagation();
            postData = {
                'angebot_id': $('#bestellenSubmit').data('id'),
                'menge' : $('#bestellenMenge').val()
            };

            $.post('/bestellung', postData, function(data){
                console.log(data);
                $('#modal-wait').modal('hide');
                $('#bestellenModal').modal('hide');
                addSuccess('Bestellung gesendet');

            })
            .fail(function (jqXHR, textStatus) {
                $('#modal-wait').modal('hide');
                console.log(jqXHR);
                console.log(textStatus);
                addDanger(jqXHR.responseText);
            });
        }
        //bestellenForm.classList.add('was-validated');

    });

    $('.bestellButton').click(function(){
        var id = $(this).data('id');
        console.log(id);
        $('#bestellenSubmit').data('id', id);
        $('#bestellenModal').modal('show');
    });
}