//Parent Class
public class Vehicle {

    private double weight;
    private double fuel;
    private int year;
    private String brand;
    private String engineState;

    public Vehicle(double weight, double fuel, int year, String brand) {
    }

    //functions
    public void start(){
        if(this.engineState == "ON"){
            System.out.println("Vehicle Engine is already ON");
        }else{
            this.setEngineState("ON");
            System.out.println("Vehicle Engine is ON");
        }
    }

    public void stop(){
        if(this.engineState == "OFF"){
            System.out.println("Vehicle Engine is already OFF");
        }else{
            this.setEngineState("OFF ");
            System.out.println("Vehicle Engine is OFF");
        }
    }

    public void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Weight: " + weight);
        System.out.println("Year: " + year);
        System.out.println("Fuel: " + fuel);
    }

    //getter and setter
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngineState() {
        return engineState;
    }

    public void setEngineState(String engineState) {
        this.engineState = engineState;
    }
}