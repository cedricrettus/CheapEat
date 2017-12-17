$(document).ready(function() {

    /*Handlebars.registerHelper('if_eq', function(a, b, opts) {
        if (a == b) {
            return opts.fn(this);
        } else {
            return opts.inverse(this);
        }
    });
*/
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
        $('.active').removeClass("active");
        $(this).addClass("active");
        listAnfragen(templateAnfragen);

    });

    $('#link-angebote').click(function(){
        $('#anfragen-cards').empty();
        $('#bestellungen-cards').empty();
        $('.active').removeClass("active");
        $(this).addClass("active");
        listAngebote(templateAngebote);
    });

    $('#link-bestellungen').click(function(){
        $('#angebote-cards').empty();
        $('#anfragen-cards').empty();
        $('.active').removeClass("active");
        $(this).addClass("active");
        listBestellungen(templateBestellung);
    });



}); //document ready closing


function listAngebote(template){
    $.get('/me/angebote', function(data){

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
        addRateEventListener();

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
        addRateEventListener();

        addDenyAcceptEventListener();

    })

}

function addEditEventListener(){
    $('.button-edit').click(function(e){
       console.log("edit clicked");
    });
}

function addRateEventListener(){
    $('.button-rate').click(function(){
        $('#bewertungModal').modal('toggle');
        $('[id^=btn-bewertung]').data('id', $(this).data('id'));
        $('[id^=btn-bewertung]').data('token', $(this).data('token'));
        $('[id^=btn-bewertung]').data('who', $(this).data('who'));

        $('[id^=btn-bewertung]').click(function(){
            $('#modal-wait').modal('show');
            var postData = {
                'token' : $(this).data('token'),
                'who' : $(this).data('who'),
                'rating' : $(this).text()
            }
            $.post('/bestellung/'+ $(this).data('id') +'/bewertung', postData, function(data){
                $('#modal-wait').modal('hide');
                addSuccess("Bewertung abgegeben");
                setTimeout(function(){ location.reload(); }, 2000);

            }).fail(function (jqXHR, textStatus) {
                $('#modal-wait').modal('hide');
                console.log(jqXHR);
                console.log(textStatus);
                addDanger(jqXHR.responseText);
            });
        })
    });
}

function addDenyAcceptEventListener(){
    $('.button-accept').click(function(){
        $('#modal-wait').modal('show');
        $.post('/me/anfragen/' + $(this).data('id') + '/accept', function(data) {
            console.log(data);
            $('#modal-wait').modal('hide');
            setTimeout(function(){ location.reload(); }, 2000);
            addSuccess("Erfolgreich Aktzeptiert");
        })
            .fail(function (jqXHR, textStatus) {
                console.log(jqXHR);
                console.log(textStatus);
                addDanger(jqXHR.responseText);
            });
    });

    $('.button-deny').click(function(){
        $('#modal-wait').modal('show');
        $.post('/me/anfragen/' + $(this).data('id') + '/deny', function(data) {
            console.log(data);
            $('#modal-wait').modal('hide');
            addSuccess("Erfolgreich Abgelehnt");
            setTimeout(function(){ location.reload(); }, 2000);
        })
            .fail(function (jqXHR, textStatus) {
                $('#modal-wait').modal('hide');
                console.log(jqXHR);
                console.log(textStatus);
                addDanger(jqXHR.responseText);
            });
    });
}