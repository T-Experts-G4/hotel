package br.com.htex.servlets;

import java.io.IOException;
import java.util.List;

import br.com.htex.dao.HotelDao;
import br.com.htex.model.Hotel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/listaHotel")
public class ListaHotel extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HotelDao hotelDao = new HotelDao();

		List<Hotel> hoteis = hotelDao.lista();

		req.setAttribute("hoteis",hoteis);

		req.getRequestDispatcher("lista-hoteis.jsp").forward(req, resp);
	}
}
