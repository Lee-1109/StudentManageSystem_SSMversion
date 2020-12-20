<%--
  Created by IntelliJ IDEA.
  User: 11360
  Date: 2020/12/20
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加教师信息</title>
</head>
<body>
<form action="addTeacherController">
    <table>
        <tr><td>工号:</td><td><input type="text" name="teacherId" placeholder="请输入工号"/></td></tr>
        <tr><td>姓名:</td><td><input type="text" name="teacherName" placeholder="请输入姓名"/></td></tr>
        <tr><td>任教专业:</td><td><input type="text" name="majorId" placeholder="请输入任教专业"/></td></tr>
        <tr><td>性别:</td>
            <td>
            <select name="gender">
            <option value="0">女</option>
            <option value="1">男</option>
            </select>
            </td>
        </tr>
        <tr><td> 年龄:</td><td><input type="number" name="age" placeholder="请输入年龄"/></td></tr>
        <tr><td><input type="submit" name="submit" value="添加"/></td>
            <td><input type="reset" value="重置"/></td>
        </tr>
    </table>
</form>
</body>
</html>
