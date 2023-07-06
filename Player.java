/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Player.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

package CSC220ASMT2;

public final class Player extends Person {

    // Instance Data Fields
    private String club;
    private String position;
    private int number;
    private String bats;
    private String throwsWithHand;
    private int MLBDebut;

    //
    // Constructors
    //
    public Player() {
    }

    public Player(String firstName, String lastName, String club, String position, int number, String bats, String throwsWithHand, int MLBDebut) {
        super(firstName, lastName);
        this.club = club;
        this.position = position;
        this.number = number;
        this.bats = bats;
        this.throwsWithHand = throwsWithHand;
        this.MLBDebut = MLBDebut;
    }

    //
    // Instance Methods
    //
    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBats() {
        return bats;
    }

    public void setBats(String bats) {
        this.bats = bats;
    }

    public String getThrowsWithHand() {
        return throwsWithHand;
    }

    public void setThrowsWithHand(String throwsWithHand) {
        this.throwsWithHand = throwsWithHand;
    }

    public int getMLBDebut() {
        return MLBDebut;
    }

    public void setMLBDebut(int MLBDebut) {
        this.MLBDebut = MLBDebut;
    }

    //
    // Additional Methods
    //
    public void listOfPlayers() {
        System.out.println("Pitchers: Jose Alvarez, Caleb Baragar, Tyler Beede, John Brebbia, Kervin Castro, Alex Cobb, Anthony DeSclafani, Camilo Doval,");
        System.out.println("          Jarlin Garcia, Hunter Harvey, Sean Hjelle, Dominic Leone, Zack Littell, Sammy Long, Yunior Marte, Jake McGee,");
        System.out.println("          Randy Rodriguez, Tyler Rogers, Gregory Santos, Logan Webb, Alex Wood");
        System.out.println("Catchers: Buster Posey, Joey Bart, Curt Casali");
        System.out.println("Infielders: Brandon Belt, Brandon Crawford, Thairo Estrada, Wilmer Flores, Tommy La Stella, Evan Longoria, Jason Vosler");
        System.out.println("Outfielders: Jaylin Davis, Austin Dean, Mauricio Dubon, Steven Duggar, Heliot Ramos, Darin Ruf, Austin Slater,");
        System.out.println("             LaMonte Wade Jr., Mike Yastrzemski");
    }

    @Override
    public void sayGreeting(String string) {
        System.out.println("C-O-N-G-R-A-T-U-L-A-T-I-O-N-S!");
    }
}
