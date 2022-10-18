package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Store;
import models.UserManager;

/**
 * Servlet implementation class loginUserServlet
 */
@WebServlet("/loginUserServlet")
public class loginUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) sdasd
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String nickUser = String.valueOf(request.getParameter("us_nick"));
		String passwordUser = String.valueOf(request.getParameter("us_password"));
		
		boolean autenthication = Controller.store.getUserManager().isAuthentication(nickUser, passwordUser);
		
		if (autenthication) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("store.jsp");
	        dispatcher.forward(request, response);
		}else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('User or password incorrect');");
			out.println("location='users/loginUser.jsp';");
			out.println("</script>");
		}	
	}

}
