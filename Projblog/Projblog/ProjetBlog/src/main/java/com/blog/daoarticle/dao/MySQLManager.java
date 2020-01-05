package com.blog.daoarticle.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLManager {

    private static MySQLManager instance;
    private Connection connection = null;
    private String url = "jdbc:mysql://localhost:3306/bdd_java?serverTimezone=Europe/Paris";
    private String utilisateur = "root";
    private String motDePasse = "";

    private MySQLManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, utilisateur, motDePasse);
            System.out.println("Connexion open !");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }

    public static synchronized MySQLManager getInstance() {
        if (instance == null) {
            instance = new MySQLManager();
        }
        return instance;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public Connection getConnection() {
        return connection;
    }
}