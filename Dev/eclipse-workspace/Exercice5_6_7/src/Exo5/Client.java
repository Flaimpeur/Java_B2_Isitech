package Exo5;

public class Client {
	private String nom;
	private String prenom;
	private String adresse;
	private int codePostal;
	private String ville;
	
	public Client(String nom, String prenom, String adresse, int codePostal, String ville) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public int getCode() {
		return codePostal;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public void setCode(int code) {
		this.codePostal = code;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
}
