<%-- 
    Document   : new
    Created on : Jan 23, 2025, 12:45:39?PM
    Author     : lenovo
--%>

<%@page contentType="text/html" %>
<jsp:useBean id="std" class="beans.Customer"/>

<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:setProperty name="std" property="id" value="1"/> 
        <jsp:setProperty name="std" property="name" value="Ram"/> 
            <jsp:setProperty name="std" property="address" value="Chitwan"/> 
            
           
             <h4><jsp:getProperty name="std" property="id"/>   </h4>
            <h4><jsp:getProperty name="std" property="name"/>   </h4>
            <h4><jsp:getProperty name="std" property="address"/>   </h4>
           
           
    </body>
</html>
