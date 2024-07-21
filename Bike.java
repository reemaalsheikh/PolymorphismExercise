public class Bike implements Vehicle{
    private  final  double hourlyRate = 10.0;
    private String brand;
    private double hours;

    public Bike(String brand, double hours) {
        this.brand = brand;
        this.hours = hours;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getHour() {
        return hours;
    }

    public void setHour(double hour) {
        this.hours = hour;
    }

    @Override
    public double calculateRentalCost() {
        return hours * hourlyRate;
    }

    @Override
    public void displayDetails() {

        System.out.println("Bike Brand: " + brand);
        System.out.println("Hourly rental rate: $" + hourlyRate);
        System.out.println("Rental cost: $" + calculateRentalCost());
        System.out.println();

    }
}
