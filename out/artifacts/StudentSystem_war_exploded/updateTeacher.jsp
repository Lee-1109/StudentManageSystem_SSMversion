<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11360
  Date: 2020/12/20
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>admin:更新教师信息</title>
</head>
<body>
<form action="updateTeacherController">
    <table>
        <tr><td>工号:</td><td><input type="text" name="teacherId" value="${param.teacherId}" readonly/></td></tr>
        <tr><td>姓名:</td><td><input type="text" name="teacherName" value="${param.teacherName}"/></td></tr>
        <tr><td>任教专业:</td><td><input type="text" name="majorId" value="${param.majorId}"/></td></tr>
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
        <tr><td> 年龄:</td><td><input type="number" name="age" value="${param.age}"/></td></tr>
        <tr><td><input type="submit" name="submit" value="修改"/></td>
            <td><input type="reset" value="重置"/></td>
        </tr>
    </table>
</form>
</body>
</html>
