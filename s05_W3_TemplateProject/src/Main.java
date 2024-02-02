/* ************************************
Title:      Template Project for in-class Demos
Author:     Clint MacDonald
Date:       Jan 22, 2024
Purpose:    Introducing basic OOP concepts in project form
 */

// The main class for the start of the project
public class Main {

    // Global Variables
    static int correctNumber;
    final static int MIN_NUM = 1, MAX_NUM = 100;

    // The main starting method for application execution
    public static void main(String[] args) {

        initializeGame();
        runGame();
        closeGame();



        System.out.println("The random number is: " + Tools.genRandomInt(MIN_NUM, MAX_NUM));
        for (int i = 0; i< 100; i++) {
            System.out.println("The random number is: " + Tools.genRandomInt(1000, 9999));
        }
        System.out.println("You entered: " + Tools.getIntFromConsole("Enter your guess: "));
        System.out.println("You entered: " + Tools.getIntFromConsole("Favourite Number: "));

    }

    private static void initializeGame(){
        System.out.println("*******************************************");
        System.out.println("*   Welcome to the guess the number game  *");
        System.out.println("*******************************************");
        System.out.println("A random number between " + MIN_NUM + " and "
                            + MAX_NUM + " has been chosen!");

        System.out.println("See how many guesses it takes for you to get the correct number!");

        // generate the random number!
        correctNumber = Tools.genRandomInt(MIN_NUM, MAX_NUM);
    }

    private static void closeGame() {
        System.out.println("Thank-you for playing this fantastic modern game!");
        System.out.println("*******************************************");

        System.out.println("CREDITS");
        System.out.println("Author: Clint MacDonald");
        System.out.println("Graphics: Clint MacDonald");
        System.out.println("Testing: Clint MacDonald");
        System.out.println("Quality Assurance: Clint MacDonald");
        System.out.println("\n\nGood-Bye!!!!");
    }


}