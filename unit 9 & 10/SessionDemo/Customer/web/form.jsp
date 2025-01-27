<%-- 
    Document   : form
    Created on : Jan 23, 2025, 12:44:54 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="std" class="beans.Customer"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="form.jsp" method="POST">
            id:-<input typ="text" name="id"/>
            Name:-<input typ="text" name="name"/>
            Address:-<input typ="text" name="address"/>
            
            <input type="submit" value="Submit" name="submit"/>
        </form>
        <%  
            String a = request.getParameter("id");
            String b = request.getParameter("name");
            String c = request.getParameter("address");
           
  
            %>
            <jsp:setProperty name="std" property="id" value="<%=a%>"/> 
            <jsp:setProperty name="std" property="name" value="<%=b%>"/> 
            <jsp:setProperty name="std" property="address" value="<%=c%>"/> 
          
             <h6><jsp:getProperty name="std" property="id"/>   </h6>
            <h4><jsp:getProperty name="std" property="name"/>   </h4>
            <h5><jsp:getProperty name="std" property="address"/>   </h5>
           
    </body>
</html>

