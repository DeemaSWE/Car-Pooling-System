class Subscriber extends Passenger {
    public Subscriber(String name, String Id) {
        super(name, Id);
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getCapacity() == 0)
            throw new Exception("Cannot reserve car for passenger with id: " + getId() + ". The capacity of the car is zero!");

        setTripCost(car.getRoute().getPrice() * 0.5);
        setReservedCar(car);
        System.out.println("Successfully reserved car for passenger with id: " + getId());
    }

    @Override
    public void displayInfo() {
        System.out.println("Subscriber Information:");
        super.displayInfo();
        System.out.println(" - Discount: 50%");
        System.out.println("-----------------------------");
    }
}
