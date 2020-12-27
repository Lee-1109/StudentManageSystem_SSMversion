<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11360
  Date: 2020/12/27
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>录入成绩</title>
</head>
<body>

<c:if test="${!empty students}">
    <h4>课程号：${courseId}</h4>
    <form action="enterScore" method="post">
        <table>
            <tr><td>学号</td><td>姓名</td><td>成绩</td></tr>
            <c:forEach items="${students}" var="s" varStatus="index">
                <tr>
                    <td><input type="text" name="studentList[${index.index}].studentId" value="${s.id}" readonly/></td>
                    <td><input type="text" value="${s.name}" readonly/></td>
                    <td><input type="number" name="studentList[${index.index}].grade"/></td>
                </tr>
            </c:forEach>
            <!--传递课程号-->
            <tr><td><input type="hidden" name="courseId" value="${courseId}"/></td>
                <td><input type="submit" value="批量提交"></td></tr>
        </table>
    </form>
</c:if>
</body>
</html>
