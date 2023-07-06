/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Student.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

package CSC220ASMT2;

import java.util.ArrayList;

public final class Student extends Person {

    //
    // Instance Data Fields
    //
    private String firstName;
    private String lastName;
    private String email;

    //
    // Constructors
    //
    public Student() {
    }

    public Student(String firstName, String lastName, String email) {
        super(firstName, lastName);
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //
    // Additional Methods
    //
    @Override
    public void sayGreeting(String string) {
        string = "Welcome to my university!";
        System.out.println(string);
    }
}
