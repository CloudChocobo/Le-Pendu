package fr.AH;

import java.util.Random;
import java.util.Scanner;


public class Pendu {


	public void newGame() {
        System.out.println("\nBonjour, bienvenue dans Le jeu du Pendu.\n");
        System.out.println("Entrez votre nom:\n");
        Scanner clavier = new Scanner(System.in);
        String entreeClavier = clavier.nextLine();

        Joueur joueur1 = new Joueur();
        joueur1.setnom(entreeClavier);
        
        System.out.println("\n Merci " + joueur1.nom + ". Commençons une nouvelle partie.");
        
        Mots mot = new Mots();
        mot.motATrouver();
        mot.afficherLettreMotMystere();

        Potence display = new Potence();
	}

}
