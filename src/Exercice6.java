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

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrer un nombre max: ");
        int n = keyboard.nextInt();

        Random OR = new Random();
        int reponse = OR.nextInt(n);
        int cpt = 0;

        System.out.println("======================================");

        System.out.println("Entrer un nombre : ");
        int nombre = keyboard.nextInt();

        while (nombre != reponse && cpt <= 10) {
            if (nombre > reponse) {
                System.out.println("trop grand");

            } else if (nombre < reponse) {
                System.out.println("trop petit");
            }

            nombre = keyboard.nextInt();
            cpt++;

            if (nombre == reponse) {
                System.out.println("Bravooo");
                break;
            }
        }

        System.out.println("======================================");
        if (cpt == 10) {
            System.out.print("La solution est " + reponse);
        }
        System.out.println("Le nombre d'essai est : " + (cpt + 1));
        System.out.print("La solution est : " + reponse);
        keyboard.close();

    }
}
