package flyweight_example;

import java.util.HashMap;

/**
 * @author Estudiantes
 */

public class DiamondFactory {
    
    private final HashMap <String, Diamond> diamondsList = new HashMap <>();
     
    public Diamond getDiamond(String diamondType) {
         
        Diamond diamond = diamondsList.get(diamondType);
         
        if (diamond == null) {
            
            String border; 
            String background; 
            
            if (null != diamondType) switch (diamondType) {
                case "Type A" -> {
                    
                    border = "2px solid salmon";
                    background = "lavender";
                    
                    diamond = new Diamond_typeA(border,background);
                    diamondsList.put("Type A", diamond);
                    System.out.println("A Diamond type A was CREATED and saved in memory with:\nBorder: " + border + ".\nBackground: " + background + "\n");
                }
                case "Type B" -> {
                    
                    border = "2px dotted turqouise";
                    background = "aliceblue";
                    
                    diamond = new Diamond_typeB(border,background);
                    diamondsList.put("Type B", diamond);
                    System.out.println("A Diamond type B was CREATED and saved in memory with:\nBorder: " + border + "\nBackground: " + background + "\n");
                }
                case "Type C" -> {
                    
                    border = "4px solid black";
                    background = "goldenrod";
                    
                    diamond = new Diamond_typeC(border,background);
                    diamondsList.put("Type C", diamond);
                    System.out.println("A Diamond type C was CREATED and saved in memory with:\nBorder: " + border + "\nBackground: " + background + "\n");
                }
                default -> {
                }
            }
 
        }
 
        return diamond;
    }  
    
}
