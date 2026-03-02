import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    // HashMap to store character patterns
    private static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();   // Load patterns
        renderBanner("OOPS");   // Render banner
    }

    // Initialize character patterns
    private static void initializePatterns() {

        patternMap.put('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        patternMap.put('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        });

        patternMap.put('S', new String[]{
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        });
    }

    // Render banner word
    private static void renderBanner(String word) {

        int height = 5;  // Each character has 5 lines

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                } else {
                    System.out.print("       ");
                }
            }
            System.out.println();
        }
    }
}