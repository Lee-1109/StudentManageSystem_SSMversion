<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11360
  Date: 2020/12/20
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>admin:课程信息管理页面</title>
</head>
<body>
<table>
    <tr>
        <td>学院编号</td>
        <td>开课学院名称</td>
        <td>开课专业代号</td>
        <td>开课专业</td>
        <td>教师工号</td>
        <td>教师姓名</td>
        <td>课程编号</td>
        <td>课程名称</td>
        <td>学时</td>
        <td>学分</td>
    </tr>
   <c:forEach items="${courseList}" var="course">
        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
