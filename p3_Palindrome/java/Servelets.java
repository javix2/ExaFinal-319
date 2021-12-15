package servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Verifica;
/**
 * Servlet implementation class Servelets
 */
@WebServlet("/Servelets")
public class Servelets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String cadena = request.getParameter("cadena");
		
		Verifica obj = new Verifica(cadena);
		String res =obj.verificar(); 
		
		//System.out.println(res);
		request.getSession().setAttribute("cadena", cadena);
		request.getSession().setAttribute("cadena", res);
		response.sendRedirect("palindrome.jsp");
		
	}

}
