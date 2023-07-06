/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Club.java
 * @author: Duc Ta
 * @author: Bryan Khor
 * **********************************************
 */

package CSC220ASMT2;

public final class Club extends Organization{

    //
    // Instance Data Fields
    //
    private String name;

    //
    // Constructors
    //
    public Club() {

    }

    public Club(String defaultClub) {
        this.name = defaultClub;
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

    // Static Method
    public static String getOfficialSong() {
        return "Take Me out to the Ball Game";
    }

    //
    // Additional Methods
    //
    @Override
    public void displayAbout() {
        System.out.println("Club:                     San Francisco Giants");
        System.out.println("Short name:               SF Giants");
        System.out.println("Established in:           1883");
        System.out.println("Colors:                   Orange, Black, Gold, Cream");
        System.out.println("Ballpark:                 Oracle Park");
        System.out.println("World Series Title:       8");
        System.out.println("NL Pennants:              23");
        System.out.println("Division Titles:          8");
        System.out.println("Wild Card Berths:         3");
        System.out.println("Owners:                   San Francisco Baseball Associates LLC");
        System.out.println("President:                " + getPresidentName());
        System.out.println("General Manager:          " + getGeneralManagerName());
        System.out.println("Manager:                  " + getManagerName());
    }

    @Override
    public void displayMission() {

    }

    // Object
    FrontOffice frontOffice = new FrontOffice();

    //
    // Additional Instance Methods
    //
    public String getManagerName() {
        frontOffice.setManagerName("Gabe", "Kapler");
        return frontOffice.getManagerName();
    }

    public String getGeneralManagerName() {
        frontOffice.setGeneralManagerName("Scott", "Harris");
        return frontOffice.getGeneralManagerName();
    }

    public String getPresidentName() {
        frontOffice.setPresidentName("Farhan", "Zaidi");
        return frontOffice.getPresidentName();
    }

    //
    // Language
    //
}
