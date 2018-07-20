$(function () {
    "use strict";

    $("#jqte").jqte();
    $('textarea.bangla').avro({ 'bangla': false });

    $("#addMed").click(function () {
        var medicine = $("#medicine").val();
        var dosage = $("#dosage").val();
        var duration = $("#dur").val() + " " + $("input[name=optradio]:checked").val();
        var when = $("input[name=optradio2]:checked").val();

        var textToBeAdded = "</p><b>" + medicine + "</b>..."
            + dosage + "..."
            + duration + "..."
            + when + "</p><br>";

        $("#jqte").jqteVal($("#jqte").val() + textToBeAdded);
    });
});