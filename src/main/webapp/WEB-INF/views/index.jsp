<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: pcborty
  Date: 09-Jun-18
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form:form modelAttribute="patient" method="post">
      <form:input path="name"/>
      <button type="submit">Save</button>
    </form:form>
  </body>
</html>
