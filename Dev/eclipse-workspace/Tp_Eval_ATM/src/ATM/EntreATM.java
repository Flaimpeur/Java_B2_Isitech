package ATM;

import java.util.Scanner;

public class EntreATM {
	// ******
	// * Déclaration des variables
	private Scanner entrerDansLeCompte = new Scanner(System.in);
	private Scanner changerInfoClient = new Scanner(System.in);
	private boolean enter = false;
	private Scanner sommeMise = new Scanner(System.in);
	// *
	// ******
	
	// Constructeur
	public EntreATM() {
	}
	
	// ******
	// * Fonction pour choisir de rentrer dans l'atm (donc insérer sa carte) ou non
	public void ATM(){
		// ****
		// * Affichage texte pour guider le client
		System.out.println("Voulez vous rentrez dans votre compte ?");
		System.out.println("Oui : entre 1");
		System.out.println("Non : entre 2");
		// *
		// ****
		// création du choix du client
		Choix choix = new Choix(entrerDansLeCompte.nextInt()); //On fait une entrer clavier pour savoir se que le client choisi
		ActionCompte action = new ActionCompte();
		// ****
		// * Début de la boucle pour savoir se que le client veux faire
		do
		{
			// Condition pour être sur que le client à écrit 1 ou 2 sinon on lui indique qu'il doit écrire 1 ou 2
			if ((choix.getChoix() !=1) && (choix.getChoix() !=2)) {
				// ****
				// * Affichage texte pour guider le client
				System.out.println("Il faut entré 1 ou 2");
				System.out.println("");
				System.out.println("Voulez vous rentrez dans votre compte ?");
				System.out.println("Oui : entre 1");
				System.out.println("Non : entre 2");
				// ****
				// *
				choix.setChoix(entrerDansLeCompte.nextInt());
			}
			// ****
			// * Condition pour connaitre son choix, rentrer dans le compte ou non (donc insérer la carte ou non)
			if (choix.getChoix() == 1) {
				Client client1 = new Client("PROVISTE", "Alain", "23 avenue Louis XVI", 34100, "Ferrière-Poussarou", "06 58 98 77 00");
				CompteBancaire votreCompte1 = new CompteBancaire(client1, 1350.12);
				System.out.println("Bienvenue " + client1.getPrenom() + " " + client1.getNom());
				enter = true;
				action.action(client1, choix, entrerDansLeCompte, changerInfoClient, sommeMise, votreCompte1); // Ici on rentre dans la fonction qui sert à choisir les actions à effectuer dans le compte comme ajouter de l'argent, elle se situe dans la classe ActionCompte
			}else if (choix.getChoix() == 2){
				break;
			}
		} while ((choix.getChoix() !=1) && (choix.getChoix() !=2) && enter == false); // On sort quand le client la choisi. Le boolean "enter" sert à savoir quand le client est rentrer dans son compte et quand il sortira de son compte alors il sortira de l'ATM
		// *
		// ******
		System.out.println("Merci de votre utilisation nous vous souhaitons une bonne journée.");
	}

}
