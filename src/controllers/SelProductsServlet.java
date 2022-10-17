package controllers;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelProductsServlet
 */
@WebServlet("/SelProductsServlet")
public class SelProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelProductsServlet() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] list = request.getParameterValues("selection");
		String[] listUnits = request.getParameterValues("units");
		String[] listSelected = new String[listUnits.length];
		int count = 0, countSelected = 0;
		for (int i = 0; i < listUnits.length; i++) {
			if(listUnits[i].equals("0")) {
				listSelected[i] = "NN";
			}else{
				listSelected[i] = list[count];
				count++;
			}
		}
		for (int i = 0; i < listSelected.length; i++) {
			System.out.println(listSelected[i] +" u:"+listUnits[i]);
		}
		System.out.println("sel:"+list.length+"-uni:"+listUnits.length);
		RequestDispatcher dispatcher = request.getRequestDispatcher("products/buyCar.jsp");
		dispatcher.forward(request, response);
	}

}
