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
	<table>
		<tr>
			<td>Student Name :</td>
			<td>${form.name}</td>
		</tr>
		<tr>
			<td>Student Password :</td>
			<td>${form.password}</td>
		</tr>
		<tr>
			<td>Student Email :</td>
			<td>${form.email}</td>
		</tr>
		<tr>
			<td>Student MobileNumber :</td>
			<td>${form.phone}</td>
		</tr>
		<tr>
			<td>Student Pincode :</td>
			<td>${form.pincode}</td>
		</tr>
	</table>
</body>
</html>