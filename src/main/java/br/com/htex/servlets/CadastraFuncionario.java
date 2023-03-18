package br.com.htex.servlets;

import java.io.IOException;

import br.com.htex.dao.FuncionarioDao;
import br.com.htex.model.Funcionario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastraFuncionario")
public class CadastraFuncionario  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("cargo");
		String email = req.getParameter("email");

		Funcionario funcionario = new Funcionario("nome","email");

		FuncionarioDao funcionarioDao = new FuncionarioDao();

		funcionarioDao.cadastra(funcionario);
	}
}
