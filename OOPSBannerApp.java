public class OOPSBannerApp{
	public static void main(String[] args){
	printBanner();
    }
    public static void printBanner() {

        System.out.println(String.join(" ", " ***** "," ***** "," ***** "," ***** "));
        System.out.println(String.join(" ", "*     *","*     * ","*   * "," *   * "));
        System.out.println(String.join(" ", "*     *","*     * ","*   * "," *   * "));
        System.out.println(String.join(" ", "*     *","*     * ","***** "," ***** "));
        System.out.println(String.join(" ", "*     *","*     * ","*     ","     * "));
		System.out.println(String.join(" ", "*     *","*     * ","*     "," *   * "));
		System.out.println(String.join(" ", " ***** "," *****  ","*     "," ***** "));
    }
}
