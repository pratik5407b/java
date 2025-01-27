
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <% 
               
                List<String[]> dataList = (List<String[]>) request.getAttribute("dataList");
                if (dataList != null) {
                  
                    for (String[] data : dataList) {
            %>
                <tr>
                    <td><%= data[0] %></td> <!-- Name -->
                    <td><%= data[1] %></td> <!-- DOB -->
                   
                   
                </tr>
                <br>
            <% 
                    }
                } else {
            %>
                <tr><td colspan="4">No data available.</td></tr>
            <% 
                }
            %>
    </body>
</html>