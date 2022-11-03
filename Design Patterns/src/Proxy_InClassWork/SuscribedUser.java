
package Proxy;

/**
 * @author Estudiantes
 */

public class SuscribedUser implements User {

    @Override
    public int getIMC(float height, int weight) {
        
        float IMC_Value = (float) (weight / Math.pow(height, 2));
        System.out.println("Your IMC is: " + IMC_Value);
        return (int) IMC_Value;
    }

    @Override
    public void IMC_Details() {
        System.out.println("Details of your IMC: \n\n\tIf its under 18.5: Under weighted\n\t18.5 - 24.9: Healthy weight\n\t25.0 - 29.9: Overweighted\n\tOver 30.0: Obesity");
    }
}
