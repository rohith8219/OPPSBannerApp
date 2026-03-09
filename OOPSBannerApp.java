import java.util.HashMap;
import java.util.Map;
public class OOPSBannerApp{
  private static final Map<Character, String[]> REGISTRY = new HashMap<>();
	private static final int HEIGHT = 7;
    static {
        register('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        register('P', new String[]{
                " ******",
                "*     *",
                "*     *",
                " ******",
                "*      ",
                "*      ",
                "*      "
        });

        register('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });
    }

    public static void main(String[] args) {


        String[] banner = buildBanner("OOPS");

        for (String line : banner) {
            System.out.println(line);
        }
    }

    private static void register(char ch, String[] pattern) {
        REGISTRY.put(Character.toUpperCase(ch), pattern);
    }

    public static String[] buildBanner(String word) {

        word = word.toUpperCase();
        String[] banner = new String[HEIGHT];

        for (int row = 0; row < HEIGHT; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = REGISTRY.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("   ");
                } else {
                    line.append("        "); 
                }
            }

            banner[row] = line.toString();
        }

        return banner;
    }
}
