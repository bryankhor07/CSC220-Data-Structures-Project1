/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: University.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

package CSC220ASMT2;

public final class University extends Organization {

    //
    // Instance Data Fields
    //
    private String name;
    private String address;

    //
    // Constructors
    //
    public University() {

    }
    public University(String defaultUniversity) {
        this.name = "San Francisco State University";
        this.address = "1600 Holloway Avenue, San Francisco, CA 94132";
    }

    //
    // Instance Methods
    //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //
    // Additional Methods
    //
    @Override
    public void displayAbout() {
        System.out.println("Official Name:            " + getName());
        System.out.println("Motto in Latin:           Experientia Docet");
        System.out.println("Motto in English:         Experience Teaches");
        System.out.println("Type:                     Public");
        System.out.println("Year of Establishment:    1899");
        System.out.println("Location:                 San Francisco, California, United States");
        System.out.println("Address:                  " + getAddress());
        System.out.println("Colors:                   Purple and Gold");
        System.out.println("Nickname:                 Gators");
        System.out.println("Mascot:                   Gator");
        System.out.println("Website:                  www.sfsu.edu");

    }

    @Override
    public void displayMission() {

    }
}
