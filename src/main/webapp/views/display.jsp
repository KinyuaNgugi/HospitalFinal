<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Kinyua
  Date: 08/05/15
  Time: 09:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>View Patient Drugs</title>
</head>

<h1 style="text-align: center">
  View Prescribed Drugs
</h1>
<h2>
  List of Patient Drugs
</h2>
<body>
<div class = "navbar navbar-default">Drugs List</div>
<table>
  <tr>
    <th>Drug ID</th>
    <th>Drug Name</th>
    <th>Patient ID</th>
  </tr>
  <c:forEach var="list"  items="${drugList}">
    <tr>
      <td>${list.id}</td>
      <td>${list.DName}</td>
      <td>${list.pid}</td>
    </tr>
  </c:forEach>
</table>

</body>
</body>
</html>


