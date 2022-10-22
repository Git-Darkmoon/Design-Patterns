package Decorator;

/**
 * @author Darkmoon
 */

public class ElectricCar_Feature extends AutomovilDecorator {

    public ElectricCar_Feature(Automovil auto) {
        super(auto);
    }

    @Override
    public void start() {
        System.out.println("Starting electric way.");
        getAuto().start();
    }
    
    @Override
    public void accel() {
        getAuto().accel();
    }

    @Override
    public void stop() {
        System.out.println("Elctric ABS brakes activated.");
        getAuto().stop();
    }
    
}
