$(document).ready(function() {

    //--------------handlebars.js initialisierung------------------
    // Grab the template script für template angebote
    var templateScriptAngebote = $("#angebote-template").html();
    var templateAngebote = Handlebars.compile(templateScriptAngebote);

    // Grab the template script für template bestellungen
    var templateScriptBestellungen = $("#bestellung-template").html();
    var templateBestellung = Handlebars.compile(templateScriptBestellungen);

    // Grab the template script für template anfragen
    var templateScriptAnfragen = $("#anfragen-template").html();
    var templateAnfragen = Handlebars.compile(templateScriptAnfragen);

    //angebote anzeigen, bei Seitenaufruf
    listAngebote(templateAngebote);


    $('#link-anfragen').click(function(){
        $('#angebote-cards').empty();
        $('#bestellungen-cards').empty();
        listAnfragen(templateAnfragen);
    });

    $('#link-angebote').click(function(){
        $('#anfragen-cards').empty();
        $('#bestellungen-cards').empty();
        listAngebote(templateAngebote);
    });

    $('#link-bestellungen').click(function(){
        $('#angebote-cards').empty();
        $('#anfragen-cards').empty();
        listBestellungen(templateBestellung);
    });



}); //document ready closing


function listAngebote(template){
    $.get('/angebote/all', function(data){

        console.log(data);

        // Pass our data to the template
        var theCompiledHtml = template(data);

        // Add the compiled html to the page
        $('#angebote-cards').html(theCompiledHtml);
        addEventListeners();
        addEditEventListener();

    })

}

function listBestellungen(template){
    $.get('/me/bestellungen', function(data){

        console.log(data);

        // Pass our data to the template
        var theCompiledHtml = template(data);

        // Add the compiled html to the page
        $('#bestellungen-cards').html(theCompiledHtml);
        addEventListeners();


    })

}

function listAnfragen(template){
    $.get('/me/anfragen', function(data){

        console.log(data);

        // Pass our data to the template
        var theCompiledHtml = template(data);

        // Add the compiled html to the page
        $('#anfragen-cards').html(theCompiledHtml);
        addEventListeners();


    })

}

function addEditEventListener(){
    $('.button-edit').click(function(e){
       console.log("edit clicked");
    });
}