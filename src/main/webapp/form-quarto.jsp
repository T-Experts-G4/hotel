<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<h3>Cadastro de Quarto</h3> 		 		
	<form action="/hotel/cadastraQuarto" method="POST"> 
	<b>Preço: </b> <input type="text" name="precoDiaria" /> 			
	<b>Disponibilidade: </b> <input type="checkbox" id="disponivel" name="disponivel" value="true"/> 			
	 <label for="disponivel"> Disponível</label><br>
	<input type="submit" value="Cadastra" /> 		
	</form> 		 		
	<br /><br />
</body>
</body>
</html>