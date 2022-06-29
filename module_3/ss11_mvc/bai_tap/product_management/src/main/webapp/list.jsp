<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/29/2022
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Products</h1>
<p>
    <a href="/products?action=create">Create new Product</a>
</p>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Factory</th>
        <th>Delete</th>
        <th>Edit</th>
    </tr>
    <c:forEach var="product" items="${listProducts}">
        <tr>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
            <td>${product.factory}</td>
            <td><a href="/products?action=delete&id=${product.id}">Delete</a></td>
            <td><a href="/products?action=edit&id=${product.id}">Edit</a></td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
