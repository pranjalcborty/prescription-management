<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pcborty
  Date: 13-Jun-18
  Time: 1:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Doctor</title>
</head>
<body>
<div class="jumbotron">
    <div class="table-responsive">
        <table id="dataTable" class="table table-bordered">
            <thead>
                <tr>
                    <th>Doctor Id</th>
                    <th>Name</th>
                    <th>Specialization</th>
                    <th>Contact no.</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${doctors}" var="doctor">
                    <tr>
                        <td><c:out value="${doctor.id}"/></td>
                        <td><c:out value="${doctor.name}"/></td>
                        <td><c:out value="${doctor.specialization}"/></td>
                        <td><c:out value="${doctor.phone}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <a href="<c:url value='/addDoctor'/>" class="btn btn-success"><i class="fa fa-plus"></i> Add doctor</a>
</div>

<script src="<c:url value='/assets/js/jquery.dataTables.min.js'/>"></script>
<script src="<c:url value='/assets/js/dataTables.bootstrap.min.js'/>"></script>
<script>
    $(function () {
        $("#dataTable").DataTable();
    })
</script>
</body>
</html>
