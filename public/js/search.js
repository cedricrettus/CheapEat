$(document).ready(function() {

    //--------------handlebars.js initialisierung------------------
    // Grab the template script
    var theTemplateScript = $("#angebote-template").html();

    // Compile the template
    var theTemplate = Handlebars.compile(theTemplateScript);

    var plz = getUrlParameter("plz");


    search(plz, null);
    //addEventListeners();

    $('#filter-form').submit(function (e) {
        e.preventDefault();
        plz = getUrlParameter('plz');
        datum = $('#filter-datum').val();
        search(plz, datum);

    })

}); //document ready closing

function search(plz, datum){
    //TODO suche in seprates js auslagern
    if(plz > 0 && plz < 10000){
        if(datum == null){
            $.get('/search/'+plz, function(data){

                console.log(data);

                // Pass our data to the template
                var theCompiledHtml = theTemplate(data);

                // Add the compiled html to the page
                $('.angebote-cards').html(theCompiledHtml);

                addEventListeners();

            });
        }else{
            $.get('/search/'+plz, {'datum' : datum} , function(data){

                console.log(data);

                // Pass our data to the template
                var theCompiledHtml = theTemplate(data);

                // Add the compiled html to the page
                $('.angebote-cards').html(theCompiledHtml);

                addEventListeners();

            });
        }


    }else{
        addDanger("Ungültige PLZ");
    }
}

