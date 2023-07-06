/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Language.java
 * @author: Duc Ta
 * @author: Bryan Khor
 * **********************************************
 */

package CSC220ASMT2;

import java.util.Scanner;

public final class Language {
    //
    // Static Data Fields
    //
    private static final String defaultAlienSound = "~ ąļīæń ~ "; // Default

    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public Language() {
    }

    public Language(String language) {

        switch (language.toLowerCase()) {
            case "alien" -> this.populateAlienPhrases();            // Supported
            case "chinese" -> this.populateChinesePhrases();        // Future implementation
            case "french" -> this.populateFrenchPhrases();          // Future implementation
            case "spanish" -> this.populateSpanishPhrases();        // Future implementation
            case "future" -> this.populateYourLanguagePhrases();    // Future implementation
            default -> this.populateEnglishPhrases();               // Supported
        }

    }

    private static Scanner input = new Scanner(System.in);
    private static String languageChoice;
    private static String timeZone;

    public static void displayAppHeader() {
        System.out.println("-".repeat(70) + "\n" + "-".repeat(22) +
                " SF GIANTS THANK YOU " + "-".repeat(27) + "\n" + "-".repeat(70) + "\n" +
                " ".repeat(44) + " powered by CSC 220 @ SFSU ");
        System.out.print("Language: ");
        String language = input.next();
        setLanguageChoice(language);
        while (!language.equals("English") || !language.equals("Chinese") || !language.equals("French") || !language.equals("Spanish") || !language.equals("Alien")) {
            if (language.equals("English") || language.equals("Chinese") || language.equals("French") || language.equals("Spanish") || language.equals("Alien")) {
                break;
            }
            System.out.println("Language: UNSUPPORTED language. Please enter your language.");
            System.out.println("Language: English, Chinese, French, Spanish, Alien");
            System.out.print("Language: ");
            language = input.next();
            setLanguageChoice(language);
        }
        System.out.print("Time zone: ");
        String timeZone = input.next() + input.nextLine();
        setTimeZone(timeZone);
        while (!timeZone.equals("PST") || !timeZone.equals("CST") || !timeZone.equals("EST")) {
            if (timeZone.equals("PST") || timeZone.equals("CST") || timeZone.equals("EST")) {
                break;
            }
            System.out.println("Time zone: " + timeZone);
            System.out.println("Time Zone: INVALID time zone. Please enter your time zone.");
            System.out.print("Time zone: ");
            timeZone = input.next() + input.nextLine();
            setTimeZone(timeZone);
        }
    }

    public static Language setLanguagePreference() {
        Language languagePreference = new Language(Language.getLanguageChoice());
        return languagePreference;
    }

    private void populateEnglishPhrases() {
    }

    private void populateYourLanguagePhrases() {
    }

    private void populateSpanishPhrases() {
    }

    private void populateFrenchPhrases() {
    }

    private void populateChinesePhrases() {
    }

    private void populateAlienPhrases() {
    }

    public Object getLanguage() {
        return "English";
    }

    public Object getUniversityPhrase(int i) {
        return "San Francisco State University";
    }

    public Object getClubPhrase(int i) {
        return "San Francisco Giants";
    }

    public String getConfigPhrase(int i) {
        String phrase = "";
        switch(i) {
            case 0 -> phrase = "-".repeat(75);
            case 1 -> phrase = "Language: ";
            case 2 -> phrase = "Time Zone: ";
            case 3 -> phrase = "Color Sequences: ";
            case 4 -> phrase = "Standard Output Log: ";
            case 5 -> phrase = "Standard Error Log: ";
            case 6 -> phrase = "Receipt Log: ";
            case 7 -> phrase = "Default University: ";
            case 8 -> phrase = "Default Club: ";
        }
        return phrase;
    }

    public String getGreetingPhrase(int i) {
        return "test";
    }

//
// Static Methods
//

//
// Additional Static Methods
//

//
// Instance Methods
//

    public static String getLanguageChoice() {
        return languageChoice;
    }

    public static void setLanguageChoice(String languageChoice) {
        Language.languageChoice = languageChoice;
    }

    public static String getTimeZone() {
        return timeZone;
    }

    public static void setTimeZone(String timeZone) {
        Language.timeZone = timeZone;
    }
    //
    // Language
    //
}
