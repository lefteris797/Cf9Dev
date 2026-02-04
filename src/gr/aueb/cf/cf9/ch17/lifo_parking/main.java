package gr.aueb.cf.cf9.ch17.lifo_parking;

public class main {
    public static void main(String[] args) {

        LifoParking parking = new LifoParking();
        parking.addCar("A234");
        parking.addCar("B234");
        parking.addCar("C234");

        String car = parking.removeCar();
        System.out.println(car);

        car = parking.removeCar();
        System.out.println(car);
    }
}
