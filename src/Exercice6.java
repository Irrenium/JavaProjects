import java.util.Random;
import java.util.Scanner;

public class Exercice6 {
    public void jeu() {
        System.out.println("donner un nombre");
        Scanner entree = new Scanner(System.in);

        int n = entree.nextInt();
        Random OR = new Random();
        int al = OR.nextInt(n);
        int cpt = 0;

        System.out.print("ylhbda");
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
