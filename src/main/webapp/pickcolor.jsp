<%--
  Created by IntelliJ IDEA.
  User: jasminsjacob
  Date: 1/8/20
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Your Color!</title>
</head>
<body>
    <form action="/redirectedcolor.jsp" method="POST">
        <label for="colors">Pick your favorite color:</label>
        <input type="color" name="colors" id="colors">
        <button type="submit">Submit!</button>
    </form>

</body>
</html>
