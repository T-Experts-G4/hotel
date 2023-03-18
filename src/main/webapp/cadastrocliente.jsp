<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/hotel/cadastroCliente" method="get">
		<b><label for="name" >Nome:</label></b><input type="text" name="name"> <br />
		<b><label for="birth" >Nascimento:</label></b><input type="text" name="birth"> <br />
		<b><label for="email" >Email:</label></b><input type="text" name="email"> <br />
		<input type="submit" value="Cadastro" />
	</form>
</body>
</html>