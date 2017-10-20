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

    $.get('/angebote', function (angebote) {
        $.each(angebote, function (index, angebot) {
            var html = '';
            html += '<div class="card">';
            html += '<img class="card-img-top" src="" alt="Card image cap">';
            html += '<div class="card-block">'
            html += '<h4 class="card-title">' + angebot.titel + '</h4>';
            html += '<h6 class="card-subtitle mb-2 text-muted">' + angebot.kueche + '</h6>';
            html += '<p class="card-text">' + angebot.beschreibung + '</p>';
            html += '<a href="/bestellen" class="btn btn-primary" data-id="' + angebot.id + '">Bestellen</a>';
            html += '</div>';
            html += '</div>';

            $('#angebote-cards').append(html);
        });
    });

    $('#callModal').click(function(){
        $('#angebotModal').modal('toggle');
    });

}); //document ready closing


