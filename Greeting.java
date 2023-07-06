/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Greeting.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

// DO NOT CHANGE
package CSC220ASMT2;

public sealed interface Greeting permits Person {
    public static final String GREETING = Greeting.getPhrase(0);
    public default void sayGreeting() {
        this.sayGreeting(GREETING);
    }

    public abstract void sayGreeting(String string);

    private static String getPhrase(int i) {
        return Messenger.getConfig().getLanguage().getGreetingPhrase(i);
    }
}
