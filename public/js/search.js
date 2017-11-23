$(document).ready(function() {

    //--------------handlebars.js initialisierung------------------
    // Grab the template script
    var theTemplateScript = $("#angebote-template").html();

    // Compile the template
    var theTemplate = Handlebars.compile(theTemplateScript);

    var plz = getUrlParameter("plz");

    addEventListeners();

    //TODO suche in seprates js auslagern
    if(plz > 0 && plz < 10000){
        $.get('/search/'+plz, function(data){
            angeboteFiltered = data;

            console.log(data);

            // Pass our data to the template
            var theCompiledHtml = theTemplate(data);

            // Add the compiled html to the page
            $('.angebote-cards').html(theCompiledHtml);

            addEventListeners();

        });

    }else{
        addDanger("Falsche Parameter");
    }



}); //document ready closing