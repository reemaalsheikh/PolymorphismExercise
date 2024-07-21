import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Vehicle> rentedVehicles = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Vehicle Rental System");
        System.out.println("1. Rent a Car");
        System.out.println("2. Rent a Bike");
        System.out.println("3. Rent a Truck");
        System.out.println("4. View Rented Vechicles");
        System.out.println("5. Exit.");
        System.out.println();
        boolean exit = false;


            do {
                System.out.print("Please enter your choice: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Car Model: ");
                        String carModel = input.next();
                        System.out.print("Enter Rental Days: ");
                        int carDays = input.nextInt();
                        System.out.println("Rental Details .. ");
                        Vehicle car = new Car(carModel, carDays);
                        rentedVehicles.add(car);
                        car.displayDetails();
                        break;

                    case 2:
                        System.out.print("Enter Bike brand:");
                        String bikeBrand = input.next();
                        System.out.print("Enter Rental Hours:");
                        int bikeHours = input.nextInt();
                        System.out.println("Rental Details .. ");
                        Vehicle bike = new Bike(bikeBrand, bikeHours);
                        rentedVehicles.add(bike);
                        bike.displayDetails();
                        break;

                    case 3:
                        System.out.print("Enter Truck Type:");
                        String truckType = input.next();
                        System.out.print("Enter Rental Weeks:");
                        int truckWeeks = input.nextInt();
                        System.out.println("Rental Details .. ");
                        Vehicle truck = new Truck(truckType, truckWeeks);
                        rentedVehicles.add(truck);
                        truck.displayDetails();
                        break;

                    case 4:
                        System.out.println("Rented Vechicles: ");
                        for (Vehicle vehicle : rentedVehicles) {
                            vehicle.displayDetails();
                        }
                        break;

                    case 5:
                        exit = true;
                        System.out.println("Thank you for using the Vehicle Rental System!");
                        break;

                    default:
                        System.out.println("Invalid choice, please try again");
                }



            } while (!exit);




    }
}