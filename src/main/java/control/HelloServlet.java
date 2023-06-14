package control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Instancia objeto PrintWriter de nombre out, para impremir texto
		PrintWriter out;
		
		String title = "creando nuestra pagina con servlet";
		//Seleccion de tipo de texto
		response.setContentType("text/html");
		//inicialización del objeto out
		out= response.getWriter();
		//Estructura de Pagina web
		out.println("<HTML>");
			out.println("<HEAD>");
				out.println("<title>"+title+"</title>");
			out.println("</HEAD>");
			out.println("<body>");
				out.println("<header>");
					out.println("<h1>"+title+"</h1>");
				out.println("</header>");
				out.println("<footer>");
				out.println("</footer>");
			out.println("</body");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
