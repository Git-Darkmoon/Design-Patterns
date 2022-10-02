package Factory;

/**
 * @author Darkmoon
 */
public class Circulo extends Figura{
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public void showData() {
        System.out.println("\nLos datos del circulo son: \n"
                + "Base: " + this.getRadio()
                + "\nArea: " + this.calcularArea());
    }
}
