package com.blog.daoarticle.dao;

import java.util.List;
import com.blog.daoarticle.model.*;


public interface DAOArticle {
	public Article obtenirArticle(int id);
	public List obtenirToutArticles();
	public void ajoutArticle(Article article);
	public void majArticle(Article article);
	public void supprArticle(Article article);

}

