<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kinyua
  Date: 5/8/15
  Time: 3:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table>
<tr><td><b>First name</b></td><td><b>last name</b></td><td><b>birth date</b></td></tr>
<c:forEach var ="list" items="${patientList}">
  <tr><td>${list.fname} </td> <td> ${list.last_name}</td> <td>${list.dob} </td></tr>
</c:forEach>
  </table>
</body>
</html>
