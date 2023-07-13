package ATM;

import java.util.Scanner;

public class CompteBancaire {
	private Client client;
	private double solde;
	private int retirer;
	private int ajouter;
	private int x = 0;
	private String[] tab = new String[100];
	
	public CompteBancaire(Client client, double solde) {
		this.solde = solde;
		this.client = client;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public int getRetirer() {
		return retirer;
	}
	
	public int getAjouter() {
		return ajouter;
	}
	
	public void getOpe() {
		System.out.println("Vos opération effectuer : ");
		for(x=0; x < tab.length; x =x +1) {
			if (tab[x] != null) {
				System.out.println(tab[x]);
			}
		}
	}
	
	public void setSoldeRetirer(int retirer) {
		this.solde = this.solde - retirer;
		this.tab[x] = "-" + retirer;
		x=x+1;
	}
	
	public void setSoldeAjouter(int ajouter) {
		this.solde = this.solde + ajouter;
		this.tab[x] = "+" + ajouter;
		x=x+1;
	}
	
	public void action(Client client1, Choix choix, Scanner entrerDansLeCompte,Scanner changerInfoClient, Scanner sommeMise) {
		do {
			System.out.println("");
			System.out.println("Voulez vous :");
			System.out.println("1 : Voir votre solde");
			System.out.println("2 : Ajouter de l'argent");
			System.out.println("3 : Retirer de l'argent");
			System.out.println("4 : Consulter l'historique des opérations");
			System.out.println("5 : Modifier votre compte client");
			System.out.println("6 : Quitter votre interface");
			choix.setChoix(entrerDansLeCompte.nextInt());
			if (choix.getChoix() == 1) {
				System.out.println("Voici votre solde : " + getSolde() + "€" );
			}else if (choix.getChoix() == 2) {
				System.out.print("Combien voulez vous mettre : ");
				setSoldeAjouter(sommeMise.nextInt());
			}else if (choix.getChoix() == 3) {
				System.out.print("Combien voulez vous retirer : ");
				int retirer = sommeMise.nextInt();
				if(retirer > getSolde()) {
					System.out.println("Vous n'avez pas autant. Veuillez retirer une plus petite somme");
				}else {
					setSoldeRetirer(retirer);
				}
			}else if (choix.getChoix() == 4) {
				getOpe();
			}else if (choix.getChoix() == 5) {
				client1.modifClient(choix, entrerDansLeCompte, changerInfoClient);
			}
			if (choix.getChoix()<1 || choix.getChoix()>6) {
				System.out.println("");
				System.out.println("Veuillez choisir entre 1 et 6.");
			}
		}while(choix.getChoix() != 6);
	}
}
