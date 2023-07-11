package Exo3;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ******
		// * Initialisation des différentes variables
		Random random = new Random(); //Le random récupérer un numéro aléatoire mais il faut l'importer
		int numberToFind = 0;
		boolean win = false;
		int nbOfTry = 0;
		long duration;
		Instant start = Instant.now(); // Cette classe est utile pour récupérer l'heure à la quelle on rentre dans le jeux, il faut l'importer et je l'ai récupérer sur la java doc : https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html
		numberToFind = random.nextInt(10001); // Le numéro à trouver est compris entre 0 et 10000
		// *
		// ******
		
		System.out.println("Vous devez deviner un nombre entre 0 et 10000 !");
		// ******
		// * Boucle pour le jeux
		do {
			nbOfTry = nbOfTry + 1;
			Scanner numberEnter = new Scanner(System.in); // le System.in c'est l'input standard qui sert donc à récupérer une entré clavier
			int yourNumber = numberEnter.nextInt(); // On met la valeur écrite par le jour dans une variable pour pouvoir l'utilisé
			if (yourNumber == numberToFind) // On vérifie si c'est le bon numéro si oui alors c'est gagner
			{
				Instant end = Instant.now();
				System.out.println("Bravo vous avez trouver !!!");
				duration = Duration.between(start, end).getSeconds(); // Le duration est utilisé pour calculer un temps entre deux temps il faut l'importer et je l'ai trouver grâce à la java doc : https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html
				// Et juste au dessus j'utilise getSeconds pour récupérer la durer entre les deux temps en seconde, avec duration on peut récupérer en nanoseconde ou seconde et si on veux en minute il faudra convertir le résusltat avec une autre classe
				System.out.println("Vous avez réussi en " + nbOfTry + " d'essais" + " et en " + duration + " secondes."); // Affichage de toute les donnée à afficher comme le nb d'essais et le temps passer en seconde
				win = true; // Je passe le boolean à true quand on trouve le bon numéro pour sortir de la boucle car le jeux est fini
				
			} else if (yourNumber > numberToFind) // On vérifie si le numéro du joueur et plus grand que celui à trouver si oui alors on lui indique que le numéro à trouver est plus petit
			{
				System.out.println("C'est moins.");
			} else if (yourNumber < numberToFind) // On vérifie si le numéro du joueur et plus petit que celui à trouver si oui alors on lui indique que le numéro à trouver est plus grand
			{
				System.out.println("C'est plus.");
			}
		}
		while (win == false); //On boucle tant que le jeu n'est pas gagner et on vérifie si c'est gagner grâce à un boolean
		// *
		// ******
	}

}