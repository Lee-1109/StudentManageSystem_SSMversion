<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11360
  Date: 2020/12/19
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息更新页面</title>
</head>
<body>
<form action="updateStudent" method="post">
    <table>
        <tr><td>学号:</td><td><input type="text" name="id" value="${param.id}"/></td></tr>
        <tr><td>姓名:</td><td><input type="text" name="name" value="${param.name}"/></td></tr>
        <tr><td>班级</td><td><input type="text" name="classes" value="${param.classId}"/></td></tr>
        <tr><td>年龄:</td><td><input type="number" name="age" value="${param.age}"/></td></tr>
        <tr><td>性别:</td>
            <td>
                <select name="gender">
                    <c:if test="${param.gender == true}">
                        <option value="1" selected>男</option>
                        <option value="0">女</option>
                    </c:if>
                    <c:if test="${param.gender == false}">
                        <option value="0" selected>女</option>
                        <option value="1">男</option>
                    </c:if>
                </select>
            </td>
        </tr>
        <tr><td><input type="submit" name="submit" value="修改"/></td>
            <td><input type="reset" value="重置"/></td>
        </tr>
    </table>
</form>
</body>
</html>
