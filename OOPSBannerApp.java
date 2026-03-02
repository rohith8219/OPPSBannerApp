public class OOPSBannerApp{
    public static void main(String[] args) {

        String[] banner = createBanner();

        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static String[] createBanner() {

        return new String[] {

            String.join("   ",
                    " ***** ",
                    " ***** ",
                    " ******",
                    " ***** "),

            String.join("   ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *"),

            String.join("   ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*      "),

            String.join("   ",
                    "*     *",
                    "*     *",
                    " ******",
                    " ***** "),

            String.join("   ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "      *"),

            String.join("   ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "*     *"),

            String.join("   ",
                    " ***** ",
                    " ***** ",
                    "*      ",
                    " ***** ")
        };
    }
}