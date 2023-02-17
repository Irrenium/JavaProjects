
public class Exercice4 {

    /**
     * 
     * @param chaine chiaen à inverser
     * @return
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

        for (int i = chaine.length(); i < 0; i--) {
            resultat += chaine.charAt(i);
        }

        return resultat;
    }
}
