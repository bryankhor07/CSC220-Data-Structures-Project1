/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: ChatSession.java
 * @author: Duc Ta
 * @author: Bryan Khor
 * **********************************************
 */

package CSC220ASMT2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ChatSession {

    // Static Data Fields
    private static String firstName;
    private static String lastName;
    private static String email;

    //
    // Instance Data Fields
    //
    private Club club;
    private University university;
    private String playerChoice;
    private String[] cards;

    //
    // Constructors
    //
    public ChatSession() {
    }

    public ChatSession(Club club, University university) {
       this.club = club;
       this.university = university;
    }

    // Objects
    Student student = new Student();
    Player player = new Player();
    Timer timer = new Timer(Config.getDefaultTimeZone());
    QuestionAnswer questionAnswer = new QuestionAnswer();
    Scanner input = new Scanner(System.in);

    //
    // Instance Methods
    //
    public String getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice = playerChoice;
    }

    public String[] getPlayers() {
        return players;
    }

    // Array of players and their information
    ArrayList<String> playerList = new ArrayList<>();


    private final String[] players = {"Buster Posey", "Jose Alvarez", "Caleb Baragar", "Tyler Beede", "John Brebbia", "Kervin Castro", "Alex Cobb", "Anthony DeSclafani", "Camilo Doval",
            "Jarlin Garcia", "Hunter Harvey", "Sean Hjelle", "Dominic Leone", "Zack Littell", "Sammy Long", "Yunior Marte", "Jake McGee", "Randy Rodriguez",
            "Tyler Rogers", "Gregory Santos", "Logan Webb", "Alex Wood", "Joey Bart", "Curt Casali", "Brandon Belt", "Brandon Crawford", "Thairo Estrada",
            "Wilmer Flores", "Tommy La Stella", "Evan Longoria", "Jason Vosler", "Jaylin Davis", "Austin Dean", "Mauricio Dubon", "Steven Duggar", "Heliot Ramos",
            "Darin Ruf", "Austin Slater", "LaMonte Wade Jr.", "Mike Yastrzemski"};
    private final String[] position = {"Catcher", "Pitcher", "Pitcher", "Pitcher", "Pitcher", "Pitcher", "Pitcher", "Pitcher", "Pitcher", "Pitcher", "Pitcher", "Pitcher", "Pitcher",
            "Pitcher", "Pitcher", "Pitcher", "Pitcher", "Pitcher", "Pitcher", "Pitcher", "Pitcher", "Pitcher", "Catcher", "Catcher", "Infielder", "Infielder",
            "Infielder", "Infielder", "Infielder", "Infielder", "Infielder", "Outfielder", "Outfielder", "Outfielder", "Outfielder", "Outfielder", "Outfielder",
            "Outfielder", "Outfielder", "Outfielder"};
    private final int[] number = {28, 48, 45, 38, 59, 76, 53, 26, 75, 66, 23, 21, 52, 46, 73, 28, 17, 29, 71, 78, 62, 57, 60, 2, 9, 35, 39, 41, 18, 10, 32, 49, 74, 1, 6, 80, 33, 13, 31, 5};
    private final String[] bats = {"Right", "Left", "Right", "Right", "Left", "Right", "Right", "Right", "Right", "Left", "Right", "Right", "Right", "Right", "Left", "Right", "Left",
            "Right", "Right", "Right", "Right", "Right", "Right", "Right", "Left", "Left", "Right", "Right", "Left", "Right", "Left", "Right", "Right", "Right",
            "Left", "Right", "Right", "Right", "Left", "Left"};
    private final String[] throwsWith = {"Right", "Left", "Left", "Right", "Right", "Right", "Right", "Right", "Right", "Left", "Right", "Right", "Right", "Right", "Left", "Right", "Left",
            "Right", "Right", "Right", "Right", "Left", "Right", "Right", "Left", "Right", "Right", "Right", "Right", "Right", "Right", "Right", "Right", "Right",
            "Right", "Right", "Right", "Right", "Left", "Left"};
    private final String[] MLBDebut = {"2009", "2013", "2020", "2018", "2017", "2021", "2011", "2014", "2021", "2017", "2019", "2018", "2014", "2018", "2021", "N/A", "2010", "N/A", "2019",
            "2021", "2019", "2013", "2020", "2014", "2011", "2011", "2019", "2013", "2014", "2008", "2021", "2019", "2018", "2019", "2018", "N/A", "2012", "2017",
            "2019", "2019"};

    //
    // Additional Methods
    //
    private void startChatSession() {
        System.out.println(timer.getTime() + " - Chat session started.\n");
        System.out.println("SF Giants: Welcome to the SAN FRANCISCO GIANTS!");
        System.out.println("---------------------------------------------------------------------------");
        club.displayAbout();
        System.out.println("---------------------------------------------------------------------------\n");
        System.out.print("SF GIANTS: Your first name and last name, please: ");
        firstName = input.next();
        lastName = input.next();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        System.out.print("SF GIANTS: Your school email address, please: ");
        email = input.next();
        student.setEmail(email);
        System.out.print(Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + student.getFirstName() + " " + student.getLastName() + Color.ANSI_RESET + ": ");
        student.sayGreeting();
        System.out.println("---------------------------------------------------------------------------\n");
        university.displayAbout();
        System.out.println("---------------------------------------------------------------------------\n");

    }

    private void connectChatters() {
        player.listOfPlayers();
        System.out.print("Which player would you like to chat with? ");
        playerChoice = input.next() + input.nextLine();

        System.out.println("SF Giants: Thank you. We are connecting you with our player...");
        System.out.println(". . . . .");
        System.out.println("---------------------------------------------------------------------------");

        for (int i = 0; i < players.length; i++) {
            if (players[i].equals(playerChoice)) {
                System.out.println("Player:                   " + players[i]);
                System.out.println("Club:                     San Francisco Giants");
                System.out.println("Position:                 " + position[i]);
                System.out.println("Number:                   " + number[i]);
                player.setNumber(number[i]);
                System.out.println("Bats:                     " + bats[i]);
                System.out.println("Throws:                   " + throwsWith[i]);
                System.out.println("MLB Debut:                " + MLBDebut[i]);
            }
        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.println(". . . . .");
    }

    private void chat() throws Exception {
        System.out.print(playerChoice + ": Hello " + student.getFirstName() + ". ");
        player.sayGreeting();
        System.out.println(playerChoice + ", " + player.getNumber() + ": " + Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + " SAN FRANCISCO STATE UNIVERSITY " + Color.ANSI_RESET + ". Way to go!");
        System.out.print(Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + student.getFirstName() + " " + student.getLastName() + Color.ANSI_RESET + ": ");
        String appreciation = input.next() + input.nextLine();
        System.out.println(playerChoice + ", " + player.getNumber() + ": Likewise, " + student.getFirstName() + ". Very nice chatting w/ you.");

        int numberOfCards = 0;

        boolean error;
        int count = 4;
        do {
            error = false;
            count--;
            try {
                System.out.println(playerChoice + ", " + player.getNumber() + ": How many SF Giants Thank You cards would you like to order? ");
                System.out.print(Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + student.getFirstName() + " " + student.getLastName() + Color.ANSI_RESET +  ": ");
                numberOfCards = input.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Please enter an INTEGER. " + count + " tries left.");
                System.out.println("java.util.InputMismatchException");
                error = true;
                input.nextLine();
            }
        } while (error);

        System.out.println(playerChoice + ", " + player.getNumber() + ": In " + numberOfCards + " lines, please provide\n   [1] Recipient name\n   [2] Art symbol (a character)\n   [3] Message to recipient");

        for (int i = 1; i < numberOfCards + 1; i++) {
            System.out.println(playerChoice + ", " + player.getNumber() + ": Card #" + i + ":");
        }

        System.out.print(Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + student.getFirstName() + " " + student.getLastName() + Color.ANSI_RESET + ": [1] ");
        String cardOneRecipient = input.next();
        System.out.print(student.getFirstName() + " " + student.getLastName() + ": [2] ");
        char cardOneSymbol = input.next().charAt(0);
        input.nextLine();
        System.out.print(student.getFirstName() + " " + student.getLastName() + ": [3] ");
        String cardOneMessage = input.next() + input.nextLine();

        System.out.println(playerChoice + ", " + player.getNumber() + ": Card #2:");
        System.out.print(student.getFirstName() + " " + student.getLastName() + ": [1] ");
        String cardTwoRecipient = input.next();
        System.out.print(student.getFirstName() + " " + student.getLastName() + ": [2] ");
        char cardTwoSymbol = input.next().charAt(0);
        System.out.print(student.getFirstName() + " " + student.getLastName() + ": [3] ");
        String cardTwoMessage = input.next() + input.nextLine();

        System.out.println(playerChoice + ", " + player.getNumber() + ": Card #3:");
        System.out.print(student.getFirstName() + " " + student.getLastName() + ": [1] ");
        String cardThreeRecipient = input.next();
        System.out.print(student.getFirstName() + " " + student.getLastName() + ": [2] ");
        char cardThreeSymbol = input.next().charAt(0);
        System.out.print(student.getFirstName() + " " + student.getLastName() + ": [3] ");
        String cardThreeMessage = input.next() + input.nextLine();

        System.out.println(playerChoice + ", " + player.getNumber() + ": Thanks, " + student.getFirstName() + ". Please confirm your order:");
        SFGiantsCardGenerator.generateSFGiantsCard(cardOneRecipient, cardOneMessage, student.getFirstName(), student.getEmail(), cardOneSymbol, 1, "Courier");
        SFGiantsCardGenerator.generateSFGiantsCard(cardTwoRecipient, cardTwoMessage, student.getFirstName(), student.getEmail(), cardTwoSymbol, 1, "Courier");
        SFGiantsCardGenerator.generateSFGiantsCard(cardThreeRecipient, cardThreeMessage, student.getFirstName(), student.getEmail(), cardThreeSymbol, 1, "Courier");
        System.out.print("\n" + student.getFirstName() + " " + student.getLastName() + ": ");
        String acknowledgement = input.nextLine();
        System.out.println(playerChoice + ", " + player.getNumber() + ": Thank you again, " + student.getFirstName() + ". See you at your graduation ceremony!\n");
    };

    private void runQuiz() {
        int count = 0;
        System.out.println("SF Giants: *** FREE TICKETS to SF GIANTS Games *** _ 1 miss allowed _");
        questionAnswer.setQuestion("Which type of class has 'protected' constructors?");
        System.out.println("SF Giants: " + questionAnswer.getQuestion());
        questionAnswer.setAnswer("abstract");
        System.out.print(student.getFirstName() + " " + student.getLastName() + ": ");
        String answer1 = input.next();
        if (answer1.equals(questionAnswer.getAnswer())) {
            System.out.println("SF Giants: Correct!");
        } else {
            System.out.println("SF Giants: Oops...");
            count++;
        }
        questionAnswer.setQuestion("What type of method did Java 8 add to 'interface'?");
        System.out.println("SF Giants: " + questionAnswer.getQuestion());
        questionAnswer.setAnswer("default");
        System.out.print(student.getFirstName() + " " + student.getLastName() + ": ");
        String answer2 = input.next();
        if (answer2.equals(questionAnswer.getAnswer())) {
            System.out.println("SF Giants: Correct!");
        } else {
            System.out.println("SF Giants: Oops...");
            count++;
        }
        questionAnswer.setQuestion("What new keyword did Java 13 add to 'switch' statement?");
        System.out.println("SF Giants: " + questionAnswer.getQuestion());
        questionAnswer.setAnswer("yield");
        System.out.print(student.getFirstName() + " " + student.getLastName() + ": ");
        String answer3 = input.next();
        if (answer3.equals(questionAnswer.getAnswer())) {
            System.out.println("SF Giants: Correct!");
        } else {
            System.out.println("SF Giants: Oops...");
            count++;
        }
        questionAnswer.setQuestion("In Java 15, what keyword pairs with 'sealed'?");
        System.out.println("SF Giants: " + questionAnswer.getQuestion());
        questionAnswer.setAnswer("permits");
        System.out.print(student.getFirstName() + " " + student.getLastName() + ": ");
        String answer4 = input.next();
        if (answer4.equals(questionAnswer.getAnswer())) {
            System.out.println("SF Giants: Correct!");
        } else {
            System.out.println("SF Giants: Oops...");
            count++;
        }
        questionAnswer.setQuestion("Giants in Spanish?");
        System.out.println("SF Giants: " + questionAnswer.getQuestion());
        questionAnswer.setAnswer("Gigantes");
        System.out.print(student.getFirstName() + " " + student.getLastName() + ": ");
        String answer5 = input.next();
        if (answer5.equals(questionAnswer.getAnswer())) {
            System.out.println("SF Giants: Correct!");
        } else {
            System.out.println("SF Giants: Oops...");
            count++;
        }
        questionAnswer.setQuestion("Take me out to the...?");
        System.out.println("SF Giants: " + questionAnswer.getQuestion());
        questionAnswer.setAnswer("Ball Game");
        System.out.print(student.getFirstName() + " " + student.getLastName() + ": ");
        String answer6 = input.next() + input.nextLine();
        if (answer6.equals(questionAnswer.getAnswer())) {
            System.out.println("SF Giants: Correct!");
        } else {
            System.out.println("SF Giants: Oops...");
            count++;
        }
        if (count <= 1) {
            System.out.println("*** Congrats! You won FREE TICKETS to SF GIANTS Games ***");
        } else {
            System.out.println("____ Please try again at your graduation ceremony. ____");
        }
    }

    private void stopChatSession() {
        System.out.println(timer.getTime() + " - Chat session ended.");
    }

    public void runChatSession() throws Exception {
        startChatSession();
        connectChatters();
        chat();
        runQuiz();
        stopChatSession();
    }

    public void viewCard() {
        try {
            SFGiantsCardGenerator.generateSFGiantsCard(recipient, message, this.sender.getName(), "test", artSymbol, artSize, artFont);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
    //
    // Language
    //
}
