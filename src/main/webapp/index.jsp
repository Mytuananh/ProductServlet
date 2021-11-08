<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/8/2021
  Time: 2:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ProductDisCountCalculator</title>
  </head>
  <body>
  <h2>Product DisCount Calculator</h2>
  <form action="/product" method="post">
    <label>Product Description:</label><br/>
    <input type="text" name="description" placeholder="Enter your word: "><br/>
    <label>List Price: </label><br/>
    <input type="text" name="price" placeholder="Enter your word: "><br/>
    <label>Discount Percent: </label><br/>
    <input type="text" name="percent" placeholder="Enter your word: "/><br/>
    <input type="submit" name="submit" value="Calculate Discount"/>

  </form>
  </body>
</html>
