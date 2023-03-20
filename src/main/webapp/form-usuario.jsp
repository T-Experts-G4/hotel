<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<h3>Cadastra Usuarios</h3>
	<form action="/hotel/cadastrausuario" method="post">
	
	<label for="user"><b>Usuário:</b> </label>
	<input type="text" name="user"><br /><br/>
	<label for="password"><b>Senha:</b> </label>
	<input type="password" name="password"><br /><br />
	<button>Cadastrar</button>
	<br />
	
	<a href="/hotel/listaUsuarios">Voltar</a>
	</form>
</body>
</html>