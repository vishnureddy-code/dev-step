public class OOPSBannerAppUC5 {

    public static void main(String[] args) {

        // Declare and initialize array in a single statement
        String[] banner = {
                String.join("  ", " OOO ", " OOO ", " PPPP ", " SSSS "),
                String.join("  ", "O   O", "O   O", "P    P", "S     "),
                String.join("  ", "O   O", "O   O", "P    P", "S     "),
                String.join("  ", "O   O", "O   O", " PPPP ", " SSSS "),
                String.join("  ", "O   O", "O   O", "P      ", "     S"),
                String.join("  ", "O   O", "O   O", "P      ", "     S"),
                String.join("  ", " OOO ", " OOO ", "P      ", " SSSS ")
        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
