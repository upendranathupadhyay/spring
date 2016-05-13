package com.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AdminDao;


@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession hs = request.getSession();
		AdminDao adminDao = (AdminDao)hs.getAttribute("adminDao");
		String bName = request.getParameter("bname");
		String bAuthor = request.getParameter("bauthor");
		Integer bPrice = Integer.parseInt(request.getParameter("bprice"));
		Integer maxId;
		try 
		{
			maxId = adminDao.maxBookId();
			String result=adminDao.addBook(maxId, bName, bAuthor, bPrice);
			if(result.contains("s"))
				hs.setAttribute("status","BOOK ADDED SUCCESFULLY");
			else
				hs.setAttribute("status","BOOK ADDED SUCCESFULLY");
			
			response.sendRedirect("admin.jsp");
		}
		catch (SQLException e) {
	
			e.printStackTrace();
		}
		
		
		
	}

}
