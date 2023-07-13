package ATM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ******
		// * Déclaration des variables
		Scanner entrerDansLeCompte = new Scanner(System.in);
		Scanner changerInfoClient = new Scanner(System.in);
		boolean enter = false;
		Scanner sommeMise = new Scanner(System.in);
		System.out.println("Voulez vous rentrez dans votre compte ?");
		System.out.println("Oui : entre 1");
		System.out.println("Non : entre 2");
		Choix choix = new Choix(entrerDansLeCompte.nextInt());
		// *
		// ******
		do
		{
			System.out.println("Je suis la");
			if ((choix.getChoix() !=1) && (choix.getChoix() !=2)) {
				System.out.println("Il faut entré 1 ou 2");
				System.out.println("");
				System.out.println("Voulez vous rentrez dans votre compte ?");
				System.out.println("Oui : entre 1");
				System.out.println("Non : entre 2");
				choix.setChoix(entrerDansLeCompte.nextInt());
			}
			if (choix.getChoix() == 1) {
				System.out.println("ICI");
				Client client1 = new Client("PROVISTE", "Alain", "23 avenue Louis XVI", 34100, "Ferrière-Poussarou", "06 58 98 77 00");
				System.out.println("YO");
				CompteBancaire votreCompte = new CompteBancaire(client1, 1350.12);
				System.out.println("LA");
				System.out.println("Bienvenue " + client1.getPrenom() + " " + client1.getNom());
				enter = true;
				votreCompte.action(client1, choix, changerInfoClient, entrerDansLeCompte, sommeMise);
			}else if (choix.getChoix() == 2){
				break;
			}
		} while ((choix.getChoix() !=1) && (choix.getChoix() !=2) && enter == false);
		System.out.println("Merci de votre utilisation nous vous souhaitons une bonne journée.");
	}

}
