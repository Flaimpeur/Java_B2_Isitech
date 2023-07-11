package Array;

public class Main {

	public static void main(String[] args) {
		String[] mailArray = {"jpp@sfr.fr", "tom@gmail.com", "fred@sfr.fr", "victor@sfr.fr", "chris@sfr.fr", "robber@orange.fr", "paul@sfr.fr", "lise@gmail.com", "thierry@isitech.fr", "marie@isitech.fr"};
		// ******************************************
		// ****** CODE MAIL DYNA
		
		// ****
		// * Déclaration des variables
		String[] email = new String[20];
		String[] mailSplit = new String[1];
		double[] numberMail = new double[20];
		// *
		// ****
		
		// ****
		// * Boucle pour récupérer les différents mail
		for (int x = 0; x < mailArray.length ; x++ )
		{
			mailSplit = mailArray[x].split("@"); // Pour l'utilisation du split je suis aller sur la doc : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#split(java.lang.String)
			for (int y = 0; y < mailArray.length ; y++ ) {
				if (email[y] !=null) { // Vérification si le tableau n'est pas vide pour vérifier si on a deja récupérer se mail
					if (email[y].endsWith(mailSplit[1])) // Pour l'utilisation du endsWith je suis aller sur la doc : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#endsWith(java.lang.String)
					{
						break; // Le break sert à sortir de la boucle se qui me permet ici à ne pas remplir tout mon tableau du mail récup
					}
				}
				else { // si c'est vide ou qu'on à pas le mail alors on le récupérer ici
					if (email[y] == null) { // et on le récupére seulement si c'est vide pour ne pas remplacer un autre
						email[y] = mailSplit[1];
						break; // Le break sert à sortir de la boucle se qui me permet ici à ne pas remplir tout mon tableau du mail récup si je l'enléve je vais avoir 20 fois le même mail
					}
				}
			}
		}
		// *
		// ****
		
		// ****
		// * Boucle pour récupérer les pourcentage de chaque mail
		for (int x = 0; x < mailArray.length ; x++ ) {
			for (int y = 0; y < 4 ; y++ )
			{
				if (mailArray[x].endsWith(email[y])) { // Je vérifie si la fin du mail contient le suffix de mail récupérer précédemment
					numberMail[y] = numberMail[y] +1; // Si oui alors dans un tableau de double j'ajoute 1 à l'emplacement du mail récupérer, si c'est exemple sfr alors sa va le mettre 5 fois à l'emplacement de 0 du tableau
				}
			}
		}
		// *
		// ****
		
		// ****
		// * Boucle pour afficher les pourcentages
		for (int x = 0; x < email.length; x++) {
			if (email[x] != null) { // Cette condition sert à seulement afficher les valeurs non vide du tableau
				System.out.println("Pourcentage de " + email[x] + " : " + ((double) numberMail[x] / mailArray.length) * 100 + "%");
			}
		}
		// *
		// ****
	}

}
		// ***
		// ******************************************
		


		// ******************************************
		// *** CODE MAIL en dure
//		int gmail = 0;
//		double gmailTT = 0;
//		 for (int x = 0; x < 10 ; x = x+1)
//		 {
//			 if (mailArray[x].endsWith("@gmail.com")) {
//				 gmail = gmail + 1;
//			 }
//		 }		
//		 gmailTT = ((double) gmail / 10) * 100;
//		 System.out.println(mailTT);
		// ***
		// ******************************************