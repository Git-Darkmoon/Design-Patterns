/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composite;

/**
 *
 * @author Estudiantes
 */
public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Hoja Hoja1 = new Hoja("hoja A",30,80);
                Hoja Hoja2 = new Hoja("hoja A",30,80);
                Carpeta raiz = new Carpeta("Mi Carpeta",30,80);
		raiz.agregar(Hoja1);
		raiz.agregar(Hoja2);
                System.out.println(raiz.getMasa());
                raiz.eliminar(Hoja1);
                System.out.println(raiz.getMasa());
                raiz.mostrar();
    }
    
}
