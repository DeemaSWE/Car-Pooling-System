abstract class Passenger {
    private String name;
    private String Id;
    private Car reservedCar;
    private double tripCost;

    public Passenger(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public abstract void reserveCar(Car car) throws Exception;

    public void displayInfo() {
        System.out.println(" - Name: " + name);
        System.out.println(" - ID: " + Id);
        System.out.println(" - Reserved Car Code: " + reservedCar.getCode());
        System.out.println(" - Route Price: " + reservedCar.getRoute().getPrice());
        System.out.println(" - Trip Cost: " + tripCost);
    }
}
