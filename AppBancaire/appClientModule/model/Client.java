package model;

public class Client {
	private String nom;
	private String prenom;
	private int clientID;
	private String password;
	private String login;
	
	public Client() {
		
	}
	public Client(String Nom, String Prenom, String Login, String Password) {
		nom = Nom;
		prenom = Prenom;
		login = Login;
		password = Password;
		
	}
	public String toString() {
		return clientID + " " + nom + " " + prenom + " " + login;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getClientID() {
		return clientID;
	}
	public void setClientID(int clientID) {
		this.clientID = clientID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
}
