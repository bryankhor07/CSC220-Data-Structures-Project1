/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Manager.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

package CSC220ASMT2;

public final class Manager extends Person {

    //
    // Instance Data Fields
    //
    private String firstName;
    private String lastName;

    //
    // Constructors
    //
    public Manager() {
    }

    public Manager(String firstName, String lastName) {
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
