<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: pcborty
  Date: 20-Jul-18
  Time: 12:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Prescribe test</title>
</head>
<body>
<form:form modelAttribute="test" method="post">
    <input type="hidden" name="id" value="${test.id}">
    <div class="row">
        <div class="col-xs-6 col-xs-offset-3">
            <div class="jumbotron">
                <label><fmt:message key="label.patient"/></label>
                <div class="form-group">
                    <form:select path="patient" cssClass="selectpicker" data-live-search="true">
                        <form:options items="${patients}" itemValue="id" itemLabel="name"/>
                    </form:select>
                </div>

                <div class="form-group">
                    <label>Primary investigation</label>
                    <form:textarea path="test" type="text" class="form-control"/>
                    <form:errors path="test" class="error"/>
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
</body>
</html>
