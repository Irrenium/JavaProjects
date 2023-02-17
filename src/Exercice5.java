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
    public StringBuilder javanais(String s) {
        StringBuilder ss;
        ss = new StringBuilder("");
        ss.append(s);
        for (int i = 1; i < ss.length(); i++) {
            char x = ss.charAt(i);
            if ((estvoyelle(x) == true) && (estvoyelle(ss.charAt(i - 1)) == false))
                ss.insert(i + 1, "av");
        }
        return ss;
    }
}
