package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DBConnection;

@WebServlet("/CancellationServlet")
public class CancellationServlet extends HttpServlet {
   
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int pnr = Integer.parseInt(request.getParameter("pnr"));

            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement("DELETE FROM reservations WHERE pnr = ?");
            statement.setInt(1, pnr);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                response.sendRedirect("success.jsp");
            } else {
                request.setAttribute("errorMessage", "Invalid PNR Number.");
                RequestDispatcher rd = request.getRequestDispatcher("cancel.jsp");
                rd.forward(request, response);
            }

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Something went wrong while cancelling.");
            RequestDispatcher rd = request.getRequestDispatcher("cancel.jsp");
            rd.forward(request, response);
        }
    }
}
