public class OOPSBannerApp7 {

    // Static Inner Class to store character and its pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";

        // Initialize patterns
        CharacterPattern[] patterns = {
                new CharacterPattern('O', new String[] {
                        " ***** ",
                        "**   **",
                        "**   **",
                        "**   **",
                        " ***** "
                }),
                new CharacterPattern('P', new String[] {
                        "****** ",
                        "**   **",
                        "****** ",
                        "**     ",
                        "**     "
                }),
                new CharacterPattern('S', new String[] {
                        " ***** ",
                        "**     ",
                        " ***** ",
                        "     **",
                        " ***** "
                })
        };

        // Build and print banner
        printBanner(word, patterns);
    }

    // Method to print banner
    public static void printBanner(String word, CharacterPattern[] patterns) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] letterPattern = getPattern(ch, patterns);
                line.append(letterPattern[i]).append("   ");
            }

            System.out.println(line);
        }
    }

    // Method to get pattern for a character
    public static String[] getPattern(char ch, CharacterPattern[] patterns) {

        for (CharacterPattern cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }

        // Default empty pattern if character not found
        return new String[] {
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        };
    }
}