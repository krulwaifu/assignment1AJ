<%--
  Created by IntelliJ IDEA.
  User: super
  Date: 9/13/2020
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="boostrap.jsp"%>
</head>
<body>
<!--scriplet -->
<%! public String img_url(String img_url){
    return img_url;
}
%>
<!--scriplet -->
<!--includes header's code from header.jsp -->
<%@ include file="header.jsp"%>

<form action="${pageContext.request.contextPath}/Servlet4" method="get" style="margin: auto; width: 30%; margin-top: 5%">
    <input type="hidden" name="rpg" value="Witcher">
    <img class="img-thumbnail" src="<%= img_url("https://static.gabestore.ru/product/G5z2RxGRqWm-SKL_I2Hm4OueBtiAO2F4.jpg")%>"><br>
    <button class="btn btn-primary" type="submit" style="margin-top: 5%;width: 100%">go to buy The Witcher 3</button>
</form>
<form action="${pageContext.request.contextPath}/Servlet4" method="get"  style="margin: auto; width: 30%; margin-top: 10%">
    <input type="hidden" name="rpg" value="Cyberpunk">
    <img class="img-thumbnail" src="<%= img_url("https://static.gabestore.ru/product/6GWqttg2TfPsWSnjwz_1k96aXLS7JDO5.jpg")%>"><br>
    <button class="btn btn-primary" type="submit" style="margin-top: 5%;width: 100%">go to buy Cyberpunk 2077</button>
</form>
<form action="${pageContext.request.contextPath}/Servlet4" method="get"  style="margin: auto; width: 30%; margin-top: 10%">
    <input type="hidden" name="rpg" value="Dark Souls">
    <img class="img-thumbnail" src="<%= img_url("https://static.gabestore.ru/product/DA0Sw1Ctg36KcQO8OAo0IsDwZmDgzQ6H.jpg")%>"><br>
    <button class="btn btn-primary" type="submit" style="margin-top: 5%;width: 100%;margin-bottom: 5%">go to buy Dark Souls 3</button>
</form>
<!--includes footer's code from footer.jsp -->
<%@include file="footer.jsp"%>
</body>
</html>
