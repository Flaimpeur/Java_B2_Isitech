package Exo5;

import java.util.Date;

//public class Commande {
//
//	private int numero;
//	private Date date;
//	private Client client;
//	private Article[] articles;
//	private int[] qtt;
//	
//	
//	
//}

// Correction
public class Commande {
    private int numero;
    private String date;
    private Client client;
    private Article[] articles;

    public Commande() {
    }

    public Commande(int numero) {
        this();
        setNumero(numero);
    }

    public Commande(int numero, String date) {
        this(numero);
        setDate(date);
    }

    public Commande(int numero, String date, Client client) {
        this(numero, date);
        setClient(client);
    }

    public Commande(int numero, String date, Client client, Article[] articles) {
        this(numero, date, client);
        setArticles(articles);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("Le numéro de commande doit être supérieur à 0");
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if (date.length() > 0) {
            this.date = date;
        } else {
            System.out.println("La date ne peut pas être vide");
        }
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        if (client != null) {
            this.client = client;
        } else {
            System.out.println("Le client ne peut pas être null");
        }
    }

    public Article[] getArticles() {
        return articles;
    }

    public void setArticles(Article[] articles) {
        if (articles != null) {
            this.articles = articles;
        } else {
            System.out.println("Le tableau d'articles ne peut pas être null");
        }
    }

    public String toString() {
        return getNumero() + " " + getDate() + " " + getClient() + " " + getArticles();
    }

}