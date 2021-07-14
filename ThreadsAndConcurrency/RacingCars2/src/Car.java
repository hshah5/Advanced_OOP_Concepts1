public class Car {
    public double miles;
    public double odometer;
    public String name;
    public double maxMiles;

    public Car(String name, double miles) {
        this.name = name;
        this.miles = miles;
        odometer = 0;
        this.maxMiles = miles;
    }

    public void move(double miles) {
        this.miles = miles>0?this.miles -miles:0;
        this.odometer+= miles;
    }

    public void charge() {
        this.miles = maxMiles;
    }

    public String toString() {
        return name + ": odo : " + odometer + "- miles left: " + miles;
    }
 /* TODO 
Exact same methods and constructor as the Car in task 1*/
}
