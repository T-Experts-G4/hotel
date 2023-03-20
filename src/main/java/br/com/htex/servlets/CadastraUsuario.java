package br.com.htex.servlets;

import java.io.IOException;

import br.com.htex.dao.UsuarioDao;
import br.com.htex.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastraUsuario")
public class CadastraUsuario extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Chegou");
//		String user = "user1";
//		String password = "1234";
		
		String user = req.getParameter("user");
		String password = req.getParameter("password");
		
		Usuario usuario = new Usuario(user,password);
		UsuarioDao usuarioDao = new UsuarioDao();
		System.out.println(usuario);
		usuarioDao.cadastra(usuario);
		
		resp.sendRedirect("listaUsuarios");
	}
}
