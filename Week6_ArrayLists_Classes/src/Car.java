/* ************************
Car Class Definition
Clint MacDonald
Feb 13 2024
First Demo of an Object Class (Instance Class)
 */
import java.util.ArrayList;

// Main Car Class Definition
public class Car {

    // static variables
    private static int autoVin = 1;

    //<editor-fold desc="Properties or Attributes">
    private int vin;
    private int year;
    private String make;
    private String model;
    private String trim;
    private String color;
    private String owner;
    //</editor-fold>

    //<editor-fold desc="Constructors">

    // default constructor
    public Car(){}

    public Car(int vin, int year, String make, String model,
        String trim, String color, String owner)
    {
        setVin(vin);
        setYear(year);
        setMake(make);
        setModel(model);
        setTrim(trim);
        setColor(color);
        setOwner(owner);
    }


    //</editor-fold>

    //<editor-fold desc="Getters and Setters">

        //<editor-fold desc="Setters">
        public void setVin(int vin) {

            if (vin == 0) {
                this.vin = autoVin;
                autoVin++;
            } else {
                this.vin = vin;
            }

        }

        public void setYear(int year) { this.year = year; }
        public void setMake(String make) { this.make = make; }
        public void setModel(String model) { this.model = model; }
        public void setTrim(String trim) { this.trim = trim; }
        public void setColor(String color) { this.color = color; }
        public void setOwner(String owner) { this.owner = owner; }

        //</editor-fold>

        //<editor-fold desc="Getters">
        public int getVin() { return this.vin; }
        public int getYear() { return this.year; }
        public String getMake() { return this.make; }
        public String getModel() { return this.model; }
        public String getTrim() { return this.trim; }
        public String getColor() { return this.color; }
        public String getOwner() { return this.owner; }
            //</editor-fold>

    //</editor-fold>

    //<editor-fold desc="Instance Methods">
    public void printCar() {
        System.out.println(String.format("""
                ---------------------
                Car %d - %d %s %s %s %s
                    owned by: %s
                ---------------------
                """, getVin(), getYear(), getColor(),
                getMake(), getModel(), getTrim(), getOwner()));
    }
    //</editor-fold>

    //<editor-fold desc="Static Methods">
    //</editor-fold>

}
