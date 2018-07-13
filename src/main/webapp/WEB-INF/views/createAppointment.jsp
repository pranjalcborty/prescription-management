<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pcborty
  Date: 13-Jul-18
  Time: 9:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Appointment</title>
</head>
<body>
    <form:form modelAttribute="appointment" method="post">
        <input type="hidden" name="id" value="${appointment.id}">
        <div class="row">
            <div class="col-xs-6 col-xs-offset-3">
                <div class="jumbotron">
                    <label><fmt:message key="label.patient"/></label>
                    <div class="form-group">
                        <form:select path="patient" cssClass="selectpicker" data-live-search="true">
                            <form:option value="0" label="---Please Select---"/>
                            <form:options items="${patients}" itemValue="id" itemLabel="name"/>
                        </form:select>
                    </div>

                    <label><fmt:message key="label.doctor"/></label>
                    <div class="form-group">
                        <form:select path="doctor" cssClass="selectpicker" data-live-search="true">
                            <form:option value="0" label="---Please Select---"/>
                            <form:options items="${doctors}" itemValue="id" itemLabel="name"/>
                        </form:select>
                    </div>

                    <div class="form-group">
                        <label>Appointment date</label>
                        <form:input path="appointmentDate"  placeholder="dd/MM/yyyy (eg. 31/05/1950)" type="text" class="form-control date"/>
                        <form:errors path="appointmentDate" class="error"/>
                    </div>

                    <div class="form-group">
                        <label>Primary investigation</label>
                        <form:textarea path="primaryInvestigation" type="text" class="form-control"/>
                        <form:errors path="primaryInvestigation" class="error"/>
                    </div>

                    <div class="form-group">
                        <label>Remarks</label>
                        <form:input path="remarks" type="text" class="form-control"/>
                        <form:errors path="remarks" class="error"/>
                    </div>

                    <div class="text-right">
                        <div class="form-group">
                            <button type="submit" class="btn btn-success">Save</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </form:form>
</div>

<link rel="stylesheet" href="<c:url value="/assets/css/bootstrap-datepicker3.css"/>">
<link rel="stylesheet" href="<c:url value='/assets/css/bootstrap-select.min.css'/>">

<script src="<c:url value="/assets/js/bootstrap-datepicker.min.js"/>"></script>
<script src="<c:url value='/assets/js/bootstrap-select.min.js'/>"></script>
<script>
    $(function () {
        "use strict";

        $(".date").datepicker({
            format: "dd/mm/yyyy",
            todayHighlight: true,
            autoclose: true
        });
    })
</script>
</body>
</html>
