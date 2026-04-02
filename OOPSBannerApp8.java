import java.util.*;

public class OOPSBannerApp8 {

    public static void main(String[] args) {

        String word = "OOPS";

        Map<Character, String[]> patternMap = createPatternMap();

        renderBanner(word, patternMap);
    }

    // Create and store patterns in HashMap
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[] {
                " ***** ",
                "**   **",
                "**   **",
                "**   **",
                " ***** "
        });

        map.put('P', new String[] {
                "****** ",
                "**   **",
                "****** ",
                "**     ",
                "**     "
        });

        map.put('S', new String[] {
                " ***** ",
                "**     ",
                " ***** ",
                "     **",
                " ***** "
        });

        return map;
    }

    // Render banner using Map lookup
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("   ");
                }
            }

            System.out.println(line);
        }
    }
}