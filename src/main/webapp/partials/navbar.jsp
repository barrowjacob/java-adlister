<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav>
    <ul>

        <c:choose>
            <c:when test="${isLoggedIn}">
                <li>Adlister</li>
                <li>Categories</li>
                <li>New Ad</li>
                <li>Profile</li>
                <li>Log Out</li>
            </c:when>
            <c:otherwise>
                <li>Adlister</li>
                <li>Categories</li>
                <li>New Ad</li>
                <li>Register</li>
            </c:otherwise>
        </c:choose>
    </ul>
</nav>

<%--<c:if test="${isLoggedIn}">--%>
<%--    <h1>WHOA!</h1>--%>
<%--</c:if>--%>