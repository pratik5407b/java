<%-- 
    Document   : input
    Created on : Jan 22, 2025, 12:39:31 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Interest Calculation</title>
</head>
<body>
    <h1>Simple Interest Calculator</h1>
    <form action="SimpleInterestServlet" method="POST">
        <label for="principal">Principal:</label>
        <input type="number" id="principal" name="principal" required><br><br>

        <label for="rate">Rate of Interest (%):</label>
        <input type="number" id="rate" name="rate" required><br><br>

        <label for="time">Time (years):</label>
        <input type="number" id="time" name="time" required><br><br>

        <input type="submit" value="Calculate">
    </form>
</body>
</html>

