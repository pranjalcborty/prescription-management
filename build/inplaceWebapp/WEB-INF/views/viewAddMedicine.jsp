<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: pcborty
  Date: 21-Jul-18
  Time: 9:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Medicines</title>
</head>
<body>
<div class="jumbotron">
    <div class="row">
        <div class="col-xs-9">
            <h4>Medicines</h4><br>
            <div class="table-responsive">
                <table id="dataTable" class="table table-bordered">
                    <thead>
                    <tr>
                        <th>Name</th>
                        <th>Generic name</th>
                        <th>Company</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${medicines}" var="medicine">
                        <tr>
                            <td><c:out value="${medicine.name}"/></td>
                            <td><c:out value="${medicine.genericName}"/></td>
                            <td><c:out value="${medicine.company}"/></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="col-xs-3">
            <form:form modelAttribute="medicine" method="post">
                <div class="form-group">
                    <label>Name</label>
                    <form:input path="name" type="text" class="form-control"/>
                    <form:errors path="name" class="error"/>
                </div>

                <div class="form-group">
                    <label>Generic name</label>
                    <form:input path="genericName" type="text" class="form-control"/>
                    <form:errors path="genericName" class="error"/>
                </div>

                <div class="form-group">
                    <label>Company</label>
                    <form:input path="company" type="text" class="form-control"/>
                    <form:errors path="company" class="error"/>
                </div>

                <div class="form-group">
                    <label><fmt:message key="label.remarks"/></label>
                    <form:input path="remarks" type="text" class="form-control"/>
                    <form:errors path="remarks" class="error"/>
                </div>

                <div class="text-right">
                    <button type="submit" class="btn btn-primary"><fmt:message key="label.add"/></button>
                </div>
            </form:form>
        </div>
    </div>
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
