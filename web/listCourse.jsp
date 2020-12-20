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
<form method="post" action="findCourseByCondition">
    <input name="condition"  type="text" placeholder="请输入课程名/课程号/上课院系"/>
    <input type="submit" alt="查询"/>
</form>
<a href="addCourse.jsp">添加课程</a><br>
<c:if test="${empty courseList}">
    <h3>暂无课程信息</h3>
</c:if>
<c:if test="${!empty courseList}">
<table>
    <tr>
        <td>课程编号</td>
        <td>课程名称</td>
        <td>开课专业代号</td>
        <td>开课专业名称</td>
        <td>任教教师编号</td>
        <td>任课教师姓名</td>
        <td>学时</td>
        <td>学分</td>
        <td colspan="2">操作</td>
    </tr>
   <c:forEach items="${courseList}" var="course">
        <tr>
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td>${course.majorId}</td>
            <td>${course.majorName}</td>
            <td>${course.teacherId}</td>
            <td>${course.teacherName}</td>
            <td>${course.period}</td>
            <td>${course.credit}</td>
            <td><a href="#">删除</a></td>
            <td><a href="#">修改</a></td>
        </tr>
    </c:forEach>
</table>
    <a href="adminMain.jsp">返回主页</a>
    <a href="">首页</a>
    <a href="">上一页</a>
    <a href="">下一页</a>
    <a href="">尾页</a>
</c:if>
</body>
</html>
