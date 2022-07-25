<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Location Results</title>
</head>
<body>
	<h1>Here is the weather:</h1>
	
	<h4>${areaDescription}</h4>
	<p> Elevation: ${elevation}</p>
	<p>Latitude: ${latitude}</p>
	<p>Longitude: ${longitude}</p>
	<p>Temperature: ${temp} (F)</p>
	<p>Wind: ${winds} (MPH)</p>
	<p>Visibility: ${visibility} (MILES)</p>
	
	<h4>Future Forecast:</h4>
	<div>${label[0]}:</div>
	<div>${future[0]}</div><br>
	
	<div>${label[1]}:</div>
	<div>${future[1]}</div><br>
	
	<div>${label[2]}:</div>
	<div>${future[2]}</div><br>
	
	<div>${label[3]}:</div>
	<div>${future[3]}</div><br>
	
	<div>${label[4]}:</div>
	<div>${future[4]}</div><br>
	
	<div>${label[5]}:</div>
	<div>${future[5]}</div><br>
	
	<div>${label[6]}:</div>
	<div>${future[6]}</div><br>
	
	<div>${label[7]}:</div>
	<div>${future[7]}</div><br>
	
	<div>${label[8]}:</div>
	<div>${future[8]}</div><br>
	
	<div>${label[9]}:</div>
	<div>${future[9]}</div><br>
	
	<div>${label[10]}:</div>
	<div>${future[10]}</div><br>
	
	<div>${label[11]}:</div>
	<div>${future[11]}</div><br>
	
	<div>${label[12]}:</div>
	<div>${future[12]}</div><br>
</body>
</html>