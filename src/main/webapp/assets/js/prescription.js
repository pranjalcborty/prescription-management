$(function () {
    "use strict";

    $("#jqte").jqte();
    $('textarea.bangla').avro({ 'bangla': false });

    $("#addMed").click(function () {
        var medicine = $("#medicine").val();
        var dosage = $("#dosage").val();
        var duration = $("#dur").val() + " " + $("input[name=optradio]:checked").val();
        var when = $("input[name=optradio2]:checked").val();

        var textToBeAdded = "</p><b>" + medicine + "</b><br>"
            + dosage + "<br>"
            + duration + "<br>"
            + when + "</p><br>";

        $("#jqte").jqteVal($("#jqte").val() + textToBeAdded);
    });

    $("#patientSubmit").click(function (event) {
        event.preventDefault();

        $("input").next().remove();

        $.post({
            url: 'addPatient',
            data: $("form[name=patientForm]").serialize(),
            success: function (response) {
                if(response.validated){
                    parent.location.reload();
                }else{
                    $.each(response.errorMessages,function(key,value){
                        $('input[name='+key+']').after('<span class="error">'+value+'</span>');
                    });
                }
            }
        });
    })
});