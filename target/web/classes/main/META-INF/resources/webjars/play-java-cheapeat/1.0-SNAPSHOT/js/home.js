$(document).ready(function() {

    //--------------handlebars.js initialisierung------------------
    // Grab the template script
    var theTemplateScript = $("#angebote-template").html();

    // Compile the template
    var theTemplate = Handlebars.compile(theTemplateScript);

    var angeboteAll;

    //alle angebote anzeigen, bei Seitenaufruf
    listAngebote(theTemplate);



    /*$('#suche').submit(function(e){
    //TODO delete event listener
        var sucheplz = $('#fieldPlz').val();

        filterAngebote(theTemplate, sucheplz);

        e.preventDefault();
    });*/

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

        addEventListeners();
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

        addEventListeners();
    })
}