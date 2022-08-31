<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>설문 조사</title>
</head>
<body>
	<h2>설문조사</h2>
	<form action="SolmunJosa" method="post" name="frm">
		<table>
			<tr>
				<td>이름: </td>
				<td><input type="text" name="name" size="20"></td>
			</tr>
			<tr>
				<td>성별: </td>
				<td>
					<input type="radio" name="gender" value="male" checked="checked"> 남
					<input type="radio" name="gender" value="female" > 여
				</td>
			</tr>
			<tr>
				<td>선호 계절: </td>
				<td>
					<input type="checkbox" name="season" value="1" checked="checked"> 봄
					<input type="checkbox" name="season" value="2" > 여름
					<input type="checkbox" name="season" value="3" > 가을
					<input type="checkbox" name="season" value="4" > 겨울
				</td>
			</tr>
			<tr align="center">
				<td>				
					<input type="submit" value="전 송" onClick="return check()">
				</td>
				<td>
					<input type="reset" value="취 소" >
				</td>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		function check() {
			if (frm.name.value == "") {
				alert("이름이 없습니다");
				return false;
			}
			confirm("이대로 보내도 될까요");
			return true;
		}
	</script>
</body>
</html>