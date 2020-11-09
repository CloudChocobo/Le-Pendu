package fr.AH;

public class Joueur {
    
    String nom;
    int points;

    public Joueur(int points) {
        this.points = 0;
    }

    public Joueur() {
	}

	public void setnom(String entreeClavier) {
        this.nom = entreeClavier;
    }
    
}