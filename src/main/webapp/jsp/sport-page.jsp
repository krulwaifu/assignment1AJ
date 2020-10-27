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

<form action="${pageContext.request.contextPath}/Servlet2" method="get" style="margin: auto; width: 30%; margin-top: 5%">
    <input type="hidden" name="sport" value="Fifa">
    <img class="img-thumbnail" src="<%= img_url("https://static.gabestore.ru/product/qIsGBMM1sozVnx5mYGwJrCvULKDV5wX-.jpg")%>"><br>
    <button class="btn btn-primary" type="submit" style="margin-top: 5%;width: 100%">go to buy Fifa 21</button>
</form>
<form action="${pageContext.request.contextPath}/Servlet2" method="get"  style="margin: auto; width: 30%; margin-top: 10%">
    <input type="hidden" name="sport" value="NFL">
    <img class="img-thumbnail" src="<%= img_url("https://static.gabestore.ru/product/LRJJXi_Qo-xT9sw5KZoeynbBi8_DUiev.jpg")%>"><br>
    <button class="btn btn-primary" type="submit" style="margin-top: 5%;width: 100%">go to buy NFL 20</button>
</form>
<form action="${pageContext.request.contextPath}/Servlet2" method="get"  style="margin: auto; width: 30%; margin-top: 10%">
    <input type="hidden" name="sport" value="NBA">
    <img class="img-thumbnail" src="<%= img_url("https://static.gabestore.ru/product/0msaHlDTYwfKjQFY6qy8GPIfwZRwbGFm.jpg")%>"><br>
    <button class="btn btn-primary" type="submit" style="margin-top: 5%;width: 100%;margin-bottom: 5%">go to buy NBA 2k21</button>
</form>
<!--includes footer's code from footer.jsp -->
<%@include file="footer.jsp"%>
</body>
</html>
