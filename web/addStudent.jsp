<%--
  Created by IntelliJ IDEA.
  User: 11360
  Date: 2020/12/21
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>admin:学生添加</title>
</head>
<body>
<form action="addStudent" method="post">
    <table>
        <tr><td>学号:</td><td><input type="text" name="id" placeholder="请输入学号"/></td></tr>
        <tr><td>姓名:</td><td><input type="text" name="name" placeholder="请输入姓名"/></td></tr>
        <tr><td>班级</td><td><input type="text" name="classes" placeholder="请输入所属班级"/></td></tr>
        <tr><td>年龄:</td><td><input type="number" name="age" placeholder="请输入年龄"/></td></tr>
        <tr><td>性别:</td>
            <td>
                <select name="gender">
                    <option value="0">女</option>
                    <option value="1">男</option>
                </select>
            </td>
        </tr>
        <tr><td><input type="submit" name="submit" value="添加"/></td>
            <td><input type="reset" value="重置"/></td>
        </tr>
    </table>
</form>
</body>
</html>
