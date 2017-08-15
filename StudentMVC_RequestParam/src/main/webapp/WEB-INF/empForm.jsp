<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee admission form</title>
</head>
<body>
	<h1>${msg}</h1>
	<h2>Employee admission form for MNC</h2>
	<form action="submitForm" method="post">
		<table>
			<tr>
				<td>Employee Name :</td><td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Employee MobileNumber :</td><td><input type="text" name="mobileNo"></td>
			</tr>
			<tr>
				<td>Employee DateOfBirth :</td><td><input type="text" name="empDOB"></td>
			</tr>
			<tr>
				<td>Employee Skills :</td>
				<td>
				<select name="empKeySkills" multiple>
				<option value="Core Java">Core Java</option>
				<option value="Java J2EE">Java J2EE</option>
				<option value="Spring Core">Spring Core</option>
				<option value="Spring MVC">Spring MVC</option>
				</select>
				</td>
			</tr> 
			<tr>
			<td><input type="submit" name="employee form submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>