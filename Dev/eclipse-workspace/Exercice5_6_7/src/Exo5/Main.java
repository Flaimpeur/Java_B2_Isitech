package Exo5;

public class Main {

	public static void main(String[] args) {
		// ******
		// * Test création et modification article
		Article vetement1 = new Article("XP2048BH", "Short blanc", 30);
		System.out.println(vetement1.getDes() +" "+ vetement1.getPrix() + "€" +" " + vetement1.getRef());
		vetement1.setPrix(55);
		vetement1.setRef("XP21556FL");
		vetement1.setDes("Short bleu roi");
		System.out.println(vetement1.getDes() +" "+ vetement1.getPrix() + "€" +" " + vetement1.getRef());
		// *
		// ******
		
		// ******
		// * Test création et modification client
		Client client1 = new Client("PROVISTE", "Alain", "78 rue Albert 1er", 34100, "Ferrière-Poussarou");
		System.out.println(client1.getPrenom() + " " + client1.getNom() + " " + client1.getAdresse() + " " + client1.getCode() + " " + client1.getVille());
		client1.setAdresse("23 avenue Louis XVI");
		client1.setVille("Lyon 2eme");
		client1.setCode(69002);
		System.out.println(client1.getPrenom() + " " + client1.getNom() + " " + client1.getAdresse() + " " + client1.getCode() + " " + client1.getVille());
		// *
		// ******
	}
}
