<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 9/8/2018
  Time: 6:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGIN-ADMIN</title>
    <link rel="stylesheet" href="css-admin_login.css">
</head>
<body>
<div class="web-name"><h1>Manage Your Shop</h1></div>
<%
    if(request.getParameter("error") != null){
        out.print("<p style='color:red'>Check your username or password </p>");
    }
%>
<div class="header">
    <h2><strong>LOGIN HERE:</strong></h2>
</div>
<form action="<%= request.getContextPath()%>/admin_login" method="post">
    <div class="cover-input">ADMIN-USERNAME: <input class="input" type="text" name="username"></div>
    <div class="cover-input">ADMIN-PASSWORD: <input class="input" type="text" name="password"></div>
    <br>
    <input class="submit-button" type="submit" value="SUBMIT">
</form>
</body>
</html>
