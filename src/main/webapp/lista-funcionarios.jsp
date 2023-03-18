<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
	<h3>Lista de funcionarios</h3>

<table>

<tr>

<td>Id</td>

<td>Cargo</td>

<td>email</td>

</tr>

<c:forEach items="${funcionarios}" var"funcionario">

<tr>

<td>${funcionario.id}</td>

<td>${funcionario.cargo}</td>

<td>${funcionario.email}</td>

</tr>

</c:forEach>

</table>

<br /><br />
</body>
</html>