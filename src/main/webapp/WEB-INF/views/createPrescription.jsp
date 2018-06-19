<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  Admin: pcborty
  Date: 12-Jun-18
  Time: 8:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><fmt:message key="label.register"/></title>
</head>
<body>

<form:form modelAttribute="prescription" method="post">
    <div class="jumbotron">
        <div class="row">
            <div class="col-xs-3">
                <legend>Miscellaneous</legend>
                <div class="form-group">
                    <label>Disease/ Condition/ Dx</label>
                    <form:input path="dx" cssClass="form-control"/>
                    <form:errors path="dx" cssClass="error"/>
                </div>

                <div class="form-group">
                    <label>C/C</label>
                    <form:textarea path="cc" cssClass="form-control"/>
                    <form:errors path="cc" cssClass="error"/>
                </div>

                <div class="form-group">
                    <label>O/E</label>
                    <form:textarea path="oe" cssClass="form-control"/>
                    <form:errors path="oe" cssClass="error"/>
                </div>

                <div class="form-group">
                    <label>lx</label>
                    <form:textarea path="lx" cssClass="form-control"/>
                    <form:errors path="lx" cssClass="error"/>
                </div>

                <div class="form-group">
                    <label>Advice (Ctrl+m to switch to bangla)</label>
                    <form:textarea path="advice" cssClass="form-control bangla"/>
                    <form:errors path="advice" cssClass="error"/>
                </div>
            </div>

            <div class="col-xs-6">
                <legend>Prescription body</legend>
                <form:textarea path="prescriptionBody" id="jqte"/>
                <form:errors path="prescriptionBody" cssClass="error"/>

                <div class="pull-left">
                    <button type="button" class="btn btn-danger" onclick="$('#jqte').jqteVal('');">
                        <i class="fas fa-times"></i> Clear All</button>
                </div>
                <div class="pull-right">
                    <button type="button" class="btn btn-success" data-toggle="modal" data-target="#med">
                        <i class="fas fa-plus"></i> Add medicine</button>
                </div>
            </div>

            <div class="col-xs-3">
                <legend>Patient</legend>
                <div class="form-group">
                    <form:select path="patient" cssClass="selectpicker" data-live-search="true">
                        <form:option value="0" label="---Please Select---"/>
                        <form:options items="${patients}" itemValue="id" itemLabel="name"/>
                    </form:select>
                </div>
                <form:errors path="patient" cssClass="error"/>
                <p style="font-size: 14px">Patient not in the list ? <a data-toggle="modal" data-target="#addPatient">Add one</a></p>

                <div class="pull-right">
                    <button type="submit" class="btn btn-primary">Save</button>
                </div>
            </div>
        </div>
    </div>
</form:form>

<div id="med" class="modal fade" role="dialog">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Add a medicine</h4>
            </div>

            <div class="modal-body">
                <div class="form-group">
                    <label>Medicine</label>
                    <div class="pull-right">
                        <button type="button" class="badge btn-primary" data-toggle="modal" data-target="#help">
                            <i class="fas fa-info"></i> Help</button>
                    </div>
                    <input type="text" class="form-control" id="medicine" placeholder="ajax autocomplete">
                </div>

                <div class="form-group">
                    <label>Dosage</label>
                    <input type="text" class="form-control" id="dosage">
                </div>

                <div>
                    <label>Duration</label>
                </div>

                <div class="row">
                    <div class="col-xs-6">
                        <input type="text" class="form-control" id="dur">
                    </div>

                    <div class="col-xs-6">
                        <div>
                            <input type="radio" name="optradio" value="Day(s)" checked="checked"> Day(s)
                        </div>
                        <div>
                            <input type="radio" name="optradio" value="Month(s)"> Month(s)
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-xs-6">
                        <div>
                            <label>Time</label>
                        </div>
                        <div>
                            <input type="radio" name="optradio2" value="Before meal"> Before meal
                        </div>
                        <div>
                            <input type="radio" name="optradio2" value="After meal"> After meal
                        </div>
                    </div>
                </div>
            </div>

            <div class="modal-footer">
                <button id="addMed" type="button" class="btn btn-success" data-dismiss="modal">Add</button>
            </div>
        </div>
    </div>
</div>

<div id="help" class="modal fade" role="dialog">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Lookup brand name</h4>
            </div>

            <div class="modal-body">
                <div class="form-group">
                    <label>Company</label>
                    <input type="text" placeholder="ajax autocomplete" class="form-control">
                </div>

                <div class="form-group">
                    <label>Generic name</label>
                    <input type="text" placeholder="ajax autocomplete" class="form-control">
                </div>

                <div>
                    <label>Medicines (dynamic)</label>
                </div>

                <div class="row">
                    <div class="col-xs-8">
                        <p>Seclo</p>
                    </div>
                    <div class="col-xs-4">
                        <p>500mg</p>
                    </div>
                </div>
            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>

<div id="addPatient" class="modal fade" role="dialog">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Add patient</h4>
            </div>

            <div class="modal-body">
                <form action="addPatient" method="post" name="patientForm">
                    <div class="form-group">
                        <label>Name</label>
                        <input type="text" name="name" class="form-control">
                    </div>

                    <div class="row">
                        <div class="col-xs-6">
                            <div class="form-group">
                                <label>Sex</label>
                                <input type="text" name="sex" class="form-control">
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>Address</label>
                        <textarea name="address" class="form-control"></textarea>
                    </div>

                    <div class="form-group">
                        <label>Phone no.</label>
                        <input type="text" name="phone" class="form-control">
                    </div>

                    <button id="patientSubmit" type="submit" class="btn btn-success">Add</button>
                </form>
            </div>
        </div>
    </div>
</div>

<link rel="stylesheet" href="<c:url value='/assets/css/jquery-te-1.4.0.css'/>">
<link rel="stylesheet" href="<c:url value='/assets/css/bootstrap-select.min.css'/>">
<style>
    a:hover {
        cursor: pointer;
    }
</style>
<script src="<c:url value='/assets/js/jquery-te-1.4.0.min.js'/>"></script>
<script src="<c:url value='/assets/js/bootstrap-select.min.js'/>"></script>
<script src="<c:url value='/assets/js/avro-v1.1.4.min.js'/>" type="text/javascript" charset="utf-8"></script>
<script src="<c:url value='/assets/js/prescription.js'/>"></script>
</body>
</html>
