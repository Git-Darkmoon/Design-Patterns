
package Decorator_CardTM;

/**
 * @author Darkmoon
 */

public class App_Launcher {

    public static void main(String[] args) {
        
        Card miTarjeta = new BasicCard(0);
        
        System.out.println("Saldo: " + miTarjeta.mostrarSaldo());
        
        miTarjeta.pagarPasaje();
        miTarjeta.recargarSaldo(10_000);
        miTarjeta.pagarPasaje();
        
        System.out.println("Saldo: " + miTarjeta.mostrarSaldo());

        
        Card tarjetaAbuela = new thirdAge_Card(miTarjeta);
        
        tarjetaAbuela.pagarPasaje();
        System.out.println(tarjetaAbuela.mostrarSaldo());
        
    }
    
}
