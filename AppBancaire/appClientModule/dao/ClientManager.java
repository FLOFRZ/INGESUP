package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Client;

public class ClientManager {

	public static final String DB_LOGIN = "root";
	public static final String DB_PASS = "";
	
	public static Client loadClientByID(int clientID) {

		Client result = new Client();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appbancaire",DB_LOGIN, DB_PASS);
			
			PreparedStatement stmt = con.prepareStatement("SELECT ClientID, Nom, Prenom, Login FROM client WHERE ClientID=?");
			stmt.setInt(1, clientID);
		
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				result.setClientID(rs.getInt("ClientID"));
				result.setNom(rs.getString("Nom"));
				result.setPrenom(rs.getString("Prenom"));
				result.setLogin(rs.getString("Login"));
			}
			rs.close();
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return result;
		
	}

	public static Boolean addClient(Client c) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appbancaire",DB_LOGIN, DB_PASS);
			
			PreparedStatement stmt = con.prepareStatement("INSERT INTO client (Nom, Prenom, Login, Password) Values (?, ?, ?, ?)");
			stmt.setString(1, c.getNom());
			stmt.setString(2, c.getPrenom());
			stmt.setString(3, c.getLogin());
			stmt.setString(4, c.getPassword());
			
		
			int rs = stmt.executeUpdate();
			con.close();
			if (rs>0)
				return true;
			else
				return false;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
			
		}
		

	}

	public static Boolean delClient(int clientID) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appbancaire",DB_LOGIN, DB_PASS);
			
			PreparedStatement stmt = con.prepareStatement("DELETE FROM client WHERE ClientID=?");
			stmt.setInt(1, clientID);
	
			int rs = stmt.executeUpdate();
			con.close();
			if (rs>0)
				return true;
			else
				return false;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
			
		}
	}
}
