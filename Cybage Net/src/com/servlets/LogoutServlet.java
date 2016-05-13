package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		HttpSession hs = request.getSession();
		LoginServlet.setCount(LoginServlet.getCount()-1);
		hs.invalidate();
		PrintWriter pw = response.getWriter();
		pw.print("User logged out successfully");
		RequestDispatcher rd = request.getRequestDispatcher("loginForm.html");
		rd.include(request, response);
	}

	

}
