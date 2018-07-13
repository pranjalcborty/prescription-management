<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pcborty
  Date: 13-Jul-18
  Time: 12:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Appointments</title>
</head>
<body>
<div class="jumbotron">
    <div class="table-responsive">
        <table id="dataTable" class="table table-bordered">
            <thead>
            <tr>
                <th>Patient Name</th>
                <th>Doctor Name</th>
                <th>Appointment Date</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${appointments}" var="appointment">
                <tr data-url="<c:url value='/createAppointment?appointmentId=${appointment.id}'/>">
                    <td><c:out value="${appointment.patient.name}"/></td>
                    <td><c:out value="${appointment.doctor.name}"/></td>
                    <td><c:out value="${appointment.appointmentDate}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <a href="<c:url value='/createAppointment'/>" class="btn btn-success"><i class="fa fa-plus"></i> Create appointment</a>
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
