<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pcborty
  Date: 09-Jun-18
  Time: 12:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><fmt:message key="label.welcome"/></title>
</head>
<body>
<c:if test="${not empty appointments or not empty tests}">
    <script src="<c:url value='/assets/js/jquery.dataTables.min.js'/>"></script>
    <script src="<c:url value='/assets/js/dataTables.bootstrap.min.js'/>"></script>
</c:if>

<c:if test="${not empty appointments}">
    <div class="jumbotron">
        <h4>Appointments you have to take care of</h4><br>
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
                <c:forEach items="${appointments}" var="appointment">
                    <tr data-url="<c:url value='/createPrescription?appointmentId=${appointment.id}'/>">
                        <td><c:out value="${appointment.patient.regNum}"/></td>
                        <td><c:out value="${appointment.patient.name}"/></td>
                        <td><c:out value="${appointment.doctor.name}"/></td>
                        <td><c:out value="${appointment.createdOn}"/></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <script>
        $(function () {
            $("#dataTable").DataTable();

            $("#dataTable tbody tr").click(function () {
                window.location.href = $(this).data("url");
            });
        })
    </script>
</c:if>
<c:if test="${not empty tests}">
    <div class="jumbotron">
        <h4>Pending tests</h4><br>
        <div class="table-responsive">
            <table id="dTable" class="table table-bordered">
                <thead>
                <tr>
                    <th>Patient Id</th>
                    <th>Patient Name</th>
                    <th>Referred By</th>
                    <th>Referral Date</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${tests}" var="test">
                    <tr data-url="<c:url value='/createPathReport?testId=${test.id}'/>">
                        <td><c:out value="${test.patient.regNum}"/></td>
                        <td><c:out value="${test.patient.name}"/></td>
                        <td><c:out value="${test.createdBy.name}"/></td>
                        <td><c:out value="${test.createdOn}"/></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <style>
        #dTable {
            color: white;
        }
    </style>
    <script>
        $(function () {
            $("#dTable").DataTable();

            $("#dTable tbody tr").click(function () {
                window.location.href = $(this).data("url");
            });
        })
    </script>
</c:if>
</body>
</html>
