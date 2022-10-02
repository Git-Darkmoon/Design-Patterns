package Adapter;

import java.util.Scanner;

public class AdapterLauncher {
    
    /* En este caso la clase Adaptador hereda de CajaEuros 
    (en lugar de contener una referencia a un objeto de dicho tipo, 
    para así poder acceder directamente a sus métodos. */
    
    public static void main(String[] args) {
        
        Adapter_Calculator calculator = new Adapter_Calculator();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter values for the sum: ");
        int n1Sum = input.nextInt();
        int n2Sum = input.nextInt();
        System.out.println("The sum will be: " + calculator.Sum(n1Sum, n2Sum));

        System.out.println("\nEnter values for the multiplication: ");
        int n1Times = input.nextInt();
        int n2Times = input.nextInt();

        System.out.println("The multiplication will be: " + calculator.Times(n1Times, n2Times));
    }
}
