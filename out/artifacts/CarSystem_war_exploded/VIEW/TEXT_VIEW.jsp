<%@ page import="java.util.ArrayList" %>
<%@ page import="carSystem.Model.PassengerFormEntity" %>
<%@ page import="carSystem.Info.*"%>
<%@ page import="java.sql.SQLException" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: shuaiyuhao
  Date: 2017/12/20
  Time: 下午8:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>出发时间</td>
            <td>出发地点</td>
            <td>目的地</td>
            <td>乘车人数</td>
        </tr>

    <c:forEach items="${travelInfos}" var="travelInfos">
        <tr>
           <td>${travelInfos.startDate}</td>
            <td>${travelInfos.startPlace}</td>
            <td>${travelInfos.endPlace}</td>
            <td>${travelInfos.peopleNum}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
