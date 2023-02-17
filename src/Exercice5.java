public class Exercice5 {
    public void echanger(StringBuilder ch1, StringBuilder ch2) {
        StringBuilder tmp = new StringBuilder(ch1.toString());
        ch1.replace(0, ch2.length(), ch2.toString());
        ch2.replace(0, tmp.length(), tmp.toString());
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
