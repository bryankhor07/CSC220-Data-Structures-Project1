/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: President.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

package CSC220ASMT2;

public final class President extends Person {

    //
    // Instance Data Fields
    //
    private String firstName;
    private String lastName;

    //
    // Constructors
    //
    public President() {
    }

    public President(String firstName, String lastName) {
        super(firstName, lastName);
    }

    //
    // Instance Methods
    //
    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    // Additional Methods
    @Override
    public void sayGreeting(String string) {
        System.out.println("SF GIANTS: Welcome to the SAN FRANCISCO GIANTS!");
    }
}
