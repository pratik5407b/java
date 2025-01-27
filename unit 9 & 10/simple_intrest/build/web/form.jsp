<%-- 
    Document   : form
    Created on : Jan 22, 2025, 2:06:48 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    
    
    <body>
        <form method="post">
        <label for="number">Enter a number:</label>
        <input type="text" id="number" name="number" required>
        <button type="submit">Calculate Square Root</button>
    </form>
    
    <hr>

    <%
        
    String numberStr = request.getParameter("number");
    if (numberStr != null) { 
        double number = Double.parseDouble(numberStr); // This assumes the input is always valid
        double sqrt = Math.sqrt(number);
        out.println("<p>The square root of <strong>" + number + "</strong> is: <strong>" + sqrt + "</strong></p>");
    }
%>

    </body>
</html>
