package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DBConnection;

@WebServlet("/ReservationServlet")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Connection connection = DBConnection.getConnection();

			PreparedStatement statement = connection.prepareStatement("INSERT INTO reservations(name, train_no, train_name, class_type, date, source, destination)"
							+ "VALUES(?, ?, ?, ?, ?, ?, ?)");
			
			statement.setString(1, request.getParameter("name"));
			statement.setString(2, request.getParameter("trainNo"));
			statement.setString(3, request.getParameter("trainName"));
			statement.setString(4, request.getParameter("classType"));
			statement.setString(5, request.getParameter("date"));
			statement.setString(6, request.getParameter("source"));
			statement.setString(7, request.getParameter("destination"));
			
			statement.executeUpdate();
			response.sendRedirect("success.jsp");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		}

	}

}
