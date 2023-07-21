package com.simplilearn.assn;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class login extends HttpServlet {
	
	
		
		
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String name = req.getParameter("user");
		String password = req.getParameter("pass");
		PrintWriter out = res.getWriter();
		
		
		if(name.equals("admin")&&password.equals("admin123")) {
			
			
			out.println("<html><body>");
			out.println("Welcome "+name);
			out.println("</body></html>");
			out.print("<a href='logout?uname="+name+"'>Click here to logout</a>");  
			
			
		}
		else {
			out.println("Invalid Login");
			
		out.close();
	}

}
