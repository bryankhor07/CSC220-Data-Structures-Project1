/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Messenger.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */
// DO NOT CHANGE
package CSC220ASMT2;

public final class Messenger {

    //
    // main method
    //
    public static void main(String[] args) throws Exception {
        Messenger.start();
        Messenger.chat();
        Messenger.stop();
    }

    //
    // Static Data Fields
    //
    private static final Config config = new Config();

    //
    // Constructors
    //
    private Messenger() {
    }

    //
    // Static Methods
    //
    public static Config getConfig() {
        return Messenger.config;
    }
    private static void start() {
        Messenger.config.getStdOutStdErrTee().startLog();
        Messenger.config.setPreferences();
    }
    private static void chat() throws Exception {
        (new ChatSession(Messenger.config.getClub(), Messenger.config.getUniversity())).runChatSession();
    }
    private static void stop() {
        Messenger.config.getStdOutStdErrTee().stopLog();
        LogFileDriver.run(); // Please temporarily uncomment this line to run LogFileDriver.
    }
}
