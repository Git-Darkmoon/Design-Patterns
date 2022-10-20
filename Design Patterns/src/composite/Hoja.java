/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author Estudiantes
 */
public class Hoja extends Componente{
    
    public Hoja(String nombre,double base,double altura){
        super(nombre,base,altura);
    }

    @Override
    public void agregar(Componente c) {
        System.out.println("Se está agregando una hoja");
    }

    @Override
    public void eliminar(Componente c) {
        System.out.println("Se eliminó una hoja");
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre = "+nombre+ "\n Base Hoja= "+base+" \n Altura Hoja= "+altura);
 
    }

    @Override
    public double getMasa() {
        return masa;
    }
    
}
