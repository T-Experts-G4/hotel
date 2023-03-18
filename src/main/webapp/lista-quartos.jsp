<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<h3>Lista de Quartos</h3>

<table>

<tr>

<td>Id</td>

<td>Preço</td>

<td>Disponivel</td>

</tr>

<c:forEach items="${quartos}" var="quarto">

<tr>

<td>${quarto.id}</td>

<td>${quarto.precoDiaria}</td>

<td>${quarto.disponivel}</td>

</tr>

</c:forEach>

</table>

<br /><br />
</body>
</html>