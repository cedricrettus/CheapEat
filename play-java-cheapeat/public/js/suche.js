$(document).ready(function() {

    $('#callModal').click(function(){
        $('#angebotModal').modal('toggle');
    });

    $('#angebotSubmit').click(function(){
        $('#angebotForm').submit();
    })

}); //document ready closing