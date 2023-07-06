/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Person.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

package CSC220ASMT2;

public sealed abstract class Person implements Greeting permits Student, Player, President, GeneralManager, Manager {

    //
    // Instance Data Fields
    //
    private String firstName;
    private String lastName;

    //
    // Constructors
    //
    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // Instance Methods

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
}
