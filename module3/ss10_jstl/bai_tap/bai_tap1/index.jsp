<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/30/2022
  Time: 7:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Title</title>
</head>
<body>
<table border="1" >
  <thead>Danh sách khách hàng</thead>
  <tr>
    <th>Name Customer</th>
    <th>Date</th>
    <th>Address</th>
    <th>Picture</th>
  </tr>
  <c:forEach var="temp" items="${listCustomer}">
    <tr>
      <td>${temp.name}</td>
      <td>${temp.date}</td>
      <td>${temp.address}</td>
      <td>
        <img src="${temp.picture}" width="50" alt="">
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
