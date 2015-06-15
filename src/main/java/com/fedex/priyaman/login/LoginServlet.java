package com.fedex.priyaman.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		PrintWriter writer = response.getWriter();
		writer.write("Email:" + email + "\n");
		writer.write("pass:" + password + "\n" );
		if(email.contains("@fedex")){
			if(password.equals("123")){
				writer.write("You have succesfully logged in :" + email);
				response.sendRedirect("http://www.fedex.com");
			}else{
				writer.write("Incorrect password");
			}
		}else{
			writer.write("Who are you ??");
		}
		response.setStatus(HttpServletResponse.SC_OK);
		
		
				
		
	}

}
