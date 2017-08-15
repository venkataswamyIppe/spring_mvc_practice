<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student admission form</title>
</head>
<body>
	<h1>${msg}</h1>
	<h2>Student admission form for engineering college</h2>
	<form action="submitAdmissionForm" method="post">
		<p>
			Student Name :<input type="text" name="stuName">
		</p>

		<p>
			Student Email :<input type="text" name="stuEmail">
		</p>
		<input type="submit" name="student form submit">

	</form>
</body>
</html>