public class OOPSBannerAppUC4 {

    public static void main(String[] args) {

        // Create String array to store banner lines
        String[] banner = new String[5];

        // Populate array using String.join()
        banner[0] = String.join("  ", "OOOO", "OOOO", "PPPP", "SSSS");
        banner[1] = String.join("  ", "O  O", "O  O", "P   P", "S");
        banner[2] = String.join("  ", "O  O", "O  O", "PPPP", "SSSS");
        banner[3] = String.join("  ", "O  O", "O  O", "P", "    S");
        banner[4] = String.join("  ", "OOOO", "OOOO", "P", "SSSS");

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
