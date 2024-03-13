/* **********************************
File:       Faculty Object Class Definition
Author:     Clint MacDonald
Date:       March 2024
Purpose:    Programming our first child class through inheritance
************************************* */

import java.math.BigInteger;

public class Faculty extends People {

    //<editor-fold desc="Global Vars and Constants">
    private final static String DEFAULT_FACULTY = "unknow";
    private final static String DEFAULT_SUPERVISOR = "tbd";
    private final static int DEFAULT_SIN = 0;
    private final static String DEFAULT_CREDENTIALS = "unknown";
    private final static int DEFAULT_STEP_RATING = 6;
    //</editor-fold>

    //<editor-fold desc="Properties">
    private String faculty;
    private String supervisor;
    private int sin;
    private String credentials;
    private int stepRating;
    //</editor-fold>

    //<editor-fold desc="Getters">

    public String getFaculty() { return faculty;}
    public String getSupervisor() {return supervisor;}
    public int getSin() {return sin;}
    public String getCredentials() {return credentials;}
    public int getStepRating() {return stepRating;}
    //</editor-fold>

    //<editor-fold desc="Setters">
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    public void setSin(int sin) {
        this.sin = sin;
    }
    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }
    public void setStepRating(int stepRating) {
        this.stepRating = stepRating;
    }
    //</editor-fold>

    //<editor-fold desc="Defaults">
    public void setFacultyDefaults(){
        setFaculty(DEFAULT_FACULTY);
        setSupervisor(DEFAULT_SUPERVISOR);
        setSin(DEFAULT_SIN);
        setCredentials(DEFAULT_CREDENTIALS);
        setStepRating(DEFAULT_STEP_RATING);
    }
    //</editor-fold>

    //<editor-fold desc="Constructors">

    // default constructor
    public Faculty() {

        this(DEFAULT_FACULTY, DEFAULT_SUPERVISOR, DEFAULT_SIN, DEFAULT_CREDENTIALS, DEFAULT_STEP_RATING);
        //super.setDefaults();
        //this.setFacultyDefaults();
    }

    // local parameterized constructor
    private Faculty(String faculty, String supervisor, int sin,
                   String credentials, int stepRating){
        super();
        setFaculty(faculty);
        setSupervisor(supervisor);
        setSin(sin);
        setCredentials(credentials);
        setStepRating(stepRating);
    }

    // full parameterized constructor
    public Faculty(String firstName, String lastName,
                   int dobMonth, int dobDay, int dobYear,
                   String phone, String email, String address,
                   String faculty, String supervisor, int sin,
                   String credentials, int stepRating) {

        // run the constructor from the parent class
        super(firstName, lastName, dobMonth, dobDay, dobYear,
        phone, email, address);
        // set the property values for the current instance of faculty
        setFaculty(faculty);
        setSupervisor(supervisor);
        setSin(sin);
        setCredentials(credentials);
        setStepRating(stepRating);
    }

    //</editor-fold>

    //<editor-fold desc="Instance Methods">
    @Override
    public String toString() {
        return String.format("""
            Person: %s %s %s
            DOB (mm-dd-yy): %d-%d-%d
            Faculty: %s
            Phone: %s
            Email: %s
            Supervisor: %s
            """, getFirstName(), getLastName(), getCredentials(),
                getDobMonth(), getDobDay(), getDobYear(), getFaculty(),
                formatPhoneNumber(getPhone()), getEmail(), getSupervisor());
    }

    public String formatPhoneNumber(String phone) {
        String retVal = "";

        try {
            String areaCode = phone.substring(0,3);
            String first3 = phone.substring(3,6);
            String last4 = phone.substring(6,10);
            retVal = String.format("(%3s) %3s-%4s", areaCode, first3, last4);
        } catch (Exception e) {
            retVal = phone.toString();
        }

        return retVal;
    }
    //</editor-fold>
}
