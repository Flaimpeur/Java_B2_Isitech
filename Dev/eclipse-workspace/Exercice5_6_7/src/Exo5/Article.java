package Exo5;

public class Article {

	private String reference;
	private String designation;
	private int prix;
	
	public Article(String reference, String designation, int prix) {
		this.reference = reference;
		this.designation = designation;
		this.prix = prix;
	}
	
	public int getPrix() {
		return prix;
	}
	
	public String getRef() {
		return reference;
	}
	
	public String getDes() {
		return designation;
	}
	
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	public void setRef(String ref) {
		this.reference = ref;
	}
	
	public void setDes(String des) {
		this.designation = des;
	}
}
