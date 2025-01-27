<%-- 
    Document   : new
    Created on : Jan 23, 2025, 12:28:42?PM
    Author     : lenovo
--%>
<%@page contentType="text/html" %>
<jsp:useBean id="std" class="beans.Student"/>

<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:setProperty name="std" property="name" value="Ram"/> 
            <jsp:setProperty name="std" property="address" value="Chitwan"/> 
            <jsp:setProperty name="std" property="contact" value="98"/> 
            <jsp:setProperty name="std" property="email" value="test@test.com"/> 
            
            <h4><jsp:getProperty name="std" property="name"/>   </h4>
            <h4><jsp:getProperty name="std" property="address"/>   </h4>
            <h4><jsp:getProperty name="std" property="contact"/>   </h4>
            <h4><jsp:getProperty name="std" property="email"/>   </h4>
    </body>
</html>
