/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Card.java
 * @author: Duc Ta
 * @author: Bryan Khor
 * **********************************************
 */

package CSC220ASMT2;

public class Card {

    //
    // Instance Data Fields
    //
    private int artSize = 0;     // Please change artSize, if needed, to get an identical output
    private String artFont = ""; // Please change artFont, if needed, to get an identical output
    private Student student;
    private String message;
    private String recipient;


    //
    // Constructors
    //
    public Card() {
    }

    public Card(Student student, String message, String recipient, int artSize, String artFont) {
        this.student = student;
        this.message = message;
        this.recipient = recipient;
        this.artSize = artSize;
        this.artFont = artFont;
    }

    //
    // Instance Methods
    //
    public int getArtSize() {
        return artSize;
    }

    public void setArtSize(int artSize) {
        this.artSize = artSize;
    }

    public String getArtFont() {
        return artFont;
    }

    public void setArtFont(String artFont) {
        this.artFont = artFont;
    }
    //
    // Additional Instance Methods
    //


    //
    // Language
    //
}
