<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="loginProcess" method = "POST">
<center>
	<input type ="text" name="username" placeholder="username" id="username"/><br><br>
	<input type ="text" name="password" placeholder="password" id="password"/><br><br>
	<input type ="submit" name="button" value="Register"><br>
	
	<% Object  messege = request.getAttribute("messege");
		if(messege != null)
			out.println(messege);
	
	%>
	
</center>
</form>
</body>
</html>