/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: OwnerGroup.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

package CSC220ASMT2;

public final class OwnerGroup extends Organization {
    //
    // Data fields
    //
    private String firstName;
    private String lastName;
    private String address;
    //
    // Constructors
    //
    public OwnerGroup() {
    }

    public OwnerGroup(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    //
    // Instance Methods
    //
    public String getFirstName() {
    return firstName;
}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Additional Methods
    @Override
    public void displayAbout() {
        System.out.println();
    }

    @Override
    public void displayMission() {

    }
    //
    // Override
    //
}
