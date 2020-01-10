<%--
  Created by IntelliJ IDEA.
  User: jasminsjacob
  Date: 1/10/20
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contacts</title>
</head>
<body>
    <form method="POST" action="/contacts">
        <h1>Create a new contact:</h1>
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName">
        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName">
        <label for="phoneNumber">Phone Number:</label>
        <input type="text" id="phoneNumber" name="phoneNumber">
        <button type="submit">Submit!</button>
    </form>

    <c:forEach var="contact" items="${contacts}">
        <div>
            <h2>Name: ${contact.firstName} ${contact.lastName}</h2>
            <h3>Phone Number:${contact.phoneNumber}</h3>
        </div>
    </c:forEach>
</body>
</html>
