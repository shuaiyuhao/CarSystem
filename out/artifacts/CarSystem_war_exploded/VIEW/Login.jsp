<%--
  Created by IntelliJ IDEA.
  User: shuaiyuhao
  Date: 2017/12/20
  Time: 下午7:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="HandheldFriendly" content="true">
    <title>login</title>
    <%--<link rel="stylesheet" type="text/css" href="../css/login.css">--%>
    <style type="text/css">@import url(../css/login.css);</style>
    <!--<script type="text/javascript">-->
    <!--function Check() {-->
    <!--var username = $("#username").val();-->
    <!--var password = $("#password").val();-->
    <!--if(username === ""){-->
    <!--window.alert("用户名不能为空");-->
    <!--}-->
    <!--if(password === ""){-->
    <!--window.alert("密码不能为空")-->
    <!--}-->

    <!--}-->
    <!--</script>-->
</head>
<body>
<div id="login">
    <h1>Login</h1>
    <form  action="/userLogin" method="post" onsubmit="return Check(this)">
        <input type="text" placeholder="用户名" name="userName" id="username">
        <input type="text" placeholder="密码" name="passWord" id="password">
        <button class="but" type="submit">登录</button><button class="but" type="button" onclick="location.href='/register'">注册</button>
    </form>
</div>
</body>
</html>
