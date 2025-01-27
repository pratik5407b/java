<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student List</title>
</head>
<body>
    <h2>Student List</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>Date of Birth</th>
        </tr>

        <%
            // Get the list of students from the request
            List students = (List) request.getAttribute("students");

            // Check if the list is not empty
            if (students != null && !students.isEmpty()) {
                // Format date
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                // Loop through each student and display in table
                for (Object obj : students) {
                    Student student = (Student) obj; // Cast the object to Student
        %>
        <tr>
            <td><%= student.getId() %></td>
            <td><%= student.getName() %></td>
            <td><%= student.getAddress() %></td>
            <td><%= sdf.format(student.getDob()) %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr><td colspan="4">No data available</td></tr>
        <%
            }
        %>
    </table>
</body>
</html>
