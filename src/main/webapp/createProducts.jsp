
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Products</title>
</head>
<body>
    <h1>Enter product information</h1>
    <form method="POST" action="index/create">
        <label for="productPrice">Price:</label>
        <input type="text" name="productPrice" id="productPrice">
        <label for="productName">Name:</label>
        <input type="text" name="productName" id="productName">
        <button type="submit">Submit</button>
    </form>
</body>
</html>
