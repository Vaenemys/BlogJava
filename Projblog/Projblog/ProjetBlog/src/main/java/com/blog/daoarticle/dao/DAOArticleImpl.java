package com.blog.daoarticle.dao;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.blog.daoarticle.dao.DAOArticle;
import com.blog.daoarticle.model.Article;

public class DAOArticleImpl implements DAOArticle {
	
	
	private Connection connection;
	
	public DAOArticleImpl(Connection connection) {
		this.connection = connection;
	}

	@Override
	public Article obtenirArticle(int id) {
		Article article = new Article();
		try {
			String query = "SELECT * FROM articlec WHERE id=?;";
			
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if (rs.next() == false) {
				return null;
			}else {
				do {
					article.setId(rs.getInt("id"));
					article.setAuteur(rs.getString("Auteur"));
					article.setTitre(rs.getString("Titre"));
					article.setDesc(rs.getString("Desc"));
					article.setDate(rs.getString("Date"));
				} while (rs.next());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return article;
	}

	@Override
	public List<Article> obtenirToutArticles() {
		List<Article> articles = new ArrayList<Article>();
	
		try {
			String query = "Select * FROM articlec;";
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next())  {
				Article article = new Article();
				
				article.setId(rs.getInt("id"));
				article.setAuteur(rs.getString("Auteur"));
				article.setTitre(rs.getString("Titre"));
				article.setDesc(rs.getString("Desc"));
				article.setDate(rs.getString("Date"));
				
				articles.add(article);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return articles;
	}

	@Override
	public void ajoutArticle(Article article) {
		try {
			String query = "INSERT INTO articlec (auteur, titre, desc, date) VALUES";
			String generatedColumns[] = {"ID"};
			PreparedStatement ps = connection.prepareStatement(query, generatedColumns);
			ps.setString(rs.getInt("id"));
			ps.setString(rs.getString("Auteur"));
			ps.setString(rs.getString("Titre"));
			ps.setString(rs.getString("Desc"));
			ps.setString(rs.getString("password"));
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

	@Override
	public void majArticle(Article article) {
		try {
			String query = ("UPDATE articlec SET auteur=?, titre=?, desc=?, date=? WHERE id=?;");
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, article.getAuteur());
			ps.setString(2, article.getTitre());
			ps.setString(3, article.getDesc());
			ps.setString(4, article.getDate());
			ps.setInt(5, getId());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}

	@Override
	public void supprArticle(Article article) {
		try {
			String query = ("DELETE FROM articlec WHERE id=?;");
			
			PreparedStatement ps = connection.prepareStatement(query);
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
