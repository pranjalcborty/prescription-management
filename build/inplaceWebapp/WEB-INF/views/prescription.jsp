<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pcborty
  Date: 14-Jun-18
  Time: 12:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Prescription</title>
</head>
<body>
<div class="jumbotron">
    <div class="table-responsive">
        <table id="dataTable" class="table table-bordered">
            <thead>
            <tr>
                <th>Patient Id</th>
                <th>Patient Name</th>
                <th>Doctor Name</th>
                <th>Prescription Date</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${prescriptions}" var="prescription">
                <tr data-url="<c:url value='/createPrescription?prescriptionId=${prescription.id}'/>">
                    <td><c:out value="${prescription.patient.regNum}"/></td>
                    <td><c:out value="${prescription.patient.name}"/></td>
                    <td><c:out value="${prescription.doctor.name}"/></td>
                    <td><c:out value="${prescription.createdOn}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <a href="<c:url value='/createPrescription'/>" class="btn btn-success"><i class="fa fa-plus"></i> Create prescription</a>
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
