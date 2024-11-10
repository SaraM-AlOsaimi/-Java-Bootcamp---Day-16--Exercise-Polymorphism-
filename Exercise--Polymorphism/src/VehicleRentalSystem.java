import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleRentalSystem {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

     List<Vehicle> rentedVehicles = new ArrayList<>();


     
     int choice;
     do {
         System.out.println("Vehicle Rental System:");
         System.out.println("1. Rent a Car");
         System.out.println("2. Rent a Bike ");
         System.out.println("3. Rent a Truck ");
         System.out.println("4. View Rented Vehicles ");
         System.out.println("5. Exit");
         System.out.println("Enter your choice: ");
          choice = in.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter Car Model: ");
                String carModel = in.next();
                System.out.println("Enter Rental Days: ");
                int rentalDays = in.nextInt();
                Vehicle car = new Car(carModel, rentalDays);
                rentedVehicles.add(car);
                System.out.println("Rental Details: ");
                car.displayDetails();
                break;
            case 2:
                System.out.println("Enter Bike Brand: ");
                String bikeBrand = in.next();
                System.out.println("Enter Rental Hours: ");
                int rentalHours = in.nextInt();
                Vehicle bike = new Bike(bikeBrand,rentalHours);
                rentedVehicles.add(bike);
                System.out.println("Rental Details: ");
                bike.displayDetails();
                break;
            case 3:
                System.out.println("Enter Truck type: ");
                String truckType = in.next();
                System.out.println("Enter Rental Weeks: ");
                int rentalWeeks = in.nextInt();
                Vehicle truck = new Truck(truckType,rentalWeeks);
                rentedVehicles.add(truck);
                System.out.println("Rental Details: ");
                truck.displayDetails();
                break;
            case 4:
                System.out.println("Rented Vehicles: ");
                for (Vehicle vehicle : rentedVehicles){
                    vehicle.displayDetails();
                }
                System.out.println("---------------");
                break;
            case 5:
                System.out.println("Thank you for using the Vehicle Rental System!");
                break;

            default:
                System.out.println("Invalid choice. please try again! ");
        }

     } while (choice != 5);



    }
}