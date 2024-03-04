/* ***************************************************
File:       Service Class Definition
Author:     Clint MacDonald
Date:       March 2024
Purpose:    To Encapsulate the service object in code
****************************************************** */
import java.util.ArrayList;

public class Service {

    // global vars

    private String serviceCode;
    private String serviceName;
    private String description;
    private double basePrice;
    private double timeRequired;
    private boolean isActive;

    public Service() {
    }

    public Service(String serviceCode, String serviceName, String description,
                   double basePrice, double timeRequired, boolean isActive) {
        setServiceCode(serviceCode);
        setServiceName(serviceName);
        setDescription(description);
        setBasePrice(basePrice);
        setTimeRequired(timeRequired);
        setActive(isActive);
    }

    public Service(String serviceCode, String serviceName) {
        setServiceCode(serviceCode);
        setServiceName(serviceName);
        setDescription("");
        setBasePrice(0.00f);
        setTimeRequired(0);
        setActive(false);
    }

    public String getServiceCode()  { return this.serviceCode; }
    public String getServiceName()  { return this.serviceName; }
    public String getDescription()  { return this.description; }
    public double getBasePrice()    { return this.basePrice; }
    public double getTimeRequired() { return this.timeRequired; }
    public boolean getIsActive()    { return this.isActive; }

    public void setServiceCode(String serviceCode) {
        if (serviceCode.length() == 4) {
            this.serviceCode = serviceCode;

//            if (isServiceCodeUnique(serviceCode)) {
//                this.serviceCode = serviceCode;
//            } else {
//                System.out.println("Service Code is not unique!");
//            }
        } else {
            System.out.println("Service code must be a 4-digit alphanumeric value!");
        }
    }

    public void setServiceName(String serviceName) {
        if (serviceName.length() > 50) {
            System.out.println("50 character max exceeded.");
        } else {
            this.serviceName = serviceName;
        }

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBasePrice(double basePrice) {
        if (basePrice < 0 || basePrice > 5000) {
            System.out.println("Price out of range 0-5000.");
        } else {
            this.basePrice = basePrice;
        }

    }

    public void setTimeRequired(double timeRequired) {
        if (timeRequired < 0 || timeRequired > 100) {
            System.out.println("Time for service outside of range.");
        }
        this.timeRequired = timeRequired;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    @Override
    public String toString() {
        return "Services{" +
                "serviceCode='" + this.serviceCode + '\'' +
                ", serviceName='" + this.serviceName + '\'' +
                ", description='" + this.description + '\'' +
                ", basePrice=" + this.basePrice +
                ", timeRequired=" + this.timeRequired +
                ", isActive=" + this.isActive +
                '}';
    }

    public void flipActive() {
        this.isActive = !this.isActive;
    }

    private void setDefaults() {
        this.serviceCode = "";
        this.serviceName = "Default Service";
        this.description = "";
        this.basePrice = 0.00;
        this.timeRequired = 0.00;
        this.isActive = false;
    }

    public static String toTable(ArrayList<Service> services) {
        StringBuilder table = new StringBuilder();
        table.append(String.format("| %-10s | %-50s | %-10s | %-10s | %-10s | %-10s |%n", "Code", "Name", "Price", "Time", "Active", "Description"));
        table.append("|------------|--------------------------------------------------|------------|------------|------------|------------|%n");
        for (Service service : services) {
            table.append(String.format("| %-10s | %-50s | %-10.2f | %-10.2f | %-10b | %-10s |%n",
                    service.getServiceCode(), service.getServiceName(), service.getBasePrice(),
                    service.getTimeRequired(), service.getIsActive(), service.getDescription()));
        }
        return table.toString();
    }

    public static double getPrice(String serviceCode, ArrayList<Service> services) {
        for (Service service : services) {
            if (service.getServiceCode().equals(serviceCode)) {
                return service.getBasePrice();
            }
        }
        return 0.00;
    }

    public static Service findService(String serviceCode, ArrayList<Service> services) {
        for (Service service : services) {
            if (service.getServiceCode().equals(serviceCode)) {
                return service;
            }
        }

        //returns null when object related with the service code is not found.
        return null;
    }

//    private static Boolean isServiceCodeUnique(String serviceCode) {
//        for (Service service: services) {
//            if (service.serviceCode.equalsIgnoreCase(serviceCode)) return false;
//        }
//        return true;
//    }
}
