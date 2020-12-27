<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11360
  Date: 2020/12/27
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>部门信息管理</title>
</head>
<body>
当前位置:<a href="adminMain.jsp">主页</a>>>>>>>>组织部门管理<br>
<a href="addDepart.jsp">添加组织部门</a><br>
<form method="post" action="listDepartmentByCondition">
    <input name="condition"  type="text" placeholder="请输入部门查询条件"/>
    <input type="submit" alt="查询部门"/>
</form>
<c:if test="${empty departList}">
    <h3>暂无相关部门信息</h3>
</c:if>
<c:if test="${!empty departList}">
    <table>
        <tr>
            <td>学院编号</td>
            <td>学院名称</td>
            <td>专业代号</td>
            <td>专业名称</td>
            <td>班级号</td>
            <td colspan="2">操作</td>
        </tr>
        <c:forEach items="${departList}" var="d">
            <tr>
                <td>${d.insId}</td>
                <td>${d.insName}</td>
                <td>${d.majorId}</td>
                <td>${d.majorName}</td>
                <td>${d.classId}</td>
                <td><a href="#">变更部门</a></td>
                <td><a href="#">删除部门</a></td>
            </tr>
        </c:forEach>
    </table>
    <a href="">首页</a>
    <a href="">上一页</a>
    <a href="">下一页</a>
    <a href="">尾页</a>
</c:if>
</body>
</html>
