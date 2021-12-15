package servelets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.factorial;

/**
 * Servlet implementation class FacServelet
 */
@WebServlet("/FacServelet")
public class FacServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int numero = Integer.parseInt(request.getParameter("numero"));
		
		factorial obj = new factorial(numero);
		int res =obj.factn();
		
		//System.out.println(res);
		request.getSession().setAttribute("numero", Integer.toString(numero));
		request.getSession().setAttribute("facto", Integer.toString(res));
		response.sendRedirect("factorial.jsp");
		
	}

}
