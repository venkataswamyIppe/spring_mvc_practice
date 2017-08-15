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
		<table>
			<tr>
				<td>Student Name :</td><td><input type="text" name="stuName"></td>
			</tr>

			<tr>
				<td>Student Email :</td><td><input type="text" name="stuEmail"></td>
			</tr>
			<tr>
				<td>Student MobileNumber :</td><td><input type="text" name="mobileNo"></td>
			</tr>
			<tr>
				<td>Student DateOfBirth :</td><td><input type="text" name="stuDOB"></td>
			</tr>
			<!-- <tr>
				<td>Student Skills :</td>
				<td>
				<select name="stuKeySkills" multiple>
				<option value="Core Java">Core Java</option>
				<option value="Java J2EE">Java J2EE</option>
				<option value="Spring Core">Spring Core</option>
				<option value="Spring MVC">Spring MVC</option>
				</select>
				</td>
			</tr> -->
			<tr>
			<td><input type="submit" name="student form submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>