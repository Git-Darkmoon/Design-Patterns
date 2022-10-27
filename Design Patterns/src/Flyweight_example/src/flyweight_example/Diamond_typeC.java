
package flyweight_example;

/**
 * @author Estudiantes
 */

public class Diamond_typeC extends Diamond {

    public Diamond_typeC(String border, String background) {
        super(border, background);
    }

    
    @Override
     public void build(){
        System.out.println("A diamond type A has been built.");
    }
    
}
