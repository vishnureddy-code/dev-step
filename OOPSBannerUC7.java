import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC7 {

    // Static Inner Class to store character and its pattern
    static class CharacterPattern {
        private char letter;
        private String[] pattern;

        public CharacterPattern(char letter, String[] pattern) {
            this.letter = letter;
            this.pattern = pattern;
        }

        public char getLetter() {
            return letter;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Map to store all character patterns
    private static Map<Character, CharacterPattern> patternMap = new HashMap<>();

    // Initialize character patterns
    static {
        patternMap.put('O', new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        }));
    }

    public static void main(String[] args) {

        String word = "OOPS";

        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPattern cp = patternMap.get(ch);
                if (cp != null) {
                    line.append(cp.getPattern()[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}