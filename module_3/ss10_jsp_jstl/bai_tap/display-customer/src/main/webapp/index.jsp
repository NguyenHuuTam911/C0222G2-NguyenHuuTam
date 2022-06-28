<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/27/2022
  Time: 3:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <style>
    .mid{
      text-align: center;
    }
  </style>
  <body>
  <h1 class="mid">Danh Sách Khách Hàng</h1>
  <table border="1" width="75%" style="margin: auto" >
<tr>
  <th>Tên</th>
  <th>Ngày Sinh</th>
  <th>Địa Chỉ</th>
  <th>Ảnh</th>
</tr>
    <c:forEach var="temp" items="${listCustomer}">
      <tr>
        <td>${temp.name}</td>
        <td>${temp.birthday}</td>
        <td>${temp.address}</td>
        <td>
          <img src="${temp.picture}" width="80px">
        </td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
