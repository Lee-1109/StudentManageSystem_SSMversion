<%--
  Created by IntelliJ IDEA.
  User: 11360
  Date: 2020/12/17
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆系统</title>
</head>
<body>
<h3>南昌航空大学教务信息管理系统</h3>
<h4>登陆</h4>
<div class="user">
    <form  action="loginController" method="post">
        <span id="loginSpan"></span>
        <table>
            <tr>
                <td><label>账 号:</label></td>
                <td>
                    <label>
                        <input class="input" type="text"  name="id" placeholder="用户名\手机号\邮箱"/>
                    </label>
                </td>
            </tr>
            <tr>
                <td><label>密 码:</label></td>
                <td><label>
                    <input class="input" type="password" name="password" placeholder="请输入密码"/>
                </label></td>
            </tr>
            <tr>
                <td><label>登陆类型:</label></td>
                <td>
                    <label>
                        <select  name="type">
                            <option value="0">学生</option>
                            <option value="1">教职工</option>
                            <option value="2">系统管理员</option>
                        </select>
                    </label>
                </td>
            </tr>
            <tr><td><input type="submit" name="user" value="登陆"/></td></tr>
        </table>
    </form>
</div>
</body>
</html>
