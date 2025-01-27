<%-- 
    Document   : form
    Created on : Jan 23, 2025, 12:28:12 PM
    Author     : lenovo
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="std" class="beans.Student"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="form.jsp" method="POST">
            Name:-<input type="text" name="name"/>
            Address:-<input type="text" name="address"/>
            Contact:-<input type="text" name="contact"/>
            Email :- <input type="email" name="email"/>
            <input type="submit" value="Submit" name="submit"/>
        </form>
        <%
            String n = request.getParameter("name");
            String a = request.getParameter("address");
            String c = request.getParameter("contact");
            String e = request.getParameter("email");
            %>
            <jsp:setProperty name="std" property="name" value="<%=n%>"/> 
            <jsp:setProperty name="std" property="address" value="<%=a%>"/> 
            <jsp:setProperty name="std" property="contact" value="<%=c%>"/> 
            <jsp:setProperty name="std" property="email" value="<%=e%>"/> 
            
            <h4><jsp:getProperty name="std" property="name"/>   </h4>
            <h5><jsp:getProperty name="std" property="address"/>   </h5>
            <h6><jsp:getProperty name="std" property="contact"/>   </h6>
    </body>
</html>
