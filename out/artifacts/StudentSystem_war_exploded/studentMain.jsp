<%--
  Created by IntelliJ IDEA.
  User: 11360
  Date: 2020/12/20
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生主页</title>
</head>
<body>
<h3>${nowUser},同学你好，欢迎登陆南昌航空大学成绩查询系统<a href="logoutController">【注销登陆】</a></h3>
    <ul>
        <li><a href="listStudentGrade">课程成绩查询</a></li>
        <li><a href="#">已收留言</a></li>
    </ul>
</body>
</html>
