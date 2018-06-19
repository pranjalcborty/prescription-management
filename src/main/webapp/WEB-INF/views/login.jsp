<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  Admin: pcborty
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
            <div class="text-center">
                <h3><fmt:message key="label.login"/></h3>
            </div>

            <div class="error text-center">
                <form:errors path="loginUser"/>
            </div>

            <div>
                <form:form modelAttribute="loginUser" method="post">
                    <div class="form-group">
                        <label><fmt:message key="label.userName"/></label>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-user"></i></span>
                            <form:input path="userName" type="text" class="form-control"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label><fmt:message key="label.password"/></label>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                            <form:input path="password" type="password" class="form-control"/>
                        </div>
                    </div>

                    <div class="form-check">
                        <div>
                            <form:radiobutton path="doctor" value="true"/> Doctor
                        </div>
                        <div>
                            <form:radiobutton path="doctor" value="false"/> Admin
                        </div>
                    </div>

                    <div class="text-right">
                        <div class="form-group">
                            <button type="submit" class="btn btn-success">Log in</button>
                        </div>
                        <div class="form-group">
                            <p style="font-size: 14px">Do not have an account? <a href="<c:url value="/register"/>">Sign up</a></p>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
