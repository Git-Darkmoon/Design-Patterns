package Bridge;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Darkmoon
 * This class acts as the "Launcher".
 */
public class Client {
  
    public static void main(String[] args) {
        /*
        Operation objSuma = new Sum();
        Operation objResta = new Difference();
        
        Calculator hexaSum = new Hexadecimal(objSuma);
        Calculator hexaDiff = new Hexadecimal(objResta);
        
        Calculator octaSum = new Octal(new Sum());
        Calculator octaDiff = new Octal(new Difference());
        
        hexaSum.calculate(5, 5);
        hexaDiff.calculate(106746, 135);
        
        octaSum.calculate(78, 2);
        octaDiff.calculate(23, 82);
*/
        JOptionPane.showMessageDialog(null, "The box only accept text (letters) and numbers below ten.");
        
        String n1 = JOptionPane.showInputDialog("Enter the first number: ").toLowerCase();
        String n2 = JOptionPane.showInputDialog("Enter the second number: ").toLowerCase();
        
        Calculator hexaSum = new Hexadecimal(new Sum());
        System.out.print("Suma en hexadecimal de " + n1 + " + " + n2 + ": ");
        hexaSum.calculate(new InputAdapter().adapt(n1), new InputAdapter().adapt(n2));
        
        Calculator hexaDiff = new Hexadecimal(new Difference());
        System.out.print("Resta en hexadecimal de " + n1 + " - " + n2 + ": ");
        hexaDiff.calculate(new InputAdapter().adapt(n1), new InputAdapter().adapt(n2));
        
        Calculator octaSum = new Octal(new Sum());
        System.out.print("Suma en octal de " + n1 + " + " + n2 + ": ");
        octaSum.calculate(new InputAdapter().adapt(n1), new InputAdapter().adapt(n2));
    }
}
