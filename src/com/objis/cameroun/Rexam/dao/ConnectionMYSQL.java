package com.objis.cameroun.Rexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 * @author youssouf
 * Class permettant de se connecter � la base de donn�e
 */
public class ConnectionMYSQL {
	
	// Information d'acc�s � la base de donn�es
	public static String url = "jdbc:mysql://localhost/rexam";
	public static String login = "root";//nom d'utilisateur de la base des donn�es
	public static String passwd = "";//mot de pass
	public static Connection connection;
	
	/**
	 * Methode connection
	 * Elle ne prend rien en parametre
	 * @return Connection
	 */
	public static Connection getInstance() {
		
		if (connection==null) {
			
			try {
				
				connection = DriverManager.getConnection(url,login,passwd);
				
			}catch (SQLException e) {
				 JOptionPane.showMessageDialog(null, "impossible de se connecter au Serveur","Connexion � la Base des Donn�es", JOptionPane.ERROR_MESSAGE);
				//System.out.println("Probleme de connection"); 
				
			}
			
		}
		
		return connection;
		
	}

}
