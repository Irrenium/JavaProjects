public class Exerice2 {
    /**
     * @param s
     * @return
     */
    public int nbrchars(String s) {
        if (s != null && s.length() > 0) {
            int x = s.length();
            for (int i = 0; i < x - 1; i++) {
                System.out.print(s.charAt(i) + "::");
            }
            System.out.print(s.charAt(x - 1));

            return x;
        }
        System.out.println("c'est pas correcte");
        return -1;
    }

    public String PartieString(String s, int d, int a) {
        if (d <= a && s != null && s.length() > 0 && a < s.length() + 1) {
            String t = "";
            for (int i = d; i < a; i++) {
                t = t + s.charAt(i);
            }
            return t;
        }
        return "c'est pas correcte";
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
