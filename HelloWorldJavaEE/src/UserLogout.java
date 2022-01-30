



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
import javax.servlet.*;
/**
 * Servlet implementation class UserLogout
 */
@WebServlet("/UserLogout")
public class UserLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLogout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		// Get the print writer object to write into the response
        PrintWriter out = response.getWriter();
  
        // Set the content type of response to "text/html"
        response.setContentType("text/html");
  
        // For understanding purpose, print the session object in the console before
        // invalidating the session.
        System.out.println("Session before invalidate: "+ request.getSession(false));
  
        // Invalidate the session.
        request.getSession(false).invalidate();
  
        // Print the session object in the console after invalidating the session.
        System.out.println("Session after invalidate: "+ request.getSession(false));
  
      
        response.sendRedirect("http://localhost:8090/HelloWorldJavaEE/login.jsp");
	
        
    }
	   
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	
	}

}
