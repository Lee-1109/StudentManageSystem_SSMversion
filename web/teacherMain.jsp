<%--
  Created by IntelliJ IDEA.
  User: 11360
  Date: 2020/12/18
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>当前用户:${nowUser},老师你好!欢迎使用南昌航空大学教务管理系统<a href="logoutController">【注销登陆】</a><hr></h3>
<div class="container">
    <ul>
        <li><a href="teacherListCourse">任教课程成绩录入系统</a></li>
        <li><a href="#">已收留言</a></li>
        <li><a href="#">公告</a></li>
    </ul>
</div>
</body>
</html>
