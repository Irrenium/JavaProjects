public class Exercice5 {
    /**
     * Une Method qui échange les valeurs de deux chaînes de caractères passées en
     * argument
     * 
     * @param chaine_1 chaine à remplacer avec la deuxième
     * @param chaine_2 chaine à remplacer avec la première
     */
    public void echanger(StringBuilder chaine_1, StringBuilder chaine_2) {

        if (chaine_1 == null) {
            System.out.println("La chaîne 1 est null!");
            return;
        }

        if (chaine_1.length() < 0) {
            System.out.println("La chaîne 1 est vide!");
            return;
        }

        if (chaine_2 == null) {
            System.out.println("La chaîne 2 est null!");
            return;
        }

        if (chaine_2.length() < 0) {
            System.out.println("La chaîne 2 est vide!");
            return;
        }

        StringBuilder tmp = new StringBuilder(chaine_1.toString());

        chaine_1.replace(0, chaine_2.length(), chaine_2.toString());
        chaine_2.replace(0, tmp.length(), tmp.toString());
    }

    /**
     * Une Method qui retourne un booléen true si on lui passe une voyelle, false
     * sinon
     * 
     * @param c caractère à analyser
     * @return
     */
    public boolean estvoyelle(char c) {
        return c == 'a' || c == 'o' || c == 'i' || c == 'y' || c == 'u' || c == 'a' || c == 'e';
    }

    // traducton en javanais

    /**
     * Une Method qui permet de traduire une chaine de caractère, donnée comme
     * paramètre, en Javanais
     * 
     * @param chaine chaine à traduire
     * @return
     */
    public StringBuilder javanais(String chaine_) {
        StringBuilder chaine = new StringBuilder("");

        if (chaine_ == null) {
            System.out.println("La chaîne est null!");
            return chaine;
        }

        if (chaine_.length() < 0) {
            System.out.println("La chaîne est vide!");
            return chaine;
        }

        chaine.append(chaine_);

        for (int i = 1; i < chaine.length(); i++) {
            char x = chaine.charAt(i);

            if ((estvoyelle(x) == true) && (estvoyelle(chaine.charAt(i - 1)) == false))
                chaine.insert(i + 1, "av");

            // Ligne pour tester la validité du code
            // System.out.println(i + " :: " + chaine);
        }
        return chaine;
    }
}
