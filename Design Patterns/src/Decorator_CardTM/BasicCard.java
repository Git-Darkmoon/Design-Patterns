
package Decorator_CardTM;

/**
 * @author Darkmoon
 */

public class BasicCard implements Card {
    
    private int saldo;

    public BasicCard(int saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public int mostrarSaldo() {
        return saldo;
    }

    @Override
    public int recargarSaldo(int recarga) {
        return saldo += recarga;
    }

    @Override
    public void pagarPasaje() {
        
        if (saldo <= 0) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= 2_650;
            System.out.println("\nGracias.");
        }
        
         setSaldo(saldo);
    }
}

