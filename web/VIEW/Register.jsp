<%--
  Created by IntelliJ IDEA.
  User: shuaiyuhao
  Date: 2017/12/20
  Time: 下午7:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <%--<link rel="stylesheet" type="text/css" href="../css/login.css">--%>
    <style type="text/css">@import url(../css/login.css);</style>
    <script src="jquery/jquery-3.1.1.js"></script>
    <script type="text/javascript">
        function Check() {
            var password = document.getElementById("passWord").value;
            var repassword = document.getElementById("repassWord").value;
            if(password != repassword){
                window.alert("密码不一致！");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<div id="login">
    <h1>Create Account</h1>
    <form action="/userRegister" method="post" onsubmit="return Check(this)">
        <input type="text" placeholder="用户名" name="userName" >
        <input type="text" placeholder="密码" name="passWord" id="passWord">
        <input type="text" placeholder="确认密码" name="repassword" id="repassWord">
        <button type="submit" class="but" >提交</button><button class="but" type="button" onclick="location.href='/login'">返回登录页</button>

    </form>
</div>
</body>
</html>