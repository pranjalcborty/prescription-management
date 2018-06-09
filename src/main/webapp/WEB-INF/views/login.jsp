<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: pcborty
  Date: 09-Jun-18
  Time: 7:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><fmt:message key="label.login"/></title>
</head>
<body>
<div class="row">
    <div class="col-xs-6 col-xs-offset-3">
        <div class="jumbotron">
            <h3 class="text-center"><fmt:message key="label.login"/></h3>

            <form:errors path="user"/>
            <form:form modelAttribute="user" method="post">
                <div class="form-group">
                    <label>Email</label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-user"></i></span>
                        <form:input path="userName" type="text" class="form-control"/>
                    </div>
                </div>

                <div class="form-group">
                    <label>Password</label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                        <form:input path="password" type="password" class="form-control"/>
                    </div>
                </div>

                <div class="row">
                    <div class="col-xs-6">
                        <button type="submit" class="btn btn-block btn-success">Log in</button>
                    </div>
                    <div class="col-xs-6">
                        <a href="<c:url value='register'/>" class="btn btn-block btn-primary">Register</a>
                    </div>
                </div>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>
