<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/29/2022
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Product</title>
</head>
<body>
<h1>Update Product</h1>

<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name" ></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="text" name="price" id="price" ></td>
            </tr>
            <tr>
                <td>Description:</td>
                <td><input type="text" name="des" id="des" ></td>
            </tr>
            <tr>
                <td>Factory:</td>
                <td><input type="text" name="factory" id="factory" ></td>
            </tr>

            <tr>
                <td><input type="submit" value="Update product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
