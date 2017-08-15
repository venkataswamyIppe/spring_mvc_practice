<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student admission form</title>

</head>
<body>
<link rel="stylesheet" href="<spring:theme code='styelSheet'/>" type="text/css" />
<p>
	<a href="adminssionform?siteTheme=green">Green</a>| 
	<a href="adminssionform?siteTheme=red">Red</a>
</p>
Student admission form for engineering college
	<h2><spring:message code="label:admissionForm"/></h2>
	<form:errors path="student.*" />
	<form action="submitAdmissionForm" method="post">
		<table>
			<tr>
				<td><spring:message code="label:stuName"/></td>
				<td><input type="text" name="stuName"></td>
			</tr>

			<tr>
				<td><spring:message code="label:stuEmail"/></td>
				<td><input type="text" name="stuEmail"></td>
			</tr>
			<tr>
				<td><input type="submit" name="student form submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>