package Decorator_CardTM;

/**
 * @author Darkmoon
 */

public abstract class CardDecorator implements Card {

    private Card tarjetaTM;

    public CardDecorator(Card tarjetaTM) {
        this.tarjetaTM = tarjetaTM;
    }

    protected Card getCard() {
        return tarjetaTM;
    }
    
}
