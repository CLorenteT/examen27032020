package servlet_examen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Carles
 */
@WebServlet("/Carles")
public class Carles extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
 
		int cont = 1;
		int resultat = 0;
		while (cont < 10) {
			resultat = cont + 2;
		}
		System.out.println(resultat);
		
		pw.println("<html><body>");
		pw.println("Carles Lorente Tur");
		pw.println("</body></html>");

		pw.close();

	}

}
