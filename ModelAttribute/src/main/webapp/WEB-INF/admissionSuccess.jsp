<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student admission success</title>
</head>
<body>
	<h1>Congratulation..!</h1>
	<h2>${msg}</h2>
	<table>
		<tr>
			<td>Student Name :</td>
			<td>${student.stuName}</td>
		</tr>
		<tr>
			<td>Student Email :</td>
			<td>${student.stuEmail}</td>
		</tr>
	</table>
</body>
</html>