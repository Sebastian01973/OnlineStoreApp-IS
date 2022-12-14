package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FinishBuyServlet
 */
@WebServlet("/FinishBuyServlet")
public class FinishBuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinishBuyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		//Crear la factura
		Controller.store.createInvoice();
		//Guarda los productos a la DB
		Controller.store.saveDetailProducts();
		
		//Reinicia el carrito y crea otra factura
		Controller.store.deleteProductsInCar();
		Controller.store.resetInvoice();
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Compra Exitosa');");
		out.println("location='store.jsp';");
		out.println("</script>");
		
		Controller.store.deleteProductsInCar(); //Elimina los productos del carrito
		Controller.store.resetInvoice();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
