<%--
  Created by IntelliJ IDEA.
  User: kinyua
  Date: 5/7/15
  Time: 11:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page session="true"%>
<html>
<head>
    <title></title>
</head>
<c:if test="${not empty error}">
  <div class="error">${error}</div>
</c:if>
<c:if test="${not empty msg}">
  <div class="msg">${msg}</div>
</c:if>
<body>
<form action="<c:url value='/enterDrug' />" method='POST'>
  <select name="pname" required>
    <c:forEach var ="list" items="${patientList}">
      <option value="${list.id}">${list.fname}</option>
    </c:forEach>
  </select>
<input type="text" placeholder="drug name" name="dname" >
<button> Add </button>
</form>
</body>
</html>