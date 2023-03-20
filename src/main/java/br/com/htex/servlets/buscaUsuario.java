package br.com.htex.servlets;

import java.io.IOException;

import br.com.htex.dao.UsuarioDao;
import br.com.htex.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/buscaUsuario")
public class buscaUsuario extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt((req.getParameter("id")));
		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario usuario = usuarioDao.buscarId(id);
		
		req.getRequestDispatcher("lista-usuarios.jsp").forward(req, resp);
	}

}
