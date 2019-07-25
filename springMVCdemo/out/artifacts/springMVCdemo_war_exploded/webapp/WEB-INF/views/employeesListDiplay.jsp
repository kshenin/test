<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: evgeniy.kshenin
  Date: 18.07.2019
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee's list</title>
</head>
<body>
<h2>All Employee's in System</h2>

<table border="1">
    <tr>
        <th>Employee ID</th>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>

    <c:forEach items="${employees}" var="employee">
        <tr>
            <th>${employee.id}</th>
            <th>${employee.firstName}</th>
            <th>${employee.lastName}</th>
        </tr>
    </c:forEach>
</table>

</body>
</html>
