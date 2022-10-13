/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridgeclase;

/**
 *
 * @author Estudiantes
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Implementacion objSuma = new Suma();
        Implementacion objResta = new Resta();
        Abstraccion CalculadoraHexadecimalSuma = new Hexadecimal(objSuma);
        Abstraccion CalculadoraHexadecimalResta = new Hexadecimal(objResta);
        
        CalculadoraHexadecimalSuma.calculadora(5, 5);
        CalculadoraHexadecimalResta.calculadora(106746, 135);
        
    }
    
}
