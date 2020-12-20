<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11360
  Date: 2020/12/20
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>教师录入成绩</title>
</head>
<body>
<h2>已录入课程</h2><hr>
<c:if test="${empty enterCourseList}">
    <h3>暂无已录入课程</h3>
</c:if>
<c:if test="${! empty enterCourseList}">
    <table>
    <tr>
        <td>课程号</td>
        <td>课程名</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${enterCourseList}" var="course">
        <tr>
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td><a href="#">修改</a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>

<h2>未录入课程</h2><hr>
<c:if test="${empty enterCourseList}">
    <h3>暂无未录入课程</h3>
</c:if>
<c:if test="${! empty notEnterCourseList}">
    <table>
        <tr>
            <td>课程号</td>
            <td>课程名</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${notEnterCourseList}" var="course">
            <tr>
                <td>${course.courseId}</td>
                <td>${course.courseName}</td>
                <td><a href="#">录入</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
