<%-- 
    Document   : display
    Created on : Jan 22, 2025, 12:41:29 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Interest Result</title>
</head>
<body>
 <!DOCTYPE html>
<html>
<head>
    <title>Simple Interest Result</title>
</head>
<body>
    <h1>Simple Interest Calculation Result</h1>
    <p>Principal: <%= request.getAttribute("principal") %></p>
    <p>Rate of Interest: <%= request.getAttribute("rate") %>%</p>
    <p>Time: <%= request.getAttribute("time") %> years</p>
    <p><b>Simple Interest: <%= request.getAttribute("simpleInterest") %></b></p>
</body>
</html>

</body>
</html>

