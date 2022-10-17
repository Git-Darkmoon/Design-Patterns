package Bridge;

/**
 *
 * @author Darkmoon
 * This class is a concrete abstraction.
 */
public class Hexadecimal extends Calculator{

    private final Operation objOperation;
    
    Hexadecimal(Operation objOperation){
        this.objOperation = objOperation;
    }
    
    @Override
    void calculate(int num1, int num2) {
         String hexa = Integer.toHexString(objOperation.Operate(num1, num2));
         System.out.println(hexa.toUpperCase());
    }
}
