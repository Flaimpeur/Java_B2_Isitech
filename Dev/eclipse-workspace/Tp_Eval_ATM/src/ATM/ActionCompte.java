package ATM;

import java.util.Scanner;

public class ActionCompte {
	private ActionClient action = new ActionClient();
	public ActionCompte() {
	}
	
	public void action(Client client1, Choix choix, Scanner entrerDansLeCompte,Scanner changerInfoClient, Scanner sommeMise, CompteBancaire votreCompte1) {
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
				System.out.println("Voici votre solde : " + votreCompte1.getSolde() + "€" );
			}else if (choix.getChoix() == 2) {
				System.out.print("Combien voulez vous mettre : ");
				votreCompte1.setSoldeAjouter(sommeMise.nextInt());
			}else if (choix.getChoix() == 3) {
				System.out.print("Combien voulez vous retirer : ");
				int retirer = sommeMise.nextInt();
				if(retirer > votreCompte1.getSolde()) {
					System.out.println("Vous n'avez pas autant. Veuillez retirer une plus petite somme");
				}else {
					votreCompte1.setSoldeRetirer(retirer);
				}
			}else if (choix.getChoix() == 4) {
				votreCompte1.getOpe();
			}else if (choix.getChoix() == 5) {
				action.modifClient(choix, entrerDansLeCompte, changerInfoClient, client1);
			}
			if (choix.getChoix()<1 || choix.getChoix()>6) {
				System.out.println("");
				System.out.println("Veuillez choisir entre 1 et 6.");
			}
		}while(choix.getChoix() != 6);
	}
}
