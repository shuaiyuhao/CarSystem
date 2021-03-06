<%--
  Created by IntelliJ IDEA.
  User: shuaiyuhao
  Date: 2017/12/20
  Time: 下午7:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>输入乘客信息</title>
    <style type="text/css">@import url(../css/simpleGridTemplate.css);</style>
    <style type="text/css">@import url(../css/Style.css);</style>
    <style type="text/css">@import url(../css/normalize.css);</style>
    <style type="text/css">@import url(../css/default.css);</style>
    <style type="text/css">@import url(../css/set2.css);</style>
    <style type="text/css">@import url(../fonts/font-awesome-4.2.0/css/font-awesome.min.css);</style>
    <%--<link rel="stylesheet" type="text/css" href="../css/normalize.css" />--%>
    <%--<link rel="stylesheet" type="text/css" href="../fonts/font-awesome-4.2.0/css/font-awesome.min.css" />--%>
    <%--<link rel="stylesheet" type="text/css" href="../css/default.css">--%>
    <%--<link rel="stylesheet" type="text/css" href="../css/set2.css" />--%>
    <%--<link href="../css/simpleGridTemplate.css" rel="stylesheet" type="text/css">--%>
    <%--<link href="../css/Style.css" rel="stylesheet" type="text/css">--%>
</head>
<body>
<div class="container">
    <header class="header" style="opacity: 0.7; filter:Alpha(Opacity=50, Style=0)">
        <div class="nav" style="opacity: 0.7; filter:Alpha(Opacity=50, Style=0)">
            <ul>
                <li><a href="/index" title="首页">首页</a></li>
                <li><a href="" title="关于我们">关于我们</a></li>
                <li><a href="" title="联系我们">联系我们</a></li>
                <li><a href="/login" title="登录">登录</a></li>

            </ul>
        </div>
    </header>
    <div class="gallery" style="opacity: 0.9; filter:Alpha(Opacity=50, Style=0)">
        <form action="/pasTravel" method="post">
            <section class="jq22-content bgcolor-1" style="opacity: 0.7; filter:Alpha(Opacity=50, Style=0)">
                <h2>输入你的乘车信息</h2>
                <span class="input input--nao">
					<input class="input__field input__field--nao" type="text" id="input-1" name="startDate"/>
					<label class="input__label input__label--nao" for="input-1">
						<span class="input__label-content input__label-content--nao">出发时间</span>
					</label>
					<svg class="graphic graphic--nao" width="300%" height="100%" viewBox="0 0 1200 60" preserveAspectRatio="none">
						<path d="M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0"/>
					</svg>
				</span>
                <span class="input input--nao">
					<input class="input__field input__field--nao" type="text" id="input-2" name="startPlace"/>
					<label class="input__label input__label--nao" for="input-2">
						<span class="input__label-content input__label-content--nao">出发地点</span>
					</label>
					<svg class="graphic graphic--nao" width="300%" height="100%" viewBox="0 0 1200 60" preserveAspectRatio="none">
						<path d="M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0"/>
					</svg>
				</span>
                <span class="input input--nao">
					<input class="input__field input__field--nao" type="text" id="input-3" name="endPlace"/>
					<label class="input__label input__label--nao" for="input-3">
						<span class="input__label-content input__label-content--nao">目的地</span>
					</label>
					<svg class="graphic graphic--nao" width="300%" height="100%" viewBox="0 0 1200 60" preserveAspectRatio="none">
						<path d="M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0"/>
					</svg>
				</span>
                <span class="input input--nao">
					<input class="input__field input__field--nao" type="text" id="input-4" name="peopleNum"/>
					<label class="input__label input__label--nao" for="input-3">
						<span class="input__label-content input__label-content--nao">乘车人数</span>
					</label>
					<svg class="graphic graphic--nao" width="300%" height="100%" viewBox="0 0 1200 60" preserveAspectRatio="none">
						<path d="M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0"/>
					</svg>
				</span>
            </section>
            <input type="submit" value="提交">
        </form>
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
