<%-- 
    Document   : ageCalculator
    Created on : Sep 20, 2017, 9:55:40 PM
    Author     : 617702
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age next birthday</h1>
        <form action="ageCalculator" method="GET">
        <label>Enter your current age:</label>
        <input type="text" name="age" size="20" value="${age}">
        <input type="submit" value="Age next birthday">
        </form>
        ${message}
    </body>
</html>
