import java.util.ArrayList;

/* **********************************
File:       Main Application Starting File
Author:     Clint MacDonald
Date:       March 2024
Purpose:    Learning about custom errors and application settings
************************************* */
public class Main {

    public static void main(String[] args) {
        initializeApp();
        runApp();


    }

    private static void initializeApp() {
        System.out.printf("""
                -----------------------------------
                - Welcome to the demo application
                - Author: %s
                - Launch Date %s
                -----------------------------------
                """, AppSettings.APP_AUTHOR, AppSettings.APP_VERSION_DATE);

        Service.services = new ArrayList<Service>();
    }

    private static void runApp() {

        // create test array
        String[] serviceCodes = {"ABC", "123", "ABC12", "ABCD", "1234", "A123", "", "AB12", "ABC1", "AB02"};

        Service service1 = new Service();
        // loop to test
        for (String serviceCode: serviceCodes) {
            try {
                service1.setServiceCode(serviceCode);
                System.out.printf("\n%s - Service Code set successfully", serviceCode);
            } catch (ServiceCodeException sce) {
                System.out.printf("\n%s - There was a Service Code Error - %s",
                        serviceCode, sce.getMessage());
            }
        } // end of loop

        // test
        System.out.println("\n-----------------------\n");
        for (String serviceCode: serviceCodes) {
            try {
                Service service2 = new Service(serviceCode, "", "", 19.99f, 45f, true);
                System.out.printf("\n%s - Instantiated successfully", serviceCode);
            } catch (ServiceException se) {
                System.out.printf("\n%s - There was an error instantiating: %s",
                        serviceCode, se.getMessage());
            }
        }
    }
}