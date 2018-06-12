<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: pcborty
  Date: 10-Jun-18
  Time: 10:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><fmt:message key="label.register"/></title>
</head>
<body>
<div class="row">
    <div class="col-xs-6 col-xs-offset-3">
        <div class="jumbotron">
            <h3 class="text-center"><fmt:message key="label.signup"/></h3>

            <div class="error text-center">
                <form:errors path="user"/>
            </div>

            <form:form modelAttribute="admin" method="post">
                <div class="form-group">
                    <label><fmt:message key="label.userName"/></label>
                    <form:input path="userName" type="text" class="form-control"/>
                    <form:errors path="userName" class="error"/>
                </div>

                <div class="form-group">
                    <label><fmt:message key="label.name"/></label>
                    <form:input path="name" type="text" class="form-control"/>
                    <form:errors path="name" class="error"/>
                </div>

                <div class="form-group">
                    <label><fmt:message key="label.email"/></label>
                    <form:input path="email" type="text" class="form-control"/>
                    <form:errors path="email" class="error"/>
                </div>

                <div class="form-group">
                    <label><fmt:message key="label.password"/></label>
                    <form:input path="password" type="password" class="form-control"/>
                    <form:errors path="password" class="error"/>
                </div>

                <div class="form-group">
                    <label><fmt:message key="label.phone"/></label>
                    <form:input path="phone" type="text" class="form-control"/>
                    <form:errors path="phone" class="error"/>
                </div>

                <button type="submit" class="btn btn-block btn-primary"><fmt:message key="label.register"/></button>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>
