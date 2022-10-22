package Decorator;

/**
 * @author Darkmoon
 */

public class ArmoredCar_Feature extends AutomovilDecorator {

    public ArmoredCar_Feature(Automovil auto) {
        super(auto);
    }

    @Override
    public void start() {
        System.out.println("Armor feature added.\nNow your car is bulletproof.\n");
        getAuto().start();
    }

    @Override
    public void accel() {
        System.out.println("Due to the armor the car is slower now...");
        getAuto().accel();
    }

    @Override
    public void stop() {
        getAuto().stop();
    }
}
