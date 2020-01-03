package com.blog.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blog.beans.Article;

public class ServletConsulterArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletConsulterArticle() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String message = "Nom de l'auteur de l'article:";
		request.setAttribute( "test", message );
		
		Article premierBean = new Article();

		premierBean.setNom( "Einarsson" );
		premierBean.setPrenom( "Soren" );
			

		request.setAttribute( "test", message );
		request.setAttribute( "Auteur", premierBean );
		
		 this.getServletContext().getRequestDispatcher("/WEB-INF/Article.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
