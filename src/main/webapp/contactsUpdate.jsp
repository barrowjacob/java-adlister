
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Your Contact</title>
</head>
<body>
<%--trying to create update contact form utilizing contact's id,
just haven't figured out how to do that yet--%>
    <h1>Update ${contact.firstName}'s Info:</h1>
    <form method="POST" action="/contacts">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName">
        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName">
        <label for="phoneNumber">Phone Number:</label>
        <input type="text" id="phoneNumber" name="phoneNumber">
        <button type="submit">Submit!</button>>
    </form>
</body>
</html>
