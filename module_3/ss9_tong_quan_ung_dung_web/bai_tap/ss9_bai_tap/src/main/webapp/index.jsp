<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/27/2022
  Time: 9:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
 <h2>Product Discount Calculator</h2>
  <form method="post" action="/display-discount">
    <label>Mô tả sản phẩm: </label> <br/>
    <input type="text"  name="des" placeholder="mô tả sản phẩm"> <br/>
    <label>Giá niêm yết sản phẩm: </label> <br/>
    <input type="text" name="price" > <br/>
      <label>Tỷ lệ chiết khấu %: </label> <br/>
      <input type="text" name="percent"> <br/>
      <input type="submit" id="submit" value="Calculate Discount">
  </form>
  <h1>Discount Amount : ${discountAmount}</h1>
  <h1>Discount Price : ${discountPrice}</h1>

  </body>
</html>
