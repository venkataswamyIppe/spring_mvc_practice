<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring MVC form submission</title>
</head>
<body>
	<h2>Fill your form!</h2>
	<form:form action="submitForm" method="POST" commandName="form">

		<table>
			<tr>
				<td>Enter your UserName :</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssStyle="color: #ff0000;" /></td>
			</tr>
			<tr>
				<td>Enter your password :</td>
				<td><form:input path="password" /></td>
				<td><form:errors path="password" cssStyle="color: #ff0000;" /></td>
			</tr>
			<tr>
				<td>Enter your email:</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssStyle="color: #ff0000;" /></td>
			</tr>
			<tr>
				<td>Enter your phone:</td>
				<td><form:input path="phone" /></td>
				<td><form:errors path="phone" cssStyle="color: #ff0000;" /></td>
			</tr>
			<tr>
				<td>Enter your PINCODE:</td>
				<td><form:input path="pincode" /></td>
				<td><form:errors path="pincode" cssStyle="color: #ff0000;" /></td>
			</tr>


			<tr>
				<td><input type="submit" name="submit" value="Submit"></td>
			</tr>
			<tr>
		</table>
	</form:form>
</body>
</html>
