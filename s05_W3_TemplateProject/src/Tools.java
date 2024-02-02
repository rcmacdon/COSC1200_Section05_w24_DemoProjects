/* *************************************************
Title:      Tools Class file for our template project
Author:     Clint MacDonald
Date:       Jan 22, 2024
Purpose:    A Collection class to store a series of user-defined tools
************************************************* */
import java.util.Scanner;

// Main Tools Class for this files
public class Tools {

    // a simple tool that returns a random integer within a provided range
    public static int genRandomInt(int lowerBound, int upperBound) {
        return (int)(Math.random() * (upperBound - lowerBound + 1) + lowerBound);
    }

    // a simple tool to obtain an integer from the console user
    public static int getIntFromConsole(String inputPrompt){

        Scanner sc = new Scanner(System.in);
        int inputNumber = -1;
        do {
            System.out.print(inputPrompt);
            while (!sc.hasNextInt()) {
                System.out.println("That was not a number!");
                sc.next();
            }
            inputNumber = sc.nextInt();
        } while (inputNumber <= 0);

        return inputNumber;

        // code was originally sourced from polygenelubricants on Jun 17, 2010
        // https://stackoverflow.com/questions/3059333/validating-input-using-java-util-scanner
    }

    public static int getIntFromConsole(String inputPrompt, int lowerBound, int upperBound) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = -1;
        String inputString;

        do {
            System.out.print(inputPrompt + " ( " + lowerBound + " - " + upperBound + ") > ");
            inputString = sc.nextLine();
        } while (!isStringNumeric(inputString, lowerBound, upperBound));

        return Integer.parseInt(inputString);
    }

    private static boolean isStringNumeric(String inputString) {
        boolean isValid = true;

        try {
            int testNumber = Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            isValid = false;
        }

        return isValid;
    }

    private static boolean isStringNumeric(String inputString, int lowerBound, int upperBound) {
        int testNumber;

        // is the number numeric
        try {
            testNumber = Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            return false;
        }

        // is the number within the correct range?
        if ( !(testNumber <= upperBound && testNumber >= lowerBound) ) return false;

        return true;
    }


}
