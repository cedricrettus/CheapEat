//Template, das übersetzt wird
var theTemplateScript;
//übersetztes temlate
var theTemplate;
//HTML mit zugewiesenen daten
var theCompiledHtml;

$(document).ready(function() {

    //--------------handlebars.js initialisierung------------------
    // Grab the template script
    theTemplateScript = $("#angebote-template").html();

    // Compile the template
    theTemplate = Handlebars.compile(theTemplateScript);

    plz = getUrlParameter("plz");


    search(plz, null);
    //addEventListeners();

    $('#filter-form').submit(function (e) {
        e.preventDefault();
        plz = getUrlParameter('plz');
        datum = $('#filter-datum').val();
        search(plz, datum);

    });

    $('#filter-datum').change(function (e) {
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
            $('#modal-wait').modal('show');
            $.get('/search/'+plz, function(data){

                $('#modal-wait').modal('hide');
                console.log(data);

                // Pass our data to the template
                theCompiledHtml = theTemplate(data);

                // Add the compiled html to the page
                $('.angebote-cards').html(theCompiledHtml);

                addEventListeners();

            }).fail(function (jqXHR, textStatus) {
                $('#modal-wait').modal('hide');
                console.log(jqXHR);
                console.log(textStatus);
                addDanger(jqXHR.responseText);
            });
        }else{
            $('#modal-wait').modal('show');
            $.get('/search/'+plz, {'datum' : datum} , function(data){

                console.log(data);
                $('#modal-wait').modal('hide');

                // Pass our data to the template
                theCompiledHtml = theTemplate(data);

                // Add the compiled html to the page
                $('.angebote-cards').html(theCompiledHtml);

                addEventListeners();

            }).fail(function (jqXHR, textStatus) {
                $('#modal-wait').modal('hide');
                console.log(jqXHR);
                console.log(textStatus);
                addDanger(jqXHR.responseText);
            });;
        }


    }else{
        addDanger("Ungültige PLZ");
    }
}

