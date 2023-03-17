<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/hotel/cadastroCliente" method="get">
		<b><label for="name" >Nome:</label></b><input type="text" name="name">
		<b><label for="birth" >Nasciento:</label></b><input type="text" name="birth">
		<b><label for="email" >Email:</label></b><input type="text" name="email">
		<button>Cadasto</button>
	</form>
</body>
</html>