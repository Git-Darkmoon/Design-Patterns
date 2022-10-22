package Decorator;

/**
 * @author Darkmoon
 */

public class AppLauncher {
    
    public static void showSpecs (Automovil car) {
        car.start();
        car.accel();
        car.stop();
    }

    public static void main(String[] args) {
        
    byte upgradesDone = 0;
        
    Automovil carro = new StandardCar("Mazda");
        showSpecs(carro);
    
    
    System.out.println("\n******** Car Upgraded ********\n");
    Automovil carroMejorado = new ElectricCar_Feature(carro);
        upgradesDone++;
        showSpecs(carroMejorado);

    
    System.out.println("\n******** Car Upgraded ********\n");
    Automovil carroBlindado = new ArmoredCar_Feature(carroMejorado);
        upgradesDone++;
        showSpecs(carroBlindado);

    System.out.println("\n\n- Total upgrades: " + upgradesDone);
    
    }
}
