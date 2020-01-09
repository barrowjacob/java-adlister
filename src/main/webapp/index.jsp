<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show All Products</title>
</head>
<body>
    <c:forEach var="product" items="${productList}">
        <h1>Name: ${product.name}</h1>
        <h3>Price: ${product.price}</h3>
</body>
</html>
