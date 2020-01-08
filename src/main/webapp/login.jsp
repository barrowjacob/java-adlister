<%--
  Created by IntelliJ IDEA.
  User: jasminsjacob
  Date: 1/7/20
  Time: 2:08 PM
  To change this template use File | Settings | File Templates.

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <form action="./login.jsp" method="POST">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            <button type="submit">Login!</button>
        </form>
    <h1>Testing!!!!! </h1>

    <%--    <c:param name="username" value="${param.username}"></c:param>--%>
    <%--    <c:param name="password" value="${param.password}"></c:param>--%>

        <c:choose>
            <c:when test="${param.username.equalsIgnoreCase('admin') && param.password.equalsIgnoreCase('password')}">
                <c:redirect url="profile.jsp">
                </c:redirect>
            </c:when>
            <c:otherwise>
                <c:out value="redirect failed for username: ${param.username}" />
            </c:otherwise>
        </c:choose>

    </body>
</html>
