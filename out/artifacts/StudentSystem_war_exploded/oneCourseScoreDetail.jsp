<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11360
  Date: 2020/12/21
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>详情</title>
</head>
<body>
<c:if test="${empty gradeList}">
    <h3>暂无内容</h3>
</c:if>
<c:if test="${!empty gradeList}">
    <h4>课程号：${gradeList[0].courseId}</h4>
    <h4>课程名：${gradeList[0].courseName}</h4>
    <form action="updateScore" method="post">
        <table>
            <tr><td>学号</td><td>姓名</td><td>成绩</td></tr>
            <c:forEach items="${gradeList}" var="g" varStatus="index">
                <tr>
                    <td><input type="text" name="studentList[${index.index}].studentId" value="${g.studentId}" readonly/></td>
                    <td><input type="text" value="${g.studentName}" readonly/></td>
                    <td><input type="number" name="studentList[${index.index}].grade" value="${g.grade}"/></td>
                </tr>
            </c:forEach>
            <!--传递课程号-->
            <tr><td><input type="hidden" name="courseId" value="${gradeList[0].courseId}"/></td>
                <td><input type="submit" value="批量提交"></td></tr>
        </table>
    </form>
</c:if>
</body>
</html>
