public class Exerice2 {
    /**
     * Une Method qui permet de retourner le nombre de caractères constituant la
     * chaine mot donné comme paramètre à la fonction et de les afficher en les
     * séparant par la chaine :: tout en gérant les problèmes qui peuvent survenir.
     * 
     * @param s la chaîne de caractère à analyser
     * @return
     */
    public int nombre_char(String chaine) {

        if (chaine == null) {
            System.out.println("La chaîne est null!");
            return -1;
        }

        if (chaine.length() < 0) {
            System.out.println("La chaîne est vide!");
            return -1;
        }

        int taille = chaine.length();

        for (int i = 0; i < taille - 1; i++) {
            System.out.print(chaine.charAt(i) + "::");
        }
        System.out.print(chaine.charAt(taille - 1));

        return taille;
    }

    /**
     * Une Method qui permet de retourner une partie de la chaine mot, a partir
     * d’une position et se terminant a une position fixe
     * 
     * @param chaine
     * @param depart 0 < depart < taille_chaine + 2
     * @param arrive 0 < arrive < taille_chaine + 2
     * @return
     */
    public String partie_chaine(String chaine, int depart, int arrive) {
        if (chaine == null) {
            System.out.println("La chaîne est null!");
            return "";
        }

        if (chaine.length() < 0) {
            System.out.println("La chaîne est vide!");
            return "";
        }

        if (depart < 0 || arrive < 0 || chaine.length() + 1 < arrive) {
            System.out.println("Les paramètres sont hors la taille de la chaine!");
            return "";
        }

        if (depart <= arrive) {
            String partie_chaine = "";
            for (int i = depart; i < arrive; i++) {
                partie_chaine = partie_chaine + chaine.charAt(i);
            }
            return partie_chaine;
        } else {
            String partie_chaine = "";
            for (int i = arrive; i < depart; i++) {
                partie_chaine = partie_chaine + chaine.charAt(i);
            }
            return partie_chaine;
        }
    }

    public String minuscule(String s) {
        if (s != null && s.length() > 0) {
            return s.toLowerCase();
        }
        return "c'est pas correcte";
    }

    public String majuscule(String s) {
        if (s != null && s.length() > 0) {
            return s.toUpperCase();
        }
        return "c'est pas correcte";
    }
}
