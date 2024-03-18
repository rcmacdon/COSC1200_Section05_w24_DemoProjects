/* **********************************
File:       General Service Exception Definition
Author:     Clint MacDonald
Date:       March 2024
Purpose:    To consolidate all other specific exceptions
            into a single exception to propagate to UI
************************************* */

public class ServiceException extends Exception {
    // error code
    private static final long serialVersionUID = 2L;

    public ServiceException(String message) {
        super(message);
    }
}
