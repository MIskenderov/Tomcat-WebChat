<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="css/login.css">
</head>
<div class="container">

	<form action="login" method="post">
	<center><h1>Welcome to WebChat</h1></center>
		<div class="form-group">
			<label for="login">Login</label> 
			<input type="text" class="form-control" id="login" name="login"
				placeholder="Login">
		</div>
		<div class="form-group">
			<label for="pass">Password</label> <input
				type="password" class="form-control" id="pass" name="pass"
				placeholder="Password">
		</div>
		<div class="btn-group">
			<button type="submit" class="btn btn-success">Login</button> 
			<a href="register.jsp" class="btn btn-primary">Register</a>
		</div>
		</form>
</div>
</body>
</html>