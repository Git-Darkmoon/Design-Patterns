package Decorator_CardTM;

/**
 * @author Darkmoon
 */

public class thirdAge_Card extends CardDecorator {

    public thirdAge_Card(Card tarjetaTM) {
        super(tarjetaTM);
    }
    
    @Override
    public int mostrarSaldo() {
        return getCard().mostrarSaldo();
    }

    @Override
    public int recargarSaldo(int recarga) {
        return getCard().recargarSaldo(recarga);
    }

    @Override
    public void pagarPasaje() {
        
        if (getCard().mostrarSaldo() <= 0) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("\nGracias.");
             getCard().setSaldo(getCard().mostrarSaldo() - 1650);
        }
    }

    @Override
    public void setSaldo(int newSaldo) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
