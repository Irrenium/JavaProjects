
public class Exercice3 {
    /**
     * 
     * @param n chaine de caratère à analyser
     * @return
     */
    public String getChaineDesNombresDe1aN(String n) {
        if (n == null) {
            System.out.println("La chaîne est null!");
            return "";
        }

        if (n.length() < 0) {
            System.out.println("La chaîne est vide!");
            return "";
        }

        StringBuilder chaine = new StringBuilder("");
        int nombre = Integer.parseInt(n);
        if (nombre < 0) {
            System.out.println("Entrez un nombre positif!");
        }

        for (int i = 1; i <= nombre; i++) {
            chaine.append(i);
        }
        return chaine.toString();
    }
}
