<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="KichoServlet" name="frm">
	id: <input type="text" name="id"><br>
	age: <input type="text" name="age">
		<input type="submit" value="전송" onClick="return check()">
		<input type="reset" name="리셋">
	
</form>
<script type="text/javascript">
	function check() {
		if (frm.id.value =="") {
			alert("입력하라 아이디를");
			return false;
		}else if (frm.age.value =="") {

			alert("입력하라 나이를");
			return false;
		}else{			
		return true;
		}
	}
</script>
</body>
</html>