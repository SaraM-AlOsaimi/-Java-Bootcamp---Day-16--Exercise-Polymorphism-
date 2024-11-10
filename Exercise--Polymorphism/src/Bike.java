public class Bike implements Vehicle{

 // For Bike, use an hourly rate of $10
    private String brand;
    private int hour;

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return hour * 10;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand : " + brand);
        System.out.println("Hourly rental rate: " + 10 + " SAR");
        System.out.println("Rental cost: " + calculateRentalCost() + " SAR");
        System.out.println("---------------");
    }
}