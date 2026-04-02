public class OOPSBannerApp6 {

    public static void main(String[] args) {

        String[] banner = buildBanner();

        // Loop-based rendering
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Builds full banner
    public static String[] buildBanner() {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        String[] banner = new String[o.length];

        for (int i = 0; i < o.length; i++) {
            banner[i] = String.join("   ",
                    o[i], // First O
                    o[i], // Second O
                    p[i], // P
                    s[i] // S
            );
        }

        return banner;
    }

    // Letter O pattern
    public static String[] getO() {
        return new String[] {
                " ***** ",
                "**   **",
                "**   **",
                "**   **",
                " ***** "
        };
    }

    // Letter P pattern
    public static String[] getP() {
        return new String[] {
                "****** ",
                "**   **",
                "****** ",
                "**      ",
                "**      "
        };
    }

    // Letter S pattern
    public static String[] getS() {
        return new String[] {
                " ***** ",
                "**      ",
                " ***** ",
                "     **",
                " ***** "
        };
    }
}