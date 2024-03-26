/* **********************************
File:       Main Class File for running the application from start
Author:     Clint MacDonald
Date:       March 2024
Purpose:    Learning File IO, JavaDocs, Wrapper helper Functions
************************************* */
import java.util.Scanner;
import java.io.IOException;

/**
 * The Main application Static Class for executing the program
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    /**
     * The application starting method
     * @param args - String array representing execution arguments
     */
    public static void main(String[] args) {

        // initializeProg();
        runProgram();
        // closeProg();

    }

    /**
     * The main helper function for the workflow of the main program
     */
    private static void runProgram(){

        // Obtain filename from user
        String filename = getFileName();

        // Read data from a file and store in Queue
        readFile(filename);

        // Allow editing or changing of data
        for (Task task: Task.tasks) {
            System.out.print(task.toString());
            task.setDueDate(task.getDueDate().plusDays(7));
        }

        // Write the data to a file!
        writeFile(filename);

    }

    /**
     * A method to obtain a filename string from the console window
     * @return String - represents the filename entered by the user
     */
    private static String getFileName() {
        // note: bypassing data validation and exception handling
        System.out.print("Enter the name of the file to read: ");
        String fileName = sc.nextLine();
        return fileName;
    }


    private static boolean readFile(String filename) {
        try {
            Task.readFromFile(filename);
        } catch (IOException ioe) {
            System.out.println("An error occurred: " + ioe.getMessage());
            return false;
        }

        return true;
    }

    /**
     * Wrapper helped function to assist with handling writing to files
     * @param filename String received from user
     * @return boolean value representing a successful write or not
     */
    private static boolean writeFile(String filename) {
        try {
            Task.writeToFile(filename);
        } catch (IOException ioe) {
            System.out.println("A Write error occurred: " + ioe.getMessage());
            return false;
        }
        return true;
    }

}