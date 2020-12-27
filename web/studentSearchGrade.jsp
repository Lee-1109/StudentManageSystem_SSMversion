<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--  引入sun的函数标签库  -->
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix ="fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生成绩查询页面</title>
</head>
<body>
<form action="getGradeByCourseName" method="post">
    查询条件:<input type="text" name="courseName" placeholder="请输入课程名查询成绩"/>
    <input type="submit" value="查询"/>
</form>
<hr>
<table>
    <tr>
        <td>课程号</td>
        <td>课程名</td>
        <td>成绩</td>
    </tr>
    <c:forEach items="${gradeList}" var="grade">
        <tr>
            <td>${grade.courseId}</td>
            <td>${grade.courseName}</td>
            <td>${grade.grade}</td>
        </tr>
    </c:forEach>
</table>
<c:if test="${empty courseId}">
    <h2>暂无结果</h2>
</c:if>
<c:if test="${!empty courseId}">
    <h4>课程号：${courseId}</h4><br>
    <h4>课程名：${courseName}</h4><br>
    <h4>学号:${studentId}</h4><br>
    <h4>姓名:${studentName}</h4><br>
    <h4>成绩：${courseGrade}</h4><br>
</c:if>
<a href="studentMain.jsp">返回主页</a>
</body>
</html>
