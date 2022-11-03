package Proxy;

/**
 *
 * @author Estudiantes
 */
public class AppLauncher {
    
     public static void main(String[] args) {
        
        boolean isUserOne_Suscribed = false;
        User userOne = new UserProxyHandler(isUserOne_Suscribed).getUser();
        
        boolean isUserTwo_Suscribed = true;
        User userTwo = new UserProxyHandler(isUserTwo_Suscribed).getUser();
        
        // Enter the height in meters and the weight in kg with no commas.
        
        userOne.getIMC((float) 1.83,78);
        userOne.IMC_Details();
        
         System.out.println("\n");
        
        userTwo.getIMC((float) 1.72, 82);
        userTwo.IMC_Details();
                
    }
}
