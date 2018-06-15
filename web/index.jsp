<%--
  Created by IntelliJ IDEA.
  User: Cathy
  Date: 2018/6/14
  Time: 0:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  我的第一個web網頁
  <hr>
  <a herf="/HelloServlet">Get方式請求HelloServlet</a>

  <form action="/UploadServlet" method="post">
    <input type="submit" value="Post方式請求HelloServlet">
  </form>
  </body>
</html>
