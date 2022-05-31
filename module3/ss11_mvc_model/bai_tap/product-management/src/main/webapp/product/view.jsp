<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/31/2022
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["customer"].getNameProduct()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${requestScope["customer"].getPrice()}</td>
    </tr>
    <tr>
        <td>productDescription: </td>
        <td>${requestScope["customer"].getProductDescription()}</td>
    </tr>
    <tr>
        <td>Factory: </td>
        <td>${requestScope["customer"].getFactory()}</td>
    </tr>
</table>
</body>
</html>