package Exo5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Article vetement1 = new Article("XP2048BH", "Short blanc", 30);
		System.out.println(vetement1.getDes());
		System.out.println(vetement1.getPrix());
		System.out.println(vetement1.getRef());
		vetement1.setPrix(55);
		vetement1.setRef("XP21556FL");
		vetement1.setDes("Short bleu roi");
		System.out.println(vetement1.getDes());
		System.out.println(vetement1.getPrix());
		System.out.println(vetement1.getRef());
		
		Client client1 = new Client("PROVISTE", "Alain", "78 rue Albert 1er", 34100, "Ferrière-Poussarou");
		System.out.println(client1.getNom());
		System.out.println(client1.getPrenom());
		System.out.println(client1.getAdresse());
		System.out.println(client1.getCode());
		System.out.println(client1.getVille());
		client1.setAdresse("23 avenue Louis XVI");
		client1.setVille("Lyon 2eme");
		client1.setCode(69002);
		System.out.println(client1.getNom());
		System.out.println(client1.getPrenom());
		System.out.println(client1.getAdresse());
		System.out.println(client1.getCode());
		System.out.println(client1.getVille());
	}

}
