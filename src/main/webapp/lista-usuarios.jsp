<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <!DOCTYPE html>
<html>
<body>
	<h2>Lista de Usuarios</h2>
	<h3>
		<a href="/hotel/formUsuario">Adicionar Novo Usuario</a>
	</h3>
	<ul>
		<c:forEach var="user" items="${users}"> 
			<li>
				<h3>${user.id} - 
					<a href="/hotel/buscaUsuario?id=${user.id}">
						${user.user}
					</a></h3>
						<a href="#">Editar</a> 
					- <a href="/hotel/removeUser?id=${user.id}">
						Excluir
					</a></li>
		</c:forEach>
	</ul>
	
 
</body>
</html>