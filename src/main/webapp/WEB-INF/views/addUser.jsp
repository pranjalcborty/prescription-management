<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pcborty
  Date: 14-Jun-18
  Time: 12:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="row">
    <div class="col-xs-6 col-xs-offset-3">
        <div class="jumbotron">
            <a href="<c:url value="/doctor"/>" class="btn btn-default"><i class="fa fa-arrow-left"></i><fmt:message key="label.back"/></a>
            <h3 class="text-center"><fmt:message key="label.signup"/></h3>

            <div class="error text-center">
                <form:errors path="user"/>
            </div>

            <form:form modelAttribute="user" method="post">
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

                <button type="submit" class="btn btn-block btn-primary"><fmt:message key="label.add"/></button>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>
