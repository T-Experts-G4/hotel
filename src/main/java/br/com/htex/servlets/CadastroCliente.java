package br.com.htex.servlets;

import java.io.IOException;

import br.com.htex.util.JPAFactory;
import jakarta.persistence.EntityManager;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastroCliente")
public class CadastroCliente extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


			System.out.println("Estou na servlet");
			EntityManager em = JPAFactory.getEntityManager();
			System.out.println("bd conect");
			
			RequestDispatcher reqDispatcher = req.getRequestDispatcher("cadastrocliente.jsp");
			reqDispatcher.forward(req, resp);
			
			System.out.println(reqDispatcher);
			
		
	}

}
