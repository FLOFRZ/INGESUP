package model;

public class Compte {

	private int Num;
	private String Libelle;
	private int NumClient;
	
	public String toString() {
		return Num + " " + Libelle + " " + NumClient;
	}
	
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	public int getNumClient() {
		return NumClient;
	}
	public void setNumClient(int numClient) {
		NumClient = numClient;
	}
	
}
