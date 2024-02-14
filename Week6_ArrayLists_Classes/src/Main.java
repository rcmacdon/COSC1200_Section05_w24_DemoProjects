/* ****************************
    COSC1200 - 05 - Week 6
    Clint MacDonald
    Feb 12, 2024
    Array Lists and Classes
 */

import java.sql.Array;
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

        System.out.println("""
                *********************************
                4 Pillars of OOP
                *********************************
                
                1. Encapsulation
                2. Inheritance
                3. Abstraction
                4. Polymorphism
                
                
                """);
        Tools.pauseProgram();


        //<editor-fold desc="Encapsulation">
        System.out.println("""
                ENCAPSULATION
                -------------------------------------------------------------------------
                - the bundling of data with the methods that operate on that data
                - hides structure of data inside a class preventing un-authorized access
                     - usually done through accessors (private, protected, public)
                - The tools.java is one example
                    - compared to a ProjectileMotion class or a Darts class
                - usually a property of object classes... Week 7
                """);
        Tools.pauseProgram();
        //</editor-fold>


        //<editor-fold desc="Inheritance">
        System.out.println("""
                INHERITANCE
                --------------------------------------------------------------
                - object classes define an object and its properties/methods
                - inheritance is used when child objects share common properties/methods
                - similar to 1-1 relationships from databases
                
                EXAMPLE:
                cars, trucks, and motorcycles share many common properties
                - could create a common object type called "Vehicle"
                    - then sub types "car", "truck", and "motorcycle" that all inherit
                      common properties from vehicle and contain only those properties
                      specific to each sub-type.
                """);
        Tools.pauseProgram();
        //</editor-fold>


        //<editor-fold desc="Abstraction">
        System.out.println("""
                ABSTRACTION
                -------------------------------------------------------------------------
                - Hiding implementation details but exposes functionality
                - ideas not events
                    - only know "what it does" vs. "how it does"
                    
                Example:
                A driver will focus on the car functionality (Start/Stop -> Accelerate/ Break),
                he/she does not bother about how the Accelerate/Brake mechanism works internally.
                """);


        Tools.pauseProgram();
        //</editor-fold>


        //<editor-fold desc="Polymorphism">
        System.out.println("""
                POLYMORPHISM
                -------------------------------------------------------------------------
                - Is the process of creating a generic version of an object, but when it is
                  accessed, the code determines exactly which form it takes.  Each instance
                  of the object can be very different, but are similar enough they can be
                  accessed through a common interface.
                  i.e. each individual object is an independent instance of a common object type
                """);
        Tools.pauseProgram();
        //</editor-fold>

        Tools.pauseProgram();
    }
    //</editor-fold>

    //<editor-fold desc="Object Classes">
    private static void demo3(){

        String stringName = new String("John");

        Car car1 = new Car();
        car1.setVin(0);
        car1.setYear(2022);
        car1.setMake("Toyota");
        car1.setModel("Camry");
        car1.setTrim("DX");
        car1.setColor("Bronze");
        car1.setOwner("Toyota Canada");

        Car car2 = new Car(0, 1999, "Honda", "Civic", "LX", "Yellow", "Sam");

        System.out.println(String.format("""
                ---------------------
                Car %d - %d %s %s %s %s
                    owned by: %s
                ---------------------
                """, car2.getVin(), car2.getYear(), car2.getColor(),
                car2.getMake(), car2.getModel(), car2.getTrim(), car2.getOwner()));

        // but WAY WAY WAY better
        System.out.println("Method Printing!");
        car1.printCar();
        car2.printCar();

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);

        cars.add(new Car(0,2015,"Subaru","Forrester","M", "White", "Bob"));

        for (Car car: cars) { car.printCar(); }

        Tools.pauseProgram();
    }
    //</editor-fold>

}