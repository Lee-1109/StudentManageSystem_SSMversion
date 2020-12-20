<%--
  Created by IntelliJ IDEA.
  User: 11360
  Date: 2020/12/20
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 引入jstl core库 ，使用 循环标签-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>admin:教师管理</title>
</head>
<body>
<h2>教师信息管理</h2><hr>
<form method="post" action="findTeacherByCondition">
    <input name="condition"  type="text" placeholder="请输入工号/任教专业等条件"/>
    <input type="submit" alt="查询"/>
</form>
<br><a href="addTeacher.jsp">添加教师</a><br>
<table>
    <tr>
        <td>学院编号</td><td>学院名称</td><td>任教专业编号</td><td>任教专业</td>
        <td>教师工号</td><td>教师姓名</td><td>性别</td><td>年龄</td><td colspan="2">操作</td>
    </tr>
    <c:forEach items="${teacherList}" var="t">
        <tr>
            <td>${t.insId}</td>
            <td>${t.insName}</td>
            <td>${t.majorId}</td>
            <td>${t.majorName}</td>
            <td>${t.teacherId}</td>
            <td>${t.teacherName}</td>
            <c:if test="${t.gender == true}">
                <td>男</td>
            </c:if>
            <c:if test="${t.gender == false}">
                <td>女</td>
            </c:if>
            <td>${t.age}</td>
            <td><a href="deleteTeacherController?teacherId=${t.teacherId}">删除</a></td>
            <td><a href="updateTeacher.jsp?teacher=${t}">修改</a></td>
        </tr>
    </c:forEach>
</table>
<a href="adminMain.jsp">返回主页</a>
<a href="">首页</a>
<a href="">上一页</a>
<a href="">下一页</a>
<a href="">尾页</a>
</body>
</html>
