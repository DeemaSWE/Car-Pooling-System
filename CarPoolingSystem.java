public class CarPoolingSystem {

    public static void main(String[] args) {

        //Routes
        Route route1 = new Route("A1", "A2", 100);
        Route route2 = new Route("A3", "A4", 150);

        //Cars
        Car car1 = new Car("C001", route1, 3);
        Car car2 = new Car("C002", route2, 0);

        //Passengers
        Passenger[] passengers = new Passenger[2];
        passengers[0] = new Subscriber("Deema", "P001");
        passengers[1] = new NonSubscriber("Sara", "P002", true);

        //Reserve cars and display information
        try {
            passengers[0].reserveCar(car1);
            passengers[0].displayInfo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            passengers[1].reserveCar(car2);
            passengers[1].displayInfo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
