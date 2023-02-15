import java.util.Scanner;

public class Execice1 {
    private int nombre;

    public void parite_nombre() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");

        nombre = keyboard.nextInt();
        if (nombre % 2 == 0) {
            System.out.print(nombre + " est Pair");
        } else {
            System.out.print(nombre + " est Impair");
        }
        keyboard.close();
    }

    public void somme_nombre() {
        Scanner keyboard = new Scanner(System.in);
        int somme = 0;

        System.out.print("Entrez un nombre : ");

        nombre = keyboard.nextInt();
        for (int i = 0; i < nombre; i++) {
            if (i % 2 != 0) {
                somme += i;
            }
            System.out.println(i + " :: " + somme);
        }
        System.out.println("la somme des nombres inférieus et impaires : " + somme);
        keyboard.close();
    }

    public void age_info() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez votre age: ");
        int age = keyboard.nextInt();

        if (age < 15) {
            System.out.println("Enfance");
        } else if (age < 25) {
            System.out.println("Adolescence");
        } else if (age < 50) {
            System.out.println("Maturité");
        } else {
            System.out.println("Vieillesse");
        }
        keyboard.close();
    }
}