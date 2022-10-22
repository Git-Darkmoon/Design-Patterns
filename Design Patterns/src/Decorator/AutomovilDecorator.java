package Decorator;

/**
 * @author Darkmoon
 */

public abstract class AutomovilDecorator implements Automovil {
    
    private Automovil auto;

    public AutomovilDecorator(Automovil auto) {
        this.auto = auto;
    }

    protected Automovil getAuto() {
        return auto;
    }
    
}
