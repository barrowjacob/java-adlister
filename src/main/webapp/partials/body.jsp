<%--
  Created by IntelliJ IDEA.
  User: jasminsjacob
  Date: 1/8/20
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="main">
    <div class="ads">
        <%-- turn this into a list and add to list every time someone adds a new ad --%>
        <%= request.getParameter("picture")%>
        <%= request.getParameter("title")%>
        <%= request.getParameter("description")%>
    </div>
</div>
