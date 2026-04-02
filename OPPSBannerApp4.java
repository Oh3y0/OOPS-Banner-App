public class OPPSBannerApp4 {

    public static void main(String[] args) {

        String[] banner = {

                String.join("   ",
                        " ***** ",
                        " ***** ",
                        " ******",
                        " ***** "),

                String.join("   ",
                        "**   **",
                        "**   **",
                        "**   **",
                        "**     "),

                String.join("   ",
                        "**   **",
                        "**   **",
                        "****** ",
                        " ***** "),

                String.join("   ",
                        "**   **",
                        "**   **",
                        "**     ",
                        "     **"),

                String.join("   ",
                        " ***** ",
                        " ***** ",
                        "**     ",
                        " ***** ")
        };

        // Enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
        /*
         * Equivalent Normal for loop
         * for (int i = 0; i < banner.length; i++) {
         * System.out.println(banner[i]);
         * }
         */
    }
}