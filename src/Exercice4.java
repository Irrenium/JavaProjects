
public class Exercice4 {

    /**
     * Une Method à qui on donne une chaîne de caractères, et on lui demande de
     * construire une nouvelle chaîne contenant les mêmes caractères en ordre
     * inverse
     * 
     * @param chaine chiaen à inverser
     * @return string resultat
     */
    public String inverse_Chaine(String chaine) {

        String resultat = "";

        if (chaine == null) {
            System.out.println("La chaîne est null!");
            return "";
        }

        if (chaine.length() < 0) {
            System.out.println("La chaîne est vide!");
            return "";
        }

        for (int i = chaine.length() - 1; i >= 0; i--) {
            resultat += chaine.charAt(i);
        }

        return resultat;
    }
}
