package fr.AH;

public class Joueur {
    
    String nom;
    int score;

    public Joueur(int score) {
        this.score = 0;
    }
   

	public Joueur() {
	}


	public void setnom(String entreeClavier) {
        this.nom = entreeClavier;
    }
    
}