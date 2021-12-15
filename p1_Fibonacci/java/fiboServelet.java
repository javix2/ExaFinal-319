package servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.generaFibo;

/**
 * Servlet implementation class fiboServelet
 */
@WebServlet("/fiboServelet")
public class fiboServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int numero = Integer.parseInt(request.getParameter("numero"));
		
		generaFibo obj = new generaFibo(numero);
		String res =obj.genera();
		
		//System.out.println(res);
		request.getSession().setAttribute("numero", Integer.toString(numero));
		request.getSession().setAttribute("serie", res);
		response.sendRedirect("fibo.jsp");
	}

}
