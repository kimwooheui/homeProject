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
		<input type="submit" value="����" onClick="return check()">
		<input type="reset" name="����">
	
</form>
<script type="text/javascript">
	function check() {
		if (frm.id.value =="") {
			alert("���̵� ������ϴ�");
			return false;
		}else if (frm.pwd.value =="") {
			alert("����� ������ϴ�");
			return false;
		}else{			
		return true;
		}
	}
</script>
</body>
</html>