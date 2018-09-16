<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 9/6/2018
  Time: 11:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Shop Online</title>
    <link rel="stylesheet" href="css-admin_shoponline.css">
</head>
<body>
<header class="header"><h1>Manage Your Storage</h1></header>
<%
    if (session.getAttribute("username") != null) {
%>
<p>Username :<strong><%=session.getAttribute("username") %>
</strong></p>
<%
    }else{
        response.sendRedirect( request.getContextPath()+"/admin_login.jsp?error=0");
    }
%>
<div class="container_product">
    <div class="insert_product">
        <h2>Insert Product</h2>
        <form action="<%= request.getContextPath()%>/admin_shoponline" method="post">
            Name Product : <input class="input" type="text" name="name"><br>
            Type Product : <input class="input" type="number" name="type"> P:1 L:2 T:3 C:4 O:5<br>
            Number Product: <input class="input" type="number" name="number"><br>
            Price Product :<input class="input" type="number" name="price"><br>
            <div><input class="button_submit" type="submit" name="submit" value="SUBMIT"></div>
        </form>
        <div class="status_insert">
            <%
                if (request.getParameter("submit") != null && !request.getParameter("submit").isEmpty()) {
                    if(request.getAttribute("inserted") == null || !((Boolean)request.getAttribute("inserted"))){
                        out.println("<p>insertion fail</p>");
                    }else{
                        out.println("<p>insertion succeed</p>");
                    }
                }
            %>
        </div>
    </div>
    <div class="delete_product">
        <h2>Delete Product</h2>

    </div>
</div>
</body>
</html>
