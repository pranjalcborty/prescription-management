<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pcborty
  Date: 21-Jul-18
  Time: 11:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pathology Report</title>
</head>
<body>
<div class="row">
    <div class="col-xs-8 col-xs-offset-2">
        <div class="jumbotron">
            <form:form modelAttribute="report" method="post">
                <div class="form-group">
                    <label>Patient name</label>
                    <c:out value="${report.test.patient.name}"/>
                </div>
                <div class="form-group">
                    <label>Referred by</label>
                    <c:out value="${report.test.createdBy.name}"/>
                </div>

                <div>
                    <legend>Pathology report</legend>
                    <form:textarea path="reportBody" id="jqte"/>
                    <form:errors path="reportBody" cssClass="error"/>
                </div>
            </form:form>
        </div>
    </div>
</div>

<link rel="stylesheet" href="<c:url value='/assets/css/jquery-te-1.4.0.css'/>">
<script src="<c:url value='/assets/js/jquery-te-1.4.0.min.js'/>"></script>
<script>
    $(function () {
        "use strict";
        $("#jqte").jqte();
    });
</script>
</body>
</html>
