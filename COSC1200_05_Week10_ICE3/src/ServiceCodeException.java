/* **********************************
File:       Service Code Custom Exception Definition
Author:     Clint MacDonald
Date:       March 2024
Purpose:    To have a way to handle errors from our custom service class
            specific to the Service Code attribute itself
************************************* */


public class ServiceCodeException extends Exception {

    // error code
    private static final long serialVersionUID = 1L;

    public ServiceCodeException(String message) {
        super(message);
    }
}
