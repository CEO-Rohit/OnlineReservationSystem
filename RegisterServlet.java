// RegisterServlet.java
package controller;

import model.DBConnection;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
   
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO users(username, password) VALUES (?, ?)");
            statement.setString(1, username);
            statement.setString(2, password);
            int result = statement.executeUpdate();

            if (result > 0) {
                response.sendRedirect("login.jsp");
            } else {
                response.sendRedirect("error.jsp");
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}
