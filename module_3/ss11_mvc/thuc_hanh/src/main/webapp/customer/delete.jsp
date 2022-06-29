<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/29/2022
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting customer</title>
</head>
<body>
<h1>Delete customer</h1>
<p>
    <a href="/customers">Back to customer list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["customer"].name}</td>
            </tr>
            <tr>
                <td>Email: </td>
                <td>${requestScope["customer"].email}</td>
            </tr>
            <tr>
                <td>Address: </td>
                <td>${requestScope["customer"].address}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete customer"></td>
                <td><a href="/customers">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>
</body>
</html>
