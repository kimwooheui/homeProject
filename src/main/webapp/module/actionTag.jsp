<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div>asdfasdf</div>
<jsp:include page="aaa.jsp" />
<form action="actionTagTest.do">
	a: <input type="radio" name="param" value="A" checked="checked">
	b: <input type="radio" name="param" value="B">
	<input type="submit" value="전송">
</form>
</body>
</html>