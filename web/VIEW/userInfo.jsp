
<%@ page import="carSystem.Info.userInfo" %>
<%--
  Created by IntelliJ IDEA.
  User: shuaiyuhao
  Date: 2017/12/20
  Time: 下午7:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style type="text/css">@import url(../css/simpleGridTemplate.css);</style>
    <style type="text/css">@import url(../css/Style.css);</style>
    <%--<link href="../css/simpleGridTemplate.css" rel="stylesheet" type="text/css">--%>
    <%--<link href="../css/Style.css" rel="stylesheet" type="text/css">--%>
    <script type="text/javascript">

    </script>
</head>
<body>
<div class="container">
<% userInfo userinfo= (userInfo)session.getAttribute("userInfo");%>
    <header class="header" style="opacity: 0.7; filter:Alpha(Opacity=50, Style=0)">
        <div class="nav" style="opacity: 0.7; filter:Alpha(Opacity=50, Style=0)">
            <ul>
                <li><a href="/index" title="首页">首页</a></li>
                <li><a href="" title="关于我们">关于我们</a></li>
                <li><a href="" title="联系我们">联系我们</a></li>
                <li><a href="/login" title="登录"><%=userinfo.getuserName()%></a></li>

            </ul>


        </div>
    </header>

    <div class="gallery" style="opacity: 0.9; filter:Alpha(Opacity=50, Style=0)">
        <div class=" thumbnail">
            <P>姓名： TTT</P>
            <p>性别：male</p>
            <p>余额：</p>
            <p>手机号码：12345678</p>

        </div>
    </div>

    <footer id="contact" style="opacity: 0.6; filter:Alpha(Opacity=50, Style=0)">
        <p class="hero_header">滴滴没车系统</p>
        <div class="button" style="opacity: 0.6; filter:Alpha(Opacity=50, Style=0)">EMAIL ME </div>
    </footer>
    <!-- Copyrights Section -->
    <div class="copyright" style="opacity: 0.3; filter:Alpha(Opacity=50, Style=0)">&copy;2017 - <strong>SHUAIYUAHO</strong></div>
</div>

</body>
</html>
