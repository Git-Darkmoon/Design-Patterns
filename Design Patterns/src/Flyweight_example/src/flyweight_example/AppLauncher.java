
package flyweight_example;

/**
 * @author Estudiantes
 */

public class AppLauncher {
    
    static DiamondFactory diamondFactory = new DiamondFactory();
     
    public static void main(String[] args) {
     
       for(int x = 1; x < 3; x = x + 1) {
          diamondFactory.getDiamond("Type A");
          System.out.println("\tA diamond type A was drawn in position (x, y)=("+x+",10)");
       }
        
        System.out.println("\n");
       
       for(int x = 1; x < 2; x = x + 1) {
          diamondFactory.getDiamond("Type B");
          System.out.println("\tA diamond type B was drawn in position (x, y)=("+x+",10)");
       }
       
       for(int x = 1; x < 6; x = x + 1) {
          diamondFactory.getDiamond("Type C");
          System.out.println("\tA diamond type C was drawn in position (x, y)=("+x+",10)");
       }
       
        System.out.println("\n");
       
    }
    
}
