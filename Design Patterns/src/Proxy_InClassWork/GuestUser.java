
package Proxy;

/**
 * @author Estudiantes
 */

public class GuestUser implements User {

    @Override
    public int getIMC(float height, int weight) {
        
        float IMC_Value = (float) (weight / Math.pow(height, 2));
        System.out.println("Your IMC is: " + IMC_Value);
        return (int) IMC_Value;
    }

    @Override
    public void IMC_Details() {
        System.out.println("You must have a suscription to see the details...");
    }
    
}
