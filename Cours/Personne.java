public class Personne {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;

    public int getAge() {
        return dateNaissance.until(LocalDate.now()).getYears();
    }

    public void display() {
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Date de naissance: " + dateNaissance);
    }

    // surcharge de la méthode display
    public void display(boolean displayAge) {
        display();
        if (displayAge) {
            System.out.println("Age: " + getAge());
        }
    }
}