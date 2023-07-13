package ATM;

public class CompteBancaire {
	// ****
	// * Déclaration des variables
	private Client client;
	private double solde;
	private int retirer;
	private int ajouter;
	private int x = 0;
	private String[] tab = new String[100];
	// *
	// ****
	
	// Constructeur
	public CompteBancaire(Client client, double solde) {
		this.solde = solde;
		this.client = client;
	}
	
	// ******
	// * Différente fonction avoir les information du compte bancaire client set les modifier
	public double getSolde() {
		return solde;
	}
	
	public int getRetirer() {
		return retirer;
	}
	
	public int getAjouter() {
		return ajouter;
	}
	
	public void getOpe() {
		System.out.println("Vos opération effectuer : "); // Ici j'affiche les opérations effectuer grâce à une boucle affichant un tableau qui est remplis quand j'effectue une action (ajout ou retrais) dans le compte
		for(x=0; x < tab.length; x =x +1) {
			if (tab[x] != null) {
				System.out.println(tab[x]);
			}
		}
	}
	
	public void setSoldeRetirer(int retirer) {
		this.solde = this.solde - retirer;
		this.tab[x] = "- " + retirer + "€"; // On ajoute dans le tableau le fait d'avoir retirer de l'argent
		x=x+1; // On indente le x pour mettre la prochaine action dans l'emplacement suivant du tableau
	}
	
	public void setSoldeAjouter(int ajouter) {
		this.solde = this.solde + ajouter;
		this.tab[x] = "+ " + ajouter + "€"; // On ajoute dans le tableau le fait d'avoir ajouter de l'argent
		x=x+1; // On indente le x pour mettre la prochaine action dans l'emplacement suivant du tableau
	}
	// *
	// ******
}
