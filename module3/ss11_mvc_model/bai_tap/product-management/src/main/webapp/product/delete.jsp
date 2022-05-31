<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/31/2022
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting product</title>
</head>
<body>
<h1>Delete product</h1>
<p>
    <a href="/customers">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
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
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/peoducts">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</body>
</html>
