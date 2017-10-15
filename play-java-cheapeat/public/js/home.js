$(document).ready(function() {
    $.get('/angebote', function(angebote){
        $.each(angebote, function(index, angebot){
            $('#angebote').append(
                $('<li>').append(angebot.titel));
        })
    })

});