public class StaticFunctionsUC6 {

    // Static method to generate pattern for letter O
    public static String[] getO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Static method to generate pattern for letter P
    public static String[] getP() {
        return new String[] {
            "****** ",
            "*     *",
            "****** ",
            "*      ",
            "*      "
        };
    }

    // Static method to generate pattern for letter S
    public static String[] getS() {
        return new String[] {
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        // Print banner using loop
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}