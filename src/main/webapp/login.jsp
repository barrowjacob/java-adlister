<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <head>
        <title>Login</title>
        <%@ include file="partials/head.jsp"%>
    </head>
    <body>
        <%@ include file="partials/navbar.jsp"%>
<%--         FIGURE OUT WHY USE SEMICOLON--%>
        <%! boolean isLoggedIn = true;%>
        <div>
            <c:choose>
                <c:when test="${param.username.equalsIgnoreCase('admin') && param.password.equalsIgnoreCase('password')}">
                    <c:redirect url="profile.jsp"/>
                </c:when>
                <c:otherwise>
                    <h1><c:out value="Please enter username and password"/></h1>
                </c:otherwise>
            </c:choose>
            <form class="form" action="./login.jsp" method="POST">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required>
                <br>
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
                <br>
                <button type="submit">Login!</button>
            </form>
        </div>
    </body>
</html>

<%--THINGS TO DO
    **make a reactive navbar that adds and takes away
    **  for navbar: remove register and login when logged in
    **  for navbar: make the link for adding an ad, but only
    **              allow users to make ads. (i.e., when not
    **              logged in, send to login page. When logged
    **              in, send to make an ad page.
    **make a reactive add ad page
    **make a reactive home page
    **make a reactive categories page
    **  for categories: show categories for created ads
    **  for categories: make arrayList that holds categories
    **make a reactive listings page
    **  for listings: make array of ads--%>