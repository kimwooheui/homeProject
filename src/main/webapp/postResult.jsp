<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 <%
String id = request.getParameter("id");
String name = (String)request.getAttribute("name");
%>
아이디: <%=id%><br>
<%=name %>님 안녕하세요.
</body>
</html>