package Exo2;
import java.util.Random; // importation du module random

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(); // initialisation d'une variable pour générer un nombre aléatoire
		int[] randomNumber = new int[3];
		int count = 0;
			do { // Boucle do pour faire le traitement tant que la condition n'est pas remplis
				
				for ( int y=0; y<3; y++) 
				{
					randomNumber[y] = random.nextInt(1001); // voila comment générer un nombre aléatoire entre 0 et 1000, il faut mettre 1 de plus pour mettre jusqu'a 1000, si je met 1000 sa ira de 0 à 999
				}
				count = count +1; // Mon compteur pour savoir en combien d'essais j'ai réussi la conditions
			}
			while ((randomNumber[0] % 2 != 0) || (randomNumber[1] % 2 != 0) || (randomNumber[2] % 2 != 1));
		
		System.out.println("Voici la combinaison : " + randomNumber[0] + " " + randomNumber[1] + " " + randomNumber[2]);
		System.out.println("Cette combinaison à été obtenue en : " + count + " essais");
	}
}