public class Truck implements Vehicle {
    private String type;
    private int weeks;

    public Truck(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return weeks;
    }

    public void setWeek(int weeks) {
        this.weeks = weeks;
    }




    @Override
    public double calculateRentalCost() {
        return weeks *500.0;
    }

    public void displayDetails() {
        System.out.println();
        System.out.println("Truck Type: " + type);
        System.out.println("Weekly rental rate:$500");
        System.out.println("Rental Cost: $" + calculateRentalCost());
        System.out.println();

    }
}
