<%--
  Created by IntelliJ IDEA.
  User: 11360
  Date: 2020/12/19
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 引入jstl core库 ，使用 循环标签-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- 引入jstl fmt库，格式化时间标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--<!-- 开启 EL 表达式支持 -->--%>
<%--<%@ page isELIgnored="false"%>--%>
<html>
<head>
    <title>管理员:学生信息管理</title>
</head>
<body>
<h2>学生信息管理</h2><hr>
<form method="post" action="findStudentByCondition">
    <input name="condition"  type="text" placeholder="请输入班级/学号/专业名称 用以查询学生详细信息"/>
    <input type="submit" alt="查询"/>
</form>
<table>
    <tr>
        <td>班级</td><td>学号</td><td>姓名</td><td>年龄</td><td>性别</td><td colspan="2">操作</td>
    </tr>
<c:forEach items="${studentList}" var="student">
    <tr>
        <td>${student.classes}</td>
        <td>${student.id}</td>
        <td>${student.name}</td>
        <td>${student.age}</td>
        <c:if test="${student.gender == true}">
            <td>男</td>
        </c:if>
        <c:if test="${student.gender == false}">
            <td>女</td>
        </c:if>
        <td><a href="deleteStudent?studentId=${student.id}">删除</a></td>
        <td><a href="updateStudent.jsp?student=${student}">修改</a></td>
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
