/* **********************************
File:       Application Settings Static Class
Author:     Clint MacDonald
Date:       March 2024
Purpose:    To retrieve application settings and load
            applications settings from files (next week)
************************************* */
import java.time.LocalDate;

public class AppSettings {

    //<editor-fold desc="Application Settings">
    public static final String APP_AUTHOR = "Clint MacDonald";
    public static final LocalDate APP_VERSION_DATE = LocalDate.of(2024, 3, 18);
    //</editor-fold>

    //<editor-fold desc="Runtime and Configuration Settings">

        //<editor-fold desc="Service Settings">
        public static class Service {
            public static final int SERVICE_CODE_LENGTH = 4;
            public static final String SERVICE_CODE_PATTERN = "^[A-Z]{2}\\d{2}$|^[A-Z]{3}\\d{1}$";
            // pattern obtained from MicroSoft co-pilot

            public static final double MIN_BASE_PRICE = 0f;
            public static final double MAX_BASE_PRICE = 5000f;

            public static final String DEFAULT_SERVICE_CODE = "";
            public static final String DEFAULT_SERVICE_NAME = "default name";
            public static final String DEFAULT_DESCRIPTION = "description";
            public static final double DEFAULT_BASE_PRICE = 0f;
            public static final double DEFAULT_TIME_REQUIRED = 15f;
            public static final boolean DEFAULT_IS_ACTIVE = false;
        }
        //</editor-fold>

        //<editor-fold desc="Car Settings">
        public static class Car {}
        //</editor-fold>

        //<editor-fold desc="Maintenance Settings">
        public static class Maintenance {}
        //</editor-fold>

    //</editor-fold>

}
