
package Decorator_CardTM;

/**
 * @author Darkmoon
 */

public interface Card {
    
    public void setSaldo(int newSaldo);
    
    public int mostrarSaldo();
    
    public int recargarSaldo(int recarga);
    
    public void pagarPasaje();
    
}
