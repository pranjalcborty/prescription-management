<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: pcborty
  Date: 23-Jun-18
  Time: 8:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Patient</title>
</head>
<body>
<div class="jumbotron">
    <div class="table-responsive">
        <table id="dataTable" class="table table-bordered">
            <thead>
            <tr>
                <th>Patient Id</th>
                <th>Name</th>
                <th>Date of Birth</th>
                <th>Contact no.</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${patients}" var="patient">
                <tr data-url="<c:url value='/createPatient?patientId=${patient.id}'/>">
                    <td><c:out value="${patient.regNum}"/></td>
                    <td><c:out value="${patient.name}"/></td>
                    <fmt:formatDate value="${patient.dateOfBirth}" pattern="dd/MM/yyyy" var="birthDate"/>
                    <td><c:out value="${birthDate}"/></td>
                    <td><c:out value="${patient.phone}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <a href="<c:url value='/createPatient'/>" class="btn btn-success"><i class="fa fa-plus"></i> Add Patient</a>
</div>

<script src="<c:url value='/assets/js/jquery.dataTables.min.js'/>"></script>
<script src="<c:url value='/assets/js/dataTables.bootstrap.min.js'/>"></script>
<script>
    $(function () {
        $("#dataTable").DataTable();

        $("#dataTable tbody tr").click(function () {
            window.location.href = $(this).data("url");
        });
    })
</script>
</body>
</html>
