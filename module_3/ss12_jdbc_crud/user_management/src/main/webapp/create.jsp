<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/30/2022
  Time: 11:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User management apllication</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="users?action=users">List All User</a>
    </h2>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>Add new User</caption>
            <tr>
                <th>User Name: </th>
                <td>
                    <input type="text" name="name" id="name" size="45">
                </td>
            </tr>
            <tr>
                <th>User Email: </th>
                <td>
                    <input type="text" name="email" id="email" size="45">
                </td>
            </tr>
            <tr>
                <th>User Country: </th>
                <td>
                    <input type="text" name="country" id="country" size="45">
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save">
                </td>
            </tr>

        </table>

    </form>

</div>

</body>
</html>
