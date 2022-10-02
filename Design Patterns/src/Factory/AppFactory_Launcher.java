
package Factory;

/**
 * @author Darkmoon
 * EJERCICIO: Implementar el design pattern Factory, para la creacion de figuras geometricas. 
 */

public class AppFactory_Launcher {
    
    public static void main(String[] args) {
        
        Figura figure = FiguraFactory.crearFigura(TipoFigura.TRIANGULO);
        
        /* Aqui se hara un "casting", dado que crearFigura() no nos de
            un triangulo directamente sino que crea objetos de la
            clase TipoFigura
        */
        
        System.out.println("Creacion de los objetos:");
        
        Triangulo triangle = (Triangulo) figure;
        triangle.setBase(5);
        triangle.setAltura(3);
        
        triangle.showData();

        figure = FiguraFactory.crearFigura(TipoFigura.RECTANGULO);
        Rectangulo rectangle = (Rectangulo) figure;
        rectangle.setAlto(12);
        rectangle.setAlto(4);
        
        rectangle.showData();
        
        
        figure = FiguraFactory.crearFigura(TipoFigura.CIRCULO);
        Circulo circle = (Circulo) figure;
        circle.setRadio(11);
        
        circle.showData();
        
    }
}
