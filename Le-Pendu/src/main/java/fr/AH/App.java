package fr.AH;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
       
        Pendu pendu = new Pendu();
        pendu.newGame();
    }
  
}
