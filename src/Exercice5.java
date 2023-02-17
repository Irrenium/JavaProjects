public class Exercice5 {
    /**
     * 
     * @param chaine_1
     * @param chaine_2
     */
    public void echanger(StringBuilder chaine_1, StringBuilder chaine_2) {
        StringBuilder tmp = new StringBuilder(chaine_1.toString());
        chaine_1.replace(0, chaine_2.length(), chaine_2.toString());
        chaine_2.replace(0, tmp.length(), tmp.toString());
    }

    public boolean estvoyelle(char c) {
        return c == 'a' || c == 'o' || c == 'i' || c == 'y' || c == 'u' || c == 'a';
    }

    // traducton en javanais

    /**
     * 
     * @param chaine
     * @return
     */
    public StringBuilder javanais(String chaine_) {

        StringBuilder chaine = new StringBuilder("");

        chaine.append(chaine_);

        for (int i = 1; i < chaine.length(); i++) {
            char x = chaine.charAt(i);

            if ((estvoyelle(x) == true) && (estvoyelle(chaine.charAt(i - 1)) == false))
                chaine.insert(i + 1, "av");
        }
        return chaine;
    }
}
