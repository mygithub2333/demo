<%--
  Created by IntelliJ IDEA.
  User: fwx
  Date: 2020/8/15
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="/login/login" method="post">
    <table>
        <tr><td>工号：</td><td><input type="text" name="workId"></td></tr>
        <tr><td>密码：</td><td><input type="password" name="password"></td></tr>
        <tr><td></td><td><input type="submit" value="登录"></td></tr>
    </table>

</form>
</body>
</html>
