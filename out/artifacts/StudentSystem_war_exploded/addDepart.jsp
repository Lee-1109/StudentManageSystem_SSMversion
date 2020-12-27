<%--
  Created by IntelliJ IDEA.
  User: 11360
  Date: 2020/12/27
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加组织部门</title>
</head>
<body>
当前位置:<a href="adminMain.jsp">主页</a>>>>>>>><a href="listDepartment">组织部门管理</a> >>>>>添加组织部门
<form action="addCourseController" method="post">
    <table>
        <tr><td>班级编号:</td><td><input type="text" name="courseId" placeholder="请输入班级编号"/></td></tr>
        <tr><td>专业编号:</td><td><input type="text" name="courseName" placeholder="请输入专业编号"/></td></tr>
        <tr><td><input type="submit" value="添加"></td><td><input type="reset" value="重置"/></td></tr>
    </table>
</form>
</body>
</html>
