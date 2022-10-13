/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgeclase;

/**
 *
 * @author Estudiantes
 */
public class Hexadecimal extends Abstraccion{
    
    Hexadecimal(Implementacion objImplementacion){
        this.objImplementacion = objImplementacion;
    }
    @Override
    void calculadora(int num1, int num2) {
         String hexa2 = Integer.toHexString(objImplementacion.Operacion(num1, num2));
         System.out.println(hexa2);
    }

    
}
