package com.blog.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletPostArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public ServletPostArticle() {
        super();
        // TODO Auto-generated constructor stub
    }

    public  void init(ServletConfig config) {
    	
 	   String url = config.getInitParameter("jdbc:mysql://localhost:3306/bdd_java?serverTimezone=Europe/Paris") ;
 	   String login = config.getInitParameter("root") ;
 	   String passwd = config.getInitParameter("") ;
 		
 	   Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, login, passwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
 		
 	   config.getServletContext().setAttribute("db-connection", connection) ;
 	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
