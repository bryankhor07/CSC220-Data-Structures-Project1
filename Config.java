/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Config.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

// DO NOT CHANGE
package CSC220ASMT2;

public final class Config {
    //
    // Static Data Fields
    //
    private static final String defaultLanguage = "ENGLISH"; // Default - And taking a request
    private static final String defaultTimeZone = "PST"; // Default - And taking a request
    private static final String defaultColorSequences = "ANSI"; // Default
    private static final String defaultLogDirectoryPath = "./src/assignment02PartB/log/"; // Default
    private static final String defaultStdOutFilePath = "./src/assignment02PartB/log/StandardOut.log"; // Default
    private static final String defaultStdErrFilePath = "./src/assignment02PartB/log/StandardErr.log"; // Default
    private static final String defaultClub = "San Francisco Giants"; // Default
    private static final String defaultUniversity = "San Francisco State University"; // Default
    private static final String officialAppName = "SF Giants Thank You"; // Official - Always in English
    private static final String officialAppHeader = "-".repeat(70) + "\n" + "-".repeat(22) +
            " SF GIANTS THANK YOU " + "-".repeat(27) + "\n" + "-".repeat(70) + "\n" +
            " ".repeat(44) + " powered by CSC 220 @ SFSU "; // Official - Always in English

    //
    // Instance Data Fields
    //
    private Language language;
    private Timer timer;
    private Color color;
    private String stdOutFilePath;
    private String stdErrFilePath;
    private StdOutStdErrTree stdOutStdErrTree;
    private Directory logDirectory;
    private Club club;
    private University university;

    //
    // Constructors
    //
    public Config() {
        this.language = new Language();
        this.color = new Color();
        this.logDirectory = new Directory();
        this.stdOutStdErrTree = new StdOutStdErrTree();
    }

    //
    // Static Methods
    //
    public static String getOfficialAppName() {
        return Config.officialAppName;
    }
    public static String getOfficialAppHeader() {
        return Config.officialAppHeader;
    }
    public static String getDefaultLanguage() {
        return Config.defaultLanguage;
    }
    public static String getDefaultTimeZone() {
        return Config.defaultTimeZone;
    }
    public static String getDefaultColorSequences() {
        return Config.defaultColorSequences;
    }
    public static String getDefaultLogDirectoryPath() {
        return Config.defaultLogDirectoryPath;
    }
    public static String getDefaultStdOutFilePath() {
        return Config.defaultStdOutFilePath;
    }
    public static String getDefaultStdErrFilePath() {
        return Config.defaultStdErrFilePath;
    }
    public static String getDefaultClub() {
        return defaultClub;
    }
    public static String getDefaultUniversity() {
        return Config.defaultUniversity;
    }

    //
    // Instance Methods
    //
    public Language getLanguage() {
        return this.language;
    }
    public void setLang(Language lang) {
        this.language = lang;
    }
    public Timer getTimer() {
        return this.timer;
    }
    public void setTimer(Timer timer) {
        this.timer = timer;
    }
    public Color getColor() {
        return this.color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public Directory getLogDirectory() {
        return this.logDirectory;
    }
    public void setLogDirectory(Directory logDirectory) {
        this.logDirectory = logDirectory;
    }
    public StdOutStdErrTree getStdOutStdErrTee() {
        return this.stdOutStdErrTree;
    }
    public void setStdOutStdErrTee(StdOutStdErrTree stdOutStdErrTree) {
        this.stdOutStdErrTree = stdOutStdErrTree;
    }
    public String getStdOutFilePath() {
        return this.stdOutFilePath.replace('\\', '/');
    }
    public void setStdOutFilePath(String stdOutFilePath) {
        this.stdOutFilePath = stdOutFilePath;
    }
    public String getStdErrFilePath() {
        return this.stdErrFilePath.replace('\\', '/');
    }
    public void setStdErrFilePath(String stdErrFilePath) {
        this.stdErrFilePath = stdErrFilePath;
    }
    public Club getClub() {
        return this.club;
    }
    public void setClub(Club club) {
        this.club = club;
    }
    public University getUniversity() {
        return this.university;
    }
    public void setUniversity(University university) {
        this.university = university;
    }

    //
    // Additional Instance Methods
    //
    public void setPreferences() {
        Language.displayAppHeader();
        this.language = Language.setLanguagePreference();
        this.timer = Timer.setTimeZonePreference();
        this.club = new Club(Config.defaultClub);
        this.university = new University(Config.defaultUniversity);
        this.displayConfigurationInformation();
    }
    private void displayConfigurationInformation() {
        System.out.println(this.getPhrase(0));
        System.out.printf("%-25s %-50s %n", this.getPhrase(1), this.language.getLanguage());
        System.out.printf("%-25s %-50s %n", this.getPhrase(2), this.timer.getTimeZoneFormatted());
        System.out.printf("%-25s %-50s %n", this.getPhrase(3), this.color.getColorSequences());
        System.out.printf("%-25s %-50s %n", this.getPhrase(4), this.stdOutStdErrTree.getStdOutFilePath());
        System.out.printf("%-25s %-50s %n", this.getPhrase(5), this.stdOutStdErrTree.getStdErrFilePath());
        System.out.printf("%-25s %-50s %n", this.getPhrase(6), this.logDirectory.getPath());
        System.out.printf("%-25s %-50s %n", this.getPhrase(7), this.language.getUniversityPhrase(0));
        System.out.printf("%-25s %-50s %n", this.getPhrase(8), this.language.getClubPhrase(0));
        System.out.println(this.getPhrase(0));
    }

    //
    // Language
    //
    private String getPhrase(int i) {
        return Messenger.getConfig().getLanguage().getConfigPhrase(i);
    }
}
