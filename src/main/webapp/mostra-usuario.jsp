<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<body>
	<b>Id:</b> ${usuario.id} <br />
	<b>Nome: </b> ${usuario.user} <br />
	<b>Senha: </b> ${usuario.password} <br />
	
	<br />
	 
	 <form action="/hotel/atualizausuario" method="post">
	 
	<input type="number" name="id" value="${usuario.id}" readonly> <br />
	<label for="user"><b>Usuário:</b> </label>
	<input type="text" name="user" value="${usuario.user}"><br /><br/>
	<label for="password"><b>Senha:</b> </label>
	<input type="password" name="password" value="${usuario.password}"><br /><br />
	<button>Atualizar</button>
	<br />
	</form>
	 
	<br />
	<a href="/hotel/listaUsuarios">Voltar</a>
</body>
</html>