package ATM;

import java.util.Scanner;

public class ActionClient {

	public ActionClient() {
		
	}
	
	public void modifClient(Choix choix, Scanner entrerDansLeCompte, Scanner changerInfoClient, Client client1) {
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
				client1.affichageInfo();
			}else if (choix.getChoix() == 2) {
				System.out.println("");
				System.out.print("Entrez votre prenom :");
				client1.setPrenom(changerInfoClient.nextLine());
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
				client1.setCode(changerInfoClient.nextInt());
			}else if (choix.getChoix() == 6) {
				System.out.println("");
				System.out.print("Entrez votre ville :");
				client1.setVille(changerInfoClient.nextLine());
			}else if (choix.getChoix() == 7) {
				System.out.println("");
				System.out.print("Entrez votre numéro de téléphone :");
				client1.setNum(changerInfoClient.nextLine());
			}
		}while(choix.getChoix() != 8);
	}

}
