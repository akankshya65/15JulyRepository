package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession(false);
		
		String qualification=request.getParameter("Qualification");
		session.setAttribute("Qualification", qualification); 
		
		//session.setAttribute("Qualification", "Graduate");
		
		out.println(session.getAttribute("firstName"));
		out.println(session.getAttribute("lastName"));
		out.println(session.getAttribute("Qualification"));
		
		out.println("<br>");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<form action=FourthServlet>");
		
		out.println("enter Marks");
		out.println("<input type=text name=Marks>");
		
		out.println("<br>");
		out.println("<input type=submit>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
