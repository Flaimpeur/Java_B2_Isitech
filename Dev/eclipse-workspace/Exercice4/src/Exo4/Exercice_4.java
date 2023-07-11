package Exo4;

import java.util.Scanner;

public class Exercice_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numberEnter = new Scanner(System.in); // le System.in c'est l'input standard qui sert donc à récupérer une entré clavier
		int yourNumber = numberEnter.nextInt();
		String binaire = Integer.toBinaryString(yourNumber); // La classe Integer et l'outil toBinaryString servent à convertir en binaire un nombre entier et sont trouvable sur la java doc : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html#toBinaryString(int)
		String hexa = Integer.toHexString(yourNumber); // La classe Integer et l'outil toHexString servent à convertir en hexadécimale un nombre entier et sont trouvable sur la java doc : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html#toBinaryString(int)
		String octal = Integer.toOctalString(yourNumber);// La classe Integer et l'outil toOctalString servent à convertir en octale un nombre entier et sont trouvable sur la java doc : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html#toBinaryString(int)
		System.out.println("Voici votre numéro en binaire : " + binaire);
		System.out.println("Voici votre numéro en hexadécimale : " + hexa);
		System.out.println("Voici votre numéro en octale  : " + octal);
	}
}