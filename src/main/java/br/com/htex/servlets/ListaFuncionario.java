package br.com.htex.servlets;

import java.io.IOException;
import java.util.List;

import br.com.htex.dao.FuncionarioDao;
import br.com.htex.model.Funcionario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/listaFuncionario")
public class ListaFuncionario extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FuncionarioDao funcionarioDao = new FuncionarioDao();

		List<Funcionario> funcionarios = funcionarioDao.lista();

		req.setAttribute("funcionarios",funcionarios);

		req.getRequestDispatcher("lista-funcionarios.jsp").forward(req, resp);
	}
}
