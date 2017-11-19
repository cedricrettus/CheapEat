$(document).ready(function() {

    //--------------handlebars.js initialisierung------------------
    // Grab the template script
    var theTemplateScript = $("#angebote-template").html();

    // Compile the template
    var theTemplate = Handlebars.compile(theTemplateScript);

    var angeboteAll;

    //alle angebote anzeigen, bei Seitenaufruf
    listAngebote(theTemplate);

    $('#callModal').click(function(){
        $('#angebotModal').modal('toggle');
    });


    $('#angebotSubmit').click(function(){
        $('#angebotForm').submit();
    });

    $('#bestellenSubmit').click(function(){
        var data = {
            'angebot_id': $('#bestellenSubmit').data('id'),
            'email': $('#bestellenEmail').val(),
            'menge' : $('#bestellenMenge').val()
        }

        $.post('/bestellung', data, function(){
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

    $('#suche').submit(function(e){
        var sucheplz = $('#fieldPlz').val();

        filterAngebote(theTemplate, sucheplz);

        e.preventDefault();
    });

}); //document ready closing


function showAngebote(angebote){

}

function listAngebote(template){
    $.get('/angebote/all', function(data){
        angeboteAll = data;

        console.log(data);

        // Pass our data to the template
        var theCompiledHtml = template(data);

        // Add the compiled html to the page
        $('.angebote-cards').html(theCompiledHtml);

    })

}

function filterAngebote(template, plz){
    $.get('/search', {'plz' : plz} , function(data){
        angeboteFiltered = data;

        console.log(data);

        // Pass our data to the template
        var theCompiledHtml = template(data);

        // Add the compiled html to the page
        $('.angebote-cards').html(theCompiledHtml);

    })
}