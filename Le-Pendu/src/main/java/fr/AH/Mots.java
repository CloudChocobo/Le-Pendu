package fr.AH;

import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class Mots {
    String motChoisi;
    String[] motMystere;

    public Mots() {
        List<String> liste = Arrays.asList("banane", "citron", "farine", "sucre", "chocolat");
        Random hasard = new Random();

        int nombreDeMots = 1;

        for (int i = 0; i < nombreDeMots; i++) {
            int randomIndex = hasard.nextInt(liste.size());
            this.motChoisi = liste.get(randomIndex);
        }

        int tailleListe = this.motChoisi.length();

        this.motMystere = new String[tailleListe];
    }

    public void motATrouver() {

        for (String lettre : motMystere) {
            lettre = "*";
        }
    }

    public void afficherLettreMotMystere() {

        for (String string : this.motMystere) {
            System.out.println(string + " ");
        }
    }

}