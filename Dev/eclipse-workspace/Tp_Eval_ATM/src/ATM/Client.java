package ATM;

import java.util.Scanner;

public class Client {
	private String nom;
	private String prenom;
	private String adresse;
	private int codePostal;
	private String numero;
	private String ville;
//	private Scanner entrerDansLeCompte = new Scanner(System.in);
//	private Scanner changerInfoClient = new Scanner(System.in);
//	private Choix choix = new Choix(entrerDansLeCompte.nextInt());
	
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
	
	public void modifClient(Choix choix, Scanner entrerDansLeCompte, Scanner changerInfoClient) {
		do {
			System.out.println("");
			System.out.println("Souhaitez vous :");
			System.out.println("1 : Voir vos information");
			System.out.println("2 : Changer votre prenom");
			System.out.println("3 : Changer votre nom");
			System.out.println("4 : Changer votre adresse");
			System.out.println("5 : Changer votre code postal");
			System.out.println("6 : Changer votre ville");
			System.out.println("7 : Changer votre numéro de téléphone");
			System.out.println("8 : Ou vous avez fini et souhaitez sortir");
			choix.setChoix(entrerDansLeCompte.nextInt());
			if (choix.getChoix() == 1) {
				affichageInfo();
			}else if (choix.getChoix() == 2) {
				System.out.println("");
				System.out.print("Entrez votre prenom :");
				setPrenom(changerInfoClient.next());
			}else if (choix.getChoix() == 3) {
				System.out.println("");
				System.out.print("Entrez votre nom :");
				setNom(changerInfoClient.next());
			}else if (choix.getChoix() == 4) {
				System.out.println("");
				System.out.print("Entrez votre adresse :");
				setAdresse(changerInfoClient.next());
			}else if (choix.getChoix() == 5) {
				System.out.println("");
				System.out.print("Entrez votre code postal :");
				setCode(changerInfoClient.nextInt());
			}else if (choix.getChoix() == 6) {
				System.out.println("");
				System.out.print("Entrez votre ville :");
				setVille(changerInfoClient.next());
			}else if (choix.getChoix() == 7) {
				System.out.println("");
				System.out.print("Entrez votre numéro de téléphone :");
				setNum(changerInfoClient.next());
			}
		}while(choix.getChoix() != 8);
	}
}
