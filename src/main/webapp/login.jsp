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
<%--                <c:otherwise>--%>
<%--                    <h1><c:out value="Please login."/></h1>--%>
<%--                </c:otherwise>--%>
            </c:choose>
            <form id="loginForm" class="form" action="./login.jsp" method="POST">
                <h1 class="display-4">Please login.</h1>
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input type="text" id="username" name="username" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" class="form-control" required>
                </div>
                <button type="submit" class="btn">Login!</button>
            </form>
        </div>
        <%@ include file="partials/scripts.jsp"%>

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