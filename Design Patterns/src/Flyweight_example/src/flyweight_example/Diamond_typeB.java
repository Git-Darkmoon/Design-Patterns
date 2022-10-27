
package flyweight_example;

/**
 * @author Estudiantes
 */

public class Diamond_typeB extends Diamond {

    public Diamond_typeB(String border, String background) {
        super(border, background);
    }

    
    @Override
    public void build(){
        System.out.println("A diamond type A has been built.");
    }
    
}
