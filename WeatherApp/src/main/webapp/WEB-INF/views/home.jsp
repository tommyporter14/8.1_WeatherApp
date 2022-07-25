<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Weather App</h1>
	
<h4>Enter a location:</h4>
	<form action="/location" method="post">
			Latitude:  <input type="text" name="latitude" required><br><br>
			Longitude: <input type="text" name="longitude" required><br><br>
		
		<input type="submit" value="Submit">
	</form>

</body>
</html>