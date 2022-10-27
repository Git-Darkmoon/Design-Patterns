
package flyweight_example;

/**
 *
 * @author Estudiantes
 */
public abstract class Diamond {
    
    protected String border;
    protected String background;

    public Diamond(String border, String background) {
        this.border = border;
        this.background = background;
    }
    
    // This method builds a diamond.
    public abstract void build();
    
}
