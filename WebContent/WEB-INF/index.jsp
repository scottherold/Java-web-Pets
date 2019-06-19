<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Create a pet!</title>
</head>
<body>
	<h1>Create a Cat</h1>
	<form action="/Pets/Cats" method="get">
		<p>Name: <input type="text" name="name"></p>
		<p>Breed: <input type="text" name="breed"></p>
		<p>Weight: <input type="text" name="weight"></p>
		<input type="submit" value="submit">
	</form>
	<br>
	<h1>Create a Dog</h1>
	<form action="/Pets/Dogs" method="get">
		<p>Name: <input type="text" name="name"></p>
		<p>Breed: <input type="text" name="breed"></p>
		<p>Weight: <input type="text" name="weight"></p>
		<input type="submit" value="submit">
	</form>
</body>
</html>