package com.blog.daoarticle.model;


public class Article {
		
		
		public int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		
		public String auteur;

		public String getAuteur() {
			return auteur;
		}
		public void setAuteur(String auteur) {
			this.auteur = auteur;
		}


		public String titre;
		public String getTitre() {
			return titre;
		}
		public void setTitre(String titre) {
			this.titre = titre;
		}
		
		
		public String desc;
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		
		
		private String date;
		public String getDate() {
			return date;
		}
		public void setDate(String string) {
			this.date = string;
		}
		
		

}


