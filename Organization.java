/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Organization.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

// DO NOT CHANGE
package CSC220ASMT2;

public sealed abstract class Organization permits Club, University, OwnerGroup {

    //
    // Data Fields
    //
    private String name;        // Advanced OOP
    private String address;     // Advanced OOP

    //
    // Constructors
    //
    protected Organization(){
    }

    //
    // Abstract Methods
    //
    public abstract void displayAbout();
    public abstract void displayMission();
}
