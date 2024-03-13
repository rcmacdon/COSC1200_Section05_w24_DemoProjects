/* **********************************
File:       COSC1200-05 - Week 9 Exception Handling
Author:     Clint MacDonald
Date:       March 2024
Purpose:    Intro to Multiple and propagating exceptions
************************************* */
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println("Test 1: " + test1());
//        System.out.println("Test 2: " + test2(null));

        test3();
    }

    // a method to demonstrate multiple exception catches
    public static String test1(){
        String retString = "";

        double subTotal = 0.0;
        System.out.print("Enter Subtotal: ");

        try {

            subTotal = Double.parseDouble(sc.nextLine());
            retString = String.format("Congrats, you entered a valid number: %f", subTotal);

        } catch (NumberFormatException e) {
            retString = String.format("Error! Invalid number: %s\n",e.toString());
        } catch (Exception ex) {
            retString = String.format("Unknown Error: %s", ex.toString());
        } finally {
            // do stuff that needs to happen anyways!
            retString += "\nFinished doing stuff, wrapping up!";
        }

        return retString;
    }

    // preventative exception handling through data validation
    public static String test2(String customerType) {
        String retString = "";

        // prevent the error when the customerType was null
        if (customerType != null) {
            if (customerType.equalsIgnoreCase("R")) {
                retString = "0.4";
            } else {
                retString = "0.6";
            }
        }
        return retString;
    }

    public static boolean isValidDouble(String inputString) {
        boolean isValid = false;
        double test = 0.0;

        try {
            test = Double.parseDouble(inputString);
        } catch (NumberFormatException e) {
            System.out.println("Error! Invalid decimal value.\n");
            return false;
        }

        // range check
        if (test > 0 && test < 10000) {
            isValid = true;
        } else {
            System.out.println("Error! Number must be between 0 and 10000");
        }

        return isValid;
    }

    // in Main.java
    public static void test3() {
        double length = 0.0, width = 0.0;
        System.out.println("****  Area of a Rectangle *****");

        length = getDblFromConsole("Enter the length (m): ");
        width = getDblFromConsole("Enter the width (m): ");
        try {
            System.out.println("The area of the rectangle is: " + calcRectangleArea(length, width));
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    // Tools
    public static double calcRectangleArea(double length, double width) {
        if (length == 0.0 || width == 0.0)
            throw new NumberFormatException("Incorrect numeric values! Must not be zero!");
        return Math.round(length * width * 100.) / 100.;
    }

    public static double getDblFromConsole(String prompt) {
        double returnValue = 0.0;
        System.out.print(prompt);
        boolean isValid = false;
        while (!isValid) {
            try {
                returnValue = getDoubleFromConsole();
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.printf("An exception occurred with number format: try again: %s",
                        e.toString());
            }
        }
        return returnValue;
    }

    // Tools.java
    public static double getDoubleFromConsole() throws NumberFormatException {
        return Double.parseDouble(sc.nextLine());
    }

}