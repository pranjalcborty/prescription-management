<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  Admin: pcborty
  Date: 12-Jun-18
  Time: 8:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><fmt:message key="label.register"/></title>
</head>
<body>
<form:form
<div class="jumbotron">
    <div class="row">
        <div class="col-xs-3">
            <legend>Miscellaneous</legend>
            <div class="form-group">
                <label>Disease/ Condition/ Dx</label>
                <input type="text" class="form-control">
            </div>

            <div class="form-group">
                <label>C/C</label>
                <textarea class="form-control"></textarea>
            </div>

            <div class="form-group">
                <label>O/E</label>
                <textarea class="form-control"></textarea>
            </div>

            <div class="form-group">
                <label>lx</label>
                <textarea class="form-control"></textarea>
            </div>

            <div class="form-group">
                <label>Advice (Ctrl+m to switch to bangla)</label>
                <textarea class="form-control bangla"></textarea>
            </div>
        </div>

        <div class="col-xs-6">
            <legend>Prescription body</legend>
            <textarea id="jqte"></textarea>

            <div class="pull-left">
                <button type="button" class="btn btn-danger" onclick="$('#jqte').jqteVal('');">
                    <i class="fas fa-times"></i> Clear All</button>
            </div>
            <div class="pull-right">
                <button type="button" class="btn btn-success" data-toggle="modal" data-target="#med">
                    <i class="fas fa-plus"></i> Add medicine</button>
            </div>
        </div>

        <div class="col-xs-3">
            <legend>Patient info</legend>
            <div class="form-group">
                <label>Name</label>
                <input type="text" class="form-control">
            </div>

            <div class="row">
                <div class="col-xs-6">
                    <div class="form-group">
                        <label>Age</label>
                        <input type="text" class="form-control">
                    </div>
                </div>
                <div class="col-xs-6">
                    <div class="form-group">
                        <label>Sex</label>
                        <input type="text" class="form-control">
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label>Address</label>
                <textarea class="form-control"></textarea>
            </div>

            <div class="form-group">
                <label>Phone no.</label>
                <input type="text" class="form-control">
            </div>
        </div>
    </div>
</div>
</body>
</html>
