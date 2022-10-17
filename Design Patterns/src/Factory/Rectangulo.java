package Factory;

/**
 * @author Darkmoon
 */
public class Rectangulo extends Figura{
    
    private double ancho;
    private double alto;

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return alto * ancho;
    }

    @Override
    public void showData() {
        System.out.println("\nLos datos del rectangulo son: \n"
                + "Alto: " + this.getAlto()
                + "\nAncho: " + this.getAncho()
                + "\nArea: " + this.calcularArea());
    
    }
}
