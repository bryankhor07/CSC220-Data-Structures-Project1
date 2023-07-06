/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: FrontOffice.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

package CSC220ASMT2;

public final class FrontOffice {

    //
    // Constructors
    //
    public FrontOffice() {
    }

    public FrontOffice(Manager manager, GeneralManager generalManager, President president) {
        this.manager = new Manager();
        this.generalManager = new GeneralManager();
        this.president = new President();
    }

    // Objects
    Manager manager = new Manager();
    GeneralManager generalManager = new GeneralManager();
    President president = new President();

    //
    // Instance Methods
    //

    public void setManagerName(String firstName, String lastName) {
        manager.setFirstName(firstName);
        manager.setLastName(lastName);
    }

    public String getManagerName() {
        return manager.getFirstName() + " " + manager.getLastName();
    }

    public void setGeneralManagerName(String firstName, String lastName) {
       generalManager.setFirstName(firstName);
       generalManager.setLastName(lastName);
    }

    public String getGeneralManagerName() {
        return generalManager.getFirstName() + " " + generalManager.getLastName();
    }

    public void setPresidentName(String firstName, String lastName) {
        president.setFirstName(firstName);
        president.setLastName(lastName);
    }

    public String getPresidentName() {
        return president.getFirstName() + " " + president.getLastName();
    }

    //
    // Language
    //
}
