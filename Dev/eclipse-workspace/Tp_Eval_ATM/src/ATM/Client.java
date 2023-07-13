package ATM;

public class Client {
	private String nom;
	private String prenom;
	private String adresse;
	private int codePostal;
	private String numero;
	private String ville;
	
	public Client(String nom, String prenom, String adresse, int codePostal, String ville, String numero) {
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.numero = numero;
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
	
	public String getNum() {
		return numero;
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
	
	public void setNum(String num) {
		this.numero = num;
	}
	
	public void affichageInfo() {
		System.out.println("Nom : " + nom + ','  + " Prenom : " + prenom + ',' + " Adresse : " + adresse + ',' + " Code postal : " + codePostal + ',' + " Ville : " + ville + ',' + " Numéro de téléphone : " + numero);
	}
}
