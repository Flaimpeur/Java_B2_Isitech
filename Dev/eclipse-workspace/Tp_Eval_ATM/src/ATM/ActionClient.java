package ATM;

import java.util.Scanner;

public class ActionClient {
	
	// Constructeur
	public ActionClient() {
	}
	
	// ******
	// * Début fonction pour savoir se que le client veux changer dans son compte client
	public void modifClient(Choix choix, Scanner entrerDansLeCompte, Scanner changerInfoClient, Client client1) {
		do {
			// ****
			// * Affichage texte pour guider le client
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
			// *
			// ****
			choix.setChoix(entrerDansLeCompte.nextInt()); // On fait une entrer clavier pour savoir se que le client fait
			// ****
			// * Condition pour savoir se que le client choisi
			if (choix.getChoix() == 1) {
				client1.affichageInfo();
			}else if (choix.getChoix() == 2) {
				System.out.println("");
				System.out.print("Entrez votre prenom :");
				client1.setPrenom(changerInfoClient.nextLine()); // Le nextLine sert à récupérer une entrer clavier sous forme de String donc chaine de caractére et permet de récupérer une phrase entière
			}else if (choix.getChoix() == 3) {
				System.out.println("");
				System.out.print("Entrez votre nom :");
				client1.setNom(changerInfoClient.nextLine());
			}else if (choix.getChoix() == 4) {
				System.out.println("");
				System.out.print("Entrez votre adresse :");
				client1.setAdresse(changerInfoClient.nextLine());
			}else if (choix.getChoix() == 5) {
				System.out.println("");
				System.out.print("Entrez votre code postal :");
				client1.setCode(changerInfoClient.nextInt()); // Le nextInt sert à récupérer une entrer clavier sous forme de int donc nombre entier
			}else if (choix.getChoix() == 6) {
				System.out.println("");
				System.out.print("Entrez votre ville :");
				client1.setVille(changerInfoClient.nextLine());
			}else if (choix.getChoix() == 7) {
				System.out.println("");
				System.out.print("Entrez votre numéro de téléphone :");
				client1.setNum(changerInfoClient.nextLine());
			}
			// *
			// ****
			
			//Condition pour être sur que le client à écrit un nombre entre 1 et 8 sinon lui indiquer de choisir entre 1 et 8
			if (choix.getChoix()<1 || choix.getChoix()>8) {
				System.out.println("");
				System.out.println("Veuillez choisir entre 1 et 8.");
			}
		}while(choix.getChoix() != 8); // On reste dans la boucle dans que le client ne la pas choisi
		// *
		// ******
	}

}
