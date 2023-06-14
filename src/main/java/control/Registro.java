package control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import entity.Empleado;

/**
 * Servlet implementation class Registro
 */
@WebServlet("/registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registro() {
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
		String nombre = request.getParameter("name");
		String apellido = request.getParameter("lastname");
		int edad = Integer.parseInt(request.getParameter("age"));
		String direccion = request.getParameter("address");

		Empleado empleado1= new Empleado();
		empleado1.setNombre(nombre);
		empleado1.setApellido(apellido);
		empleado1.setDireccion(direccion);
		empleado1.setEdad(edad);
		
		PrintWriter out;
		
		String title = "Mortrando empleado";
		
		
		try {
		
			
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
					out.println("<section>" + empleado1.toString()+ "  </section>");
					out.println("<footer>");
					out.println(" by manuel y genesis");
					out.println("</footer>");
				out.println("</body");
			out.println("</html>");
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//response.sendRedirect("contactojsp.jsp");
		doGet(request, response);
	}

}
