<%--
  Created by IntelliJ IDEA.
  User: 11360
  Date: 2020/12/20
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>admin:添加课程</title>
</head>
<body>
<form action="addCourseController" method="post">
    <table>
        <tr><td>课程号:</td><td><input type="text" name="courseId" placeholder="请输入课程号"/></td></tr>
        <tr><td>课程名称:</td><td><input type="text" name="courseName" placeholder="请输入课程名"/></td></tr>
        <tr><td>上课专业:</td><td><input type="text" name="majorId" placeholder="请输入上课专业代号"/></td></tr>
        <tr><td>教师工号:</td><td><input type="text" name="teacherId" placeholder="请输入上课教师工号"/></td></tr>
        <tr><td>学时:</td><td><input type="text" name="period" placeholder="请输入课程学时"/></td></tr>
        <tr><td>学分:</td><td><input type="text" name="credit" placeholder="请输入课程学分"/></td></tr>
        <tr><td><input type="submit" value="添加"></td><td><input type="reset" value="重置"/></td></tr>
    </table>
</form>
</body>
</html>
