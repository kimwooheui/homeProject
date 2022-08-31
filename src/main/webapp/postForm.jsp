<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="postForm" name="frm">
	id: <input type="text" name="id"><br>
	pwd: <input type="text" name="pwd">
		<input type="submit" value="전송" onClick="return check()">
		<input type="reset" name="리셋">
	
</form>
<script type="text/javascript">
	function check() {
		if (frm.id.value =="") {
			alert("아이디가 비었습니다");
			return false;
		}else if (frm.pwd.value =="") {
			alert("비번이 비었습니다");
			return false;
		}else{			
		return true;
		}
	}
</script>
</body>
</html>