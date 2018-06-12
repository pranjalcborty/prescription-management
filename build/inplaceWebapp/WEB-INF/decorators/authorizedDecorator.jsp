<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  Admin: pcborty
  Date: 09-Jun-18
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><decorator:title/></title>
    <link rel="icon" href="<c:url value='/assets/images/plus.ico'/>">
    <link rel="stylesheet" href="<c:url value='/assets/css/bootstrap.min.css'/>">
    <link rel="stylesheet" href="<c:url value='/assets/css/fontawesome-all.min.css'/>">
    <link rel="stylesheet" href="<c:url value='/assets/css/style.css'/>">
    <link href="<c:url value='/assets/webfonts/lora.css'/>" rel="stylesheet">
    <style>body {background-image: url("<c:url value='/assets/images/appointment.jpg'/>");}</style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-static-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="login">
                <i class="fas fa-notes-medical"></i><fmt:message key="label.title"/>
            </a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="<c:url value="/prescription"/>">Prescription</a></li>
                <li><a href="<c:url value="/patient"/>">Patient</a></li>
                <li><a href="<c:url value="/medicine"/>">Medicine</a></li>
                <li><a href="<c:url value="/appointment"/>">Appointment</a></li>

                <c:if test="${not isDoctor}">
                    <li><a href="<c:url value="/doctor"/>">Doctor</a></li>
                    <li><a href="<c:url value="/admin"/>">Admin</a></li>
                </c:if>

                <li><a href="<c:url value="/logout"/>">Logout</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="container-fluid">
    <decorator:body/>
</div>

<script src="<c:url value='/assets/js/jquery-3.3.1.min.js'/>"></script>
<script src="<c:url value='/assets/js/bootstrap.min.js'/>"></script>
<script src="<c:url value='/assets/js/script.js'/>"></script>
</body>
</html>
