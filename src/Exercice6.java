import java.util.Random;
import java.util.Scanner;

public class Exercice6 {

    /**
     * Une Methode qui permet :
     * - Le tirage aléatoire d’un entier appartenant à l’intervalle [0, n [, sachant
     * que n est déjà donnée.
     * 
     * - Permet à l’utilisateur de faire des propositions pour deviner ce nombre; à
     * chaque proposition le joueur sera informé que le nombre qu’il a donné est «
     * trop grand » ou « trop petit ».
     * 
     * - À la fin du jeu, si le joueur trouve le nombre mystérieux, le nombre
     * d’essais nécessaires est affiché.
     * 
     * - Le nombre max d’essais autorisés est 10 propositions. Dans le cas où le
     * joueur ne découvre pas le nombre mystérieux au bout des 10 essais, la
     * solution lui sera donnée
     */
    public void jeu() {
        System.out.println("Entrer un nombre : ");
        Scanner entree = new Scanner(System.in);

        int n = entree.nextInt();
        Random OR = new Random();
        int al = OR.nextInt(n);
        int cpt = 0;

        System.out.print("========================");
        int x = entree.nextInt();
        while (x != al && cpt != 10) {
            if (x > al) {
                System.out.print("plus grand");
                x = entree.nextInt();
                cpt++;
            } else if (x < al) {
                System.out.print("plus petit");
                x = entree.nextInt();
                cpt++;
            }
        }
        if (x == al) {
            System.out.print("bravooo");
        } else if (cpt == 10) {
            System.out.print("la solution est " + al);
        }
        entree.close();

    }
}
