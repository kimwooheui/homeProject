<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ����</title>
</head>
<body>
	<h2>��������</h2>
	<form action="SolmunJosa" method="post" name="frm">
		<table>
			<tr>
				<td>�̸�: </td>
				<td><input type="text" name="name" size="20"></td>
			</tr>
			<tr>
				<td>����: </td>
				<td>
					<input type="radio" name="gender" value="male" checked="checked"> ��
					<input type="radio" name="gender" value="female" > ��
				</td>
			</tr>
			<tr>
				<td>��ȣ ����: </td>
				<td>
					<input type="checkbox" name="season" value="1" checked="checked"> ��
					<input type="checkbox" name="season" value="2" > ����
					<input type="checkbox" name="season" value="3" > ����
					<input type="checkbox" name="season" value="4" > �ܿ�
				</td>
			</tr>
			<tr align="center">
				<td>				
					<input type="submit" value="�� ��" onClick="return check()">
				</td>
				<td>
					<input type="reset" value="�� ��" >
				</td>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		function check() {
			if (frm.name.value == "") {
				alert("�̸��� �����ϴ�");
				return false;
			}
			confirm("�̴�� ������ �ɱ��");
			return true;
		}
	</script>
</body>
</html>