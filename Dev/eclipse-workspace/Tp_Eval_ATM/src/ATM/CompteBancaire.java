package ATM;

public class CompteBancaire {
	private Client client;
	private double solde;
	private int retirer;
	private int ajouter;
	private int x = 0;
	private String[] tab = new String[100];
	
	public CompteBancaire(Client client, double solde) {
		this.solde = solde;
		this.client = client;
	}
	
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
		System.out.println("Vos opération effectuer : ");
		for(x=0; x < tab.length; x =x +1) {
			if (tab[x] != null) {
				System.out.println(tab[x]);
			}
		}
	}
	
	public void setSoldeRetirer(int retirer) {
		this.solde = this.solde - retirer;
		this.tab[x] = "-" + retirer;
		x=x+1;
	}
	
	public void setSoldeAjouter(int ajouter) {
		this.solde = this.solde + ajouter;
		this.tab[x] = "+" + ajouter;
		x=x+1;
	}
}
