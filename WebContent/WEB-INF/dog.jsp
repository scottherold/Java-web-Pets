<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Your dog</title>
</head>
<body>
	<p>You created a <c:out value="${dog.getBreed()}"/>!</p>
	<br>
	<p><c:out value="${dog.showAffection()}"/></p> 
</body>
</html>