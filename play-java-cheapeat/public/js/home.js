$(document).ready(function() {
    /*$.get('/angebote', function(angebote){
        $.each(angebote, function(index, angebot){
            $('#angebote').append(

                $('<li>').append(angebot.titel));
        })
    })*/

    /*$.get('/angebote', function(angebote){
        $.each(angebote, function(index, angebot){
            $.('#angebote-cards').append(
                $('<div>').addClass("card").append(

                )
            )
        })
    })*/
    /*$('#suche').submit(function(e){
        console.log(e);
        e.preventDefault();
        $.get('/suche', {'plz': $('#fieldPlz').val()},  function(data){
            showAngebote(data);
        });
    });*/


    $.get('/angebote', function (data) {
        showAngebote(data);
    });

    $('#callModal').click(function(){
        $('#angebotModal').modal('toggle');
    });

    $('#angebotSubmit').click(function(){
        $('#angebotForm').submit();
    })

}); //document ready closing


function showAngebote(angebote){
    $('#angebote-cards').empty()
    $.each(angebote, function (index, angebot) {
        var html = '';
        html += '<div class="card">' +
            '<div class="row">' +
            '<div class="col-md-3">' +
            '<img class="card-img-top" src="assets/images/burger1.jpg" alt="Card image cap">' +
            '</div>' +
            '<div class="col-md-6">' +
            '<div class="card-body">' +
            '<h4 class="card-title">'+ angebot.titel +'</h4>' +
            '<h6 class="card-subtitle mb-2 text-muted">'+ angebot.kueche +'</h6>' +
            '<p class="card-text">'+ angebot.beschreibung +'</p>' +
            '</div>' +
            '</div>' +
            '<div class="col-md-3">' +
            '<div class="card-body">' +
            '<p class="card-text">Username <span class="">Bewertung</span></p>' +
            '<p class="card-text">Ort: <span>'+ angebot.plz +'</span></p>' +
        '<p class="card-text"><span class="preis">'+ angebot.preis +' CHF</span> <span class="">Portionen: '+ angebot.menge +'</span></p>' +
        '<a href="#" class="btn btn-primary" data-id="' + angebot.id + '">Bestellen</a>' +
        '</div>' +
        '</div>' +
        '</div>' +
        '</div>';
        /*
        html += '<div class="card">';
        html += '<img class="card-img-top" src="" alt="Card image cap">';
        html += '<div class="card-block">'
        html += '<h4 class="card-title">' + angebot.titel + '</h4>';
        html += '<h6 class="card-subtitle mb-2 text-muted">' + angebot.kueche + '</h6>';
        html += '<p class="card-text">' + angebot.beschreibung + '</p>';
        html += '<a href="/bestellen" class="btn btn-primary" data-id="' + angebot.id + '">Bestellen</a>';
        html += '</div>';
        html += '</div>';
        */


        $('#angebote-cards').append(html);
    });
}