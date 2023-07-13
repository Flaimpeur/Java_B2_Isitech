package ATM;

import java.util.Scanner;

public class ActionCompte {
	// *****
	// * Déclaration variable
	private ActionClient action = new ActionClient();
	// *
	// ******
	
	// Constructeur
	public ActionCompte() {
	}
	
	// ******
	// * Fonction pour faire des choix dans le compte
	public void action(Client client1, Choix choix, Scanner entrerDansLeCompte,Scanner changerInfoClient, Scanner sommeMise, CompteBancaire votreCompte1) {
		do {
			// ****
			// * Affichage texte pour guider le client
			System.out.println("");
			System.out.println("Voulez vous :");
			System.out.println("1 : Voir votre solde");
			System.out.println("2 : Ajouter de l'argent");
			System.out.println("3 : Retirer de l'argent");
			System.out.println("4 : Consulter l'historique des opérations");
			System.out.println("5 : Modifier votre compte client");
			System.out.println("6 : Quitter votre interface");
			// *
			// ****
			// Entrer clavier pour choisir son action
			choix.setChoix(entrerDansLeCompte.nextInt()); // On fait une entrer clavier pour savoir se que le client fait
			// ****
			// * Condition pour savoir se que le client à choisi
			if (choix.getChoix() == 1) {
				System.out.println("Voici votre solde : " + votreCompte1.getSolde() + "€" );
			}else if (choix.getChoix() == 2) {
				System.out.print("Combien voulez vous mettre : ");
				votreCompte1.setSoldeAjouter(sommeMise.nextInt());
			}else if (choix.getChoix() == 3) {
				System.out.print("Combien voulez vous retirer : ");
				int retirer = sommeMise.nextInt();
				if(retirer > votreCompte1.getSolde()) { // Je vérifie ici si le client peut retirer une telle somme donc si il à l'argent sur son compte
					System.out.println("Vous n'avez pas autant. Veuillez retirer une plus petite somme");
				}else {
					votreCompte1.setSoldeRetirer(retirer);
				}
			}else if (choix.getChoix() == 4) {
				votreCompte1.getOpe();
			}else if (choix.getChoix() == 5) { // Ici on rentre dans la fonction qui sert à modifier les informations client qui se situe dans la classe ActionCLient
				action.modifClient(choix, entrerDansLeCompte, changerInfoClient, client1);
			}
			//Condition pour être sur que le client à écrit un nombre entre 1 et 6 sinon lui indiquer de choisir entre 1 et 6
			if (choix.getChoix()<1 || choix.getChoix()>6) {
				System.out.println("");
				System.out.println("Veuillez choisir entre 1 et 6.");
			}
			// *
			// ****
		}while(choix.getChoix() != 6); // On sort de la boucle si le client le choisi
	}
	// *
	// ******
}
