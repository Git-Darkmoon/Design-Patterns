package Bridge;

/**
 * @author Darkmoon
 This class is going to be the Calculator.
 */

public abstract class Calculator {
     public Operation objOperation;
     
     abstract void calculate(int num1, int num2);
}