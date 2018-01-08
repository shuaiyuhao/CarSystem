<%@ page import="carSystem.Info.userInfo" %><%--
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
    <%
        // 获取提示信息
        String info = (String)request.getAttribute("info");
        // 如果提示信息不为空，则输出提示信息
        if(info != null){
            out.println(info);
        }
        // 获取登录的用户信息
        userInfo userinfo= (userInfo)session.getAttribute("userInfo");
        // 判断用户是否登录
        if(userinfo != null){
    %>
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
        <div class="thumbnail"> <a href="/pasMessage"><img src="../image/car.png" alt="" width="1500" class="cards"/></a>
            <p class="tag">我要叫车！</p>
            <div style="text-align: left;"><font color="#b3b3b3">&nbsp; 填写您的出行信息来寻找顺风车</font></div>
        </div>
        <div class="thumbnail"> <a href="/driMessage"><img src="../image/user.png" alt="" width="2000" class="cards"/></a>
            <p class="tag">我要乘客！</p>
            <div style="text-align: left;"><font color="#b3b3b3">&nbsp; 填写您的出行信息来寻找乘客</font></div>
        </div>
        <div class="thumbnail"><a href="/showForm"><img src="../image/map.png" alt="" width="2000" class="cards"/></a>
            <p class="tag">查看当前顺风车</p>
            <div style="text-align: left;"><font color="#b3b3b3">&nbsp;点击查看当前可选顺风车</font></div>
        </div>
        <div class="thumbnail"> <a href="/userInfo"><img src="../image/user2.png" alt="" width="2000" class="cards"/></a>
            <p class="tag">我的信息</p>
            <div style="text-align: left;"><font color="#b3b3b3">&nbsp; 点击查看您的信息以及钱包余额</font></div>
        </div>

    </div>

    <footer id="contact" style="opacity: 0.6; filter:Alpha(Opacity=50, Style=0)">
        <p class="hero_header">滴滴没车系统</p>
        <div class="button" style="opacity: 0.6; filter:Alpha(Opacity=50, Style=0)">EMAIL ME </div>
    </footer>
    <!-- Copyrights Section -->
    <div class="copyright" style="opacity: 0.3; filter:Alpha(Opacity=50, Style=0)">&copy;2017 - <strong>SHUAIYUAHO</strong></div>
</div>
<%}else {
    out.print("对不起您还没有登录");
    }%>
</body>
</html>
