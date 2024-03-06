/* **********************************
File:       COCS1200 05 - Week 8
Author:     Clint MacDonald
Date:       March 2024
Purpose:    Coding Inheritance
************************************* */

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        People person = new People();
        System.out.print(person.toString());

        System.out.println("------------------------");
        //person.

        Faculty clint = new Faculty();
        clint.setFirstName("Clint");
        clint.setSupervisor("Nazeem");
        //clint.toString();

        Faculty clint2 = new Faculty("Clint", "MacDonald", 5, 16, 1972, 9055551212f,
                "clint.macdonald@durhamcollege.ca", "2000 Simcoe St. N, Oshawa",
                "SEIT", "Nazneen", 123456789, "BASc", 17);

        System.out.print(clint2.toString());

        System.out.println("------------------------");

        Faculty emid = new Faculty();
        emid.setFirstName("Emidio");
        emid.setFaculty("SEIT");
        System.out.print(emid.toString());
    }

}