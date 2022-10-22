package Decorator;

/**
 * @author Darkmoon
 */

public class StandardCar implements Automovil{

    private final String carName;
    
    public StandardCar(String s) {
        carName = s;
    }
    
    @Override
    public void accel() {
        System.out.println("Standard acceleration");
    }

    @Override
    public void stop() {
        System.out.println("Braking !!");
    }

    @Override
    public void start() {
        System.out.println("Starting the car...");
    }
    
}
