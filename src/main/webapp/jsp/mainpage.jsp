<%@include file="include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		
		<form:form id="loginForm" method="post" action="login" modelAttribute="mainpage">

			<form:label  path="fname">First name</form:label>
			<form:input id="username" name="username" path="fname" /><br>
			<form:label path="lastname">Last Name</form:label>
			<form:password id="password" name="password" path="lastname"/><br>
			<input type="submit" value="Submit" />
		</form:form>
		
	
	</body>
</html>