$(document).ready(function () {
    // Grab the template script
    var theTemplateScript = $("#angebote-template").html();

    // Compile the template
    var theTemplate = Handlebars.compile(theTemplateScript);

    var angeboteAll;

    $.get('/angebote/all', function(data){
        angeboteAll = data;

        console.log(data);
        /*var context={
            "titel": data.angebot.titel,
            "kueche": data.angebot.kueche,
            "beschreibung": data.angebot.beschreibung,
            "plz": data.angebot.plz,
            "menge" : data.angebot.menge,
            "preis" : data.angebot.preis,
            "id" : data.angebot.id
        };*/
        // Pass our data to the template
        var theCompiledHtml = theTemplate(data);

        // Add the compiled html to the page
        $('.angebote-cards').html(theCompiledHtml);

    })


});
