/* ****************************
    COSC1200 - 05 - Week 6
    Clint MacDonald
    Feb 12, 2024
    Array Lists and Classes
 */

import java.util.ArrayList;

// The main collection class
public class Main {

    // the application starting point
    public static void main(String[] args) {
        mainMenu();
    }

    // Execution of the main menu system and application workflow
    private static void mainMenu(){
        boolean isContinue = true;

        do {
            System.out.println("""
                    *****************************
                    Main Menu
                    1. Demo 1 - Array Lists
                    2. Demo 2 - OOP Principles
                    3. Demo 3 - Object Classes
                    0. EXIT
                    """);
            int choice = Tools.getIntFromConsole("Enter your choice:", 0, 3);

            // process the choice
            if (choice == 1) demo1();
            else if (choice == 2) demo2();
            else if (choice == 3) demo3();
            else if (choice == 0) isContinue = false;

        } while(isContinue);

    }

    //<editor-fold desc="Demo 1 - Array Lists">
    private static void demo1(){
        ArrayList<String> students = new ArrayList<String>();
        students.add("John");
        students.add("Bob");
        students.add("Sally");

        System.out.println("\nAdded three names");
        System.out.println(students);

        System.out.println("\nAdd a 4th, but in a specific order");
        students.add(1,"Jennifer");
        System.out.println(students);

        System.out.println("\nretrieve data based on index number");
        System.out.println("Index 2 is: " + students.get(2));

        System.out.println("\nUpdate the data at a given index");
        students.set(2,"Bobby");
        System.out.println(students);

        System.out.println("\nRemove elements");
        students.remove(2);
        System.out.println(students);

        System.out.println("\nRemove elements while storing them");
        String tempStudent = students.remove(1);
        System.out.println(students);
        System.out.println(tempStudent + " was removed!");

        System.out.println("\nRemove ALL elements");
        students.clear();
        System.out.println(students);

        System.out.println("\nCombining two lists together");
        students.add("John");
        students.add("Bob");
        students.add("Sally");

        ArrayList<String> students2 = new ArrayList<String>();
        students2.add("Jennifer");
        students2.add("Raj");
        students2.add("Minnie");

        System.out.println(students);
        System.out.println(students2);

        students.addAll(students2);
        System.out.println(students);
        System.out.println(students2);

        System.out.println("\nCloning");
        ArrayList<String> students3 = new ArrayList<String>();
        students3 = (ArrayList<String>)students2.clone();
        System.out.println(students2);
        System.out.println(students3);
        students2.set(1,"Clint");
        System.out.println(students2);
        System.out.println(students3);

        // clone 2
        ArrayList<String> students4 = new ArrayList<String>(students2);
        System.out.println(students2);
        System.out.println(students4);

        /*
            Generic Collections
            -- Array
            -- List         ( java - resizable array, c# - Box of names)
            -- Queue        ( lineup - FIFO First In, First Out (lilo))
            -- Stack        ( pile books - LIFO Last In, First Out )
            -- Sorted List  ( C# - same as ArrayList in Java )
         */


        Tools.pauseProgram();
    }
    //</editor-fold>

    //<editor-fold desc="OOP Principles">
    private static void demo2(){

        Tools.pauseProgram();
    }
    //</editor-fold>

    //<editor-fold desc="Object Classes">
    private static void demo3(){

        Tools.pauseProgram();
    }
    //</editor-fold>

}