public class Car extends Vehicle {

    private final String bodyStyle;

    public Car(double weight, double fuel, int year, String brand, String bodyStyle){
        super(weight, fuel, year, brand);
        this.bodyStyle = bodyStyle;
    }
    public void carDetails() {  //details of car
        printDetails();         //calling method from parent class
        System.out.println("Body Style: " + bodyStyle);
    }

    public void start() {
        System.out.println("Your Car engine is On");
    }

    public void stop() {
        System.out.println("Your Car engine is Off");
    }

    public static void main(String[] args){
        Car tesla = new Car(100, 0, 2022, "Tesla", "SUV");//creating object
        tesla.start();//calling method
        tesla.carDetails();

        Car jazz = new Car(70, 50, 2017, "Honda", "SUV");
        jazz.carDetails();
        jazz.stop();

        Car elantraSedan = new Car(100, 75, 2019, "Elantra", "Sedan");
        elantraSedan.carDetails();
    }
}



