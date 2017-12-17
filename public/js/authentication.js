$(document).ready(function(){


    $("#register-form").submit(function(e){
        e.preventDefault();
        e.stopPropagation();
        if ($("#register-form")[0].checkValidity()) {
            $('#modal-wait').modal('show');

            var postData = {
                'name': $('#name').val(),
                'email': $('#email').val(),
                'benutzername': $('#benutzername').val(),
                'passwort': $('#passwort').val(),
                'plz': $('#plz').val(),
                'strasse': $('#strasse').val(),
                'ort': $('#ort').val()
            };

            $.post('/signup', postData, function (data) {
                console.log(data);
                $('#modal-wait').modal('hide');
                addSuccess("Erfolgreich registriert. <a href='/'>Zurück zur Startseite </a>");
            })
                .fail(function (jqXHR, textStatus) {
                    $('#modal-wait').modal('hide');
                    console.log(jqXHR);
                    console.log(textStatus);
                    addDanger(jqXHR.responseText);
                });
        }
        $('#register-form')[0].classList.add('was-validated');

    });

    $("#login-form").submit(function(e){
        e.preventDefault();
        e.stopPropagation();
        if ($("#login-form")[0].checkValidity()) {
            $('#modal-wait').modal('show');

            var postData = {
                'email': $('#email').val(),
                'passwort': $('#passwort').val()
            };

            $.post('/login', postData, function (data) {
                console.log(data);
                $('#modal-wait').modal('hide');
                addSuccess("Erfolgreich eingeloggt. <a href='/'>Zurück zur Startseite </a>");
            })
                .fail(function (jqXHR, textStatus) {
                    $('#modal-wait').modal('hide');
                    console.log(jqXHR);
                    console.log(textStatus);
                    addDanger(jqXHR.responseText);
                });
        }
        $('#login-form')[0].classList.add('was-validated');

    });

});