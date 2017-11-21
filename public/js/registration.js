$(document).ready(function(){


    $("#register-form").submit(function(e){
        e.preventDefault();

        var postData = {
            'name' : $('#name').val(),
            'email' : $('#email').val(),
            'benutzername' : $('#benutzername').val(),
            'passwort' : $('#passwort').val(),
        }

        $.post('/signup', postData, function(data){
            console.log(data);
        });

    });



});