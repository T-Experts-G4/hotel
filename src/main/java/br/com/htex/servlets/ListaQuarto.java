package br.com.htex.servlets;

import java.io.IOException;
import java.util.List;

import br.com.htex.dao.QuartoDao;
import br.com.htex.model.Quarto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/listaQuarto")
public class ListaQuarto extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		QuartoDao quartoDao = new QuartoDao();

		List<Quarto> quartos = quartoDao.lista();

		req.setAttribute("quartos",quartos);

		req.getRequestDispatcher("lista-quartos.jsp").forward(req, resp);
	}
}
