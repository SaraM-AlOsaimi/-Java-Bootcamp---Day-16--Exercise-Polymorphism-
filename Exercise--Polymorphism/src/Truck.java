public class Truck implements Vehicle{


    private String type;
    private int week;

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // For Truck, use a weekly rate of $500

    @Override
    public double calculateRentalCost() {
        return week * 500;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck type: " + type);
        System.out.println("Weekly rental rate: " + 500 + " SAR");
        System.out.println("Rental cost: " + calculateRentalCost() + " SAR");
        System.out.println("---------------");
    }

}
