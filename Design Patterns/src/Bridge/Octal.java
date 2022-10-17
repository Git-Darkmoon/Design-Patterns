package Bridge;

/**
 *
 * @author Darkmoon
 */
public class Octal extends Calculator{

    Octal(Operation objOperation){
        this.objOperation = objOperation;
    }
    
    @Override
    void calculate(int num1, int num2) {
        
        String octal = Integer.toOctalString(objOperation.Operate(num1, num2));
        System.out.println(octal.toUpperCase());
    }
}
