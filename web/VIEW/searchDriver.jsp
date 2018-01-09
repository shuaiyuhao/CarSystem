
<%@ page import="carSystem.Info.userInfo" %>
<%--
  Created by IntelliJ IDEA.
  User: shuaiyuhao
  Date: 2017/12/20
  Time: 下午7:52
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style type="text/css">@import url(../css/simpleGridTemplate.css);</style>
    <style type="text/css">@import url(../css/Style.css);</style>
    <style type="text/css">@import url(../css/bootstrap-table.min.css);</style>
    <style type="text/css">@import url(../css/bootstrap.min.css);</style>
    <%--<link href="../css/simpleGridTemplate.css" rel="stylesheet" type="text/css">--%>
    <%--<link href="../css/Style.css" rel="stylesheet" type="text/css">--%>
    <script src="../js/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/bootstrap-table.js"></script>
    <script type="text/javascript">
        $('#table').bootstrapTable({
            url: 'data.json'
        });
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
        <div class="btn" style="opacity: 0.6; filter:Alpha(Opacity=50, Style=0)" onclick="location.href='/showForm'">查看乘客表单</div>
        <div class="btn" style="opacity: 0.6; filter:Alpha(Opacity=50, Style=0)" onclick="location.href='/showDriverForm'">查看司机表单</div>
        <form action="/SearchPassenger" method="post">
            <input type="text" class="text-center" name="keyword"><input type="submit" class="btn">
        </form>
        <table data-toggle="table" data-url="data.json">
            <tr>
                <td colspan="4" align="center">司机表单</td>

            </tr>
            <tr>
                <td>出发时间</td>
                <td>出发地点</td>
                <td>目的地</td>
                <td>座位数</td>
            </tr>

            <c:forEach items="${travelInfos}" var="travelInfos">
                <tr>
                    <td>${travelInfos.startDate}</td>
                    <td>${travelInfos.startPlace}</td>
                    <td>${travelInfos.endPlace}</td>
                    <td>${travelInfos.sitNum}</td>
                </tr>
            </c:forEach>
        </table>
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