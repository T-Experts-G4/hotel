<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
	<h3>Lista de hoteis</h3>

<table>

<tr>

<td>Id</td>

<td>Nome</td>

<td>Endereco</td>

</tr>

<c:forEach items="${hoteis}" var"hotel">

<tr>

<td>${hotel.id}</td>

<td>${hotel.nome}</td>

<td>${hotel.endereco}</td>

</tr>

</c:forEach>

</table>

<br /><br />
</body>
</html>