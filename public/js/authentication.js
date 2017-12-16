$(document).ready(function(){


    $("#register-form").submit(function(e){
        e.preventDefault();
        if (this.checkValidity() === false) {
            e.stopPropagation();
        }else {
            var postData = {
                'name': $('#name').val(),
                'email': $('#email').val(),
                'benutzername': $('#benutzername').val(),
                'passwort': $('#passwort').val()
            };

            $.post('/signup', postData, function (data) {
                console.log(data);
                addSuccess("Erfolgreich registriert. <a href='/'>Zurück zur Startseite </a>");
            })
                .fail(function (jqXHR, textStatus) {
                    console.log(jqXHR);
                    console.log(textStatus);
                    addDanger(jqXHR.responseText);
                });
        }

    });

    $("#login-form").submit(function(e){
        e.preventDefault();
        if (this.checkValidity() === false) {
            e.stopPropagation();
        }else {
            var postData = {
                'email': $('#email').val(),
                'passwort': $('#passwort').val()
            };

            $.post('/login', postData, function (data) {
                console.log(data);
                addSuccess("Erfolgreich eingeloggt. <a href='/'>Zurück zur Startseite </a>");
            })
                .fail(function (jqXHR, textStatus) {
                    console.log(jqXHR);
                    console.log(textStatus);
                    addDanger(jqXHR.responseText);
                });
        }

    });



});