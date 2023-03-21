package br.com.htex.servlets;

import java.io.IOException;
import java.util.List;

import br.com.htex.dao.UsuarioDao;
import br.com.htex.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/listaUsuarios")
public class ListaUsuarios extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UsuarioDao usuarioDao = new UsuarioDao();
		List<Usuario> usuarios = usuarioDao.lista();
		usuarios.forEach(c -> System.out.println(c.getUser()));;
		req.setAttribute("users", usuarios);


		req.getRequestDispatcher("lista-usuarios.jsp").forward(req, resp);
	}


}
