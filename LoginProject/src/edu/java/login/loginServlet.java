package edu.java.login;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.java.cls.LoginServ;
import edu.java.usr.User;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id, pass;
		
		id = request.getParameter("userID");
		pass = request.getParameter("password");
		
		LoginServ ls = new LoginServ();		
		boolean result = ls.authenticate(id, pass);
		
		if(result){
			User user = LoginServ.getUserId(id);
			request.getSession().setAttribute("user", user);
			response.sendRedirect("success.jsp");
			//request.setAttribute("user", user);
			//RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
			//dispatcher.forward(request, response);
			//return;
		}
		else{
			response.sendRedirect("login.jsp");
			return;
		}
	}

}
