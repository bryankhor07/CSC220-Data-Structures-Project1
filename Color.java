/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Color.java
 * @author: Duc Ta
 * @author: Bryan Khor
 * **********************************************
 */

package CSC220ASMT2;

public final class Color {

    //
    // Static Data Fields
    //
    public static String ANSI_RESET = "\u001B[0m"; // I removed "final"
    public static String ANSI_YELLOW = "\u001B[33m"; // I removed "final"
    public static String ANSI_PURPLE_BACKGROUND = "\u001B[45m"; // I removed "final"

    //
    // Constructors
    //
    public Color() {
    }

    public Color(String ANSI_RESET, String ANSI_YELLOW, String ANSI_PURPLE_BACKGROUND) {
        Color.ANSI_RESET = ANSI_RESET;
        Color.ANSI_YELLOW = ANSI_YELLOW;
        Color.ANSI_PURPLE_BACKGROUND = ANSI_PURPLE_BACKGROUND;
    }
    //
    // Static Methods
    //
    public static void setAnsiReset(String ANSI_RESET) {
        Color.ANSI_RESET = ANSI_RESET;
    }
    public static String getAnsiReset() {
        return Color.ANSI_RESET;
    }
    public static void setAnsiYellow(String ANSI_YELLOW) {
        Color.ANSI_YELLOW = ANSI_YELLOW;
    }
    public static String getAnsiYellow() {
        return Color.ANSI_YELLOW;
    }
    public static void setAnsiPurpleBackground(String ANSI_PURPLE_BACKGROUND) {
        Color.ANSI_PURPLE_BACKGROUND = ANSI_PURPLE_BACKGROUND;
    }
    public static String getAnsiPurpleBackground() {
        return Color.ANSI_PURPLE_BACKGROUND;
    }

    public Object getColorSequences() {
        return "ANSI";
    }

    //
    // Language
    //
}
