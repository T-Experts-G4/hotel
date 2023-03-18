package br.com.htex.servlets;

import java.io.IOException;

import br.com.htex.dao.HotelDao;
import br.com.htex.model.Hotel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastraHotel")
public class CadastraHotel  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nome = req.getParameter("cargo");
		String endereco = req.getParameter("endereco");

		Hotel hotel = new Hotel();

		HotelDao hotelDao = new HotelDao();

		hotelDao.cadastra(hotel);
	}
}
