class NonSubscriber extends Passenger {
    private boolean discount;

    public NonSubscriber(String name, String Id, boolean discount) {
        super(name, Id);
        this.discount = discount;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getCapacity() == 0)
            throw new Exception("Cannot reserve car for passenger with id: " + getId() + ". The capacity of the car is zero!");

        if (discount)
            setTripCost(car.getRoute().getPrice() - (car.getRoute().getPrice() * 0.1));
        else
            setTripCost(car.getRoute().getPrice());

        setReservedCar(car);
        System.out.println("Successfully reserved car for passenger with id: " + getId());
    }

    @Override
    public void displayInfo() {
        System.out.println("Non-Subscriber Information:");
        super.displayInfo();
        if (discount)
            System.out.println(" - Discount: 10%");
        else
            System.out.println(" - Discount: No coupon");
        System.out.println("-----------------------------");
    }
}