<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pcborty
  Date: 24-Jun-18
  Time: 9:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Patient</title>
</head>
<body>
<div class="jumbotron">
    <form:form modelAttribute="patient" method="post">
        <input type="hidden" name="id" value="${patient.id}">
        <div class="row">
            <div class="col-xs-6">
                <div class="form-group">
                    <label><fmt:message key="label.name"/></label>
                    <form:input path="name" type="text" class="form-control"/>
                    <form:errors path="name" class="error"/>
                </div>

                <div class="form-group">
                    <label><fmt:message key="label.address"/></label>
                    <form:textarea path="address" type="text" class="form-control"/>
                    <form:errors path="address" class="error"/>
                </div>

                <div class="row">
                    <div class="col-xs-6">
                        <div class="form-group">
                            <label><fmt:message key="label.dob"/></label>
                            <form:input path="dateOfBirth"  placeholder="dd/MM/yyyy (eg. 31/05/1950)" type="text" class="form-control date"/>
                            <form:errors path="dateOfBirth" class="error"/>
                        </div>
                    </div>
                    <div class="col-xs-6">
                        <label><fmt:message key="label.gender"/></label>
                        <div class="form-group">
                            <form:select path="sex" cssClass="selectpicker" data-live-search="true">
                                <form:option value="" label="---Please Select---"/>
                                <form:options items="${gender}"/>
                            </form:select>
                            <form:errors path="sex" class="error"/>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label><fmt:message key="label.phone"/></label>
                    <form:input path="phone" type="text" class="form-control"/>
                    <form:errors path="phone" class="error"/>
                </div>
            </div>
            <div class="col-xs-6">
                <div class="row">
                    <div class="col-xs-6">
                        <div class="form-group">
                            <label><fmt:message key="label.regNum"/></label>
                            <div class="input-group">
                                <form:input path="regNum" type="text" class="form-control" readonly="true"/>
                                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label><fmt:message key="label.regDate"/></label>
                            <form:input path="regDate" placeholder="dd/MM/yyyy (eg. 31/05/1950)" type="text" class="form-control date"/>
                            <form:errors path="regDate" class="error"/>
                        </div>
                        <div class="form-group">
                            <label><fmt:message key="label.regFee"/></label>
                            <form:input path="regFee" type="text" class="form-control"/>
                            <form:errors path="regFee" class="error"/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-xs-6">
                            <label><fmt:message key="label.bg"/></label>
                            <div class="form-group">
                                <form:select path="bloodGroup" cssClass="selectpicker" data-live-search="true">
                                    <form:option value="" label="---Please Select---"/>
                                    <form:options items="${blood}"/>
                                </form:select>
                                <form:errors path="bloodGroup" class="error"/>
                            </div>
                        </div>
                        <div class="col-xs-6">
                            <label><fmt:message key="label.religion"/></label>
                            <div class="form-group">
                                <form:select path="religion" cssClass="selectpicker" data-live-search="true">
                                    <form:option value="" label="---Please Select---"/>
                                    <form:options items="${religion}"/>
                                </form:select>
                                <form:errors path="religion" class="error"/>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-xs-12">
                        <div class="form-group">
                            <label><fmt:message key="label.remarks"/></label>
                            <form:input path="remarks" type="text" class="form-control"/>
                            <form:errors path="remarks" class="error"/>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="pull-right">
                <button type="submit" class="btn btn-success">
                    <i class="fas fa-save"></i> Save Patient</button>
            </div>
        </div>
    </form:form>
</div>

<link rel="stylesheet" href="<c:url value="/assets/css/bootstrap-datepicker3.css"/>">
<script src="<c:url value="/assets/js/bootstrap-datepicker.min.js"/>"></script>
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
