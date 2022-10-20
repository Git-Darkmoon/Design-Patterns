/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author Estudiantes
 */
public abstract class Componente {
    protected String nombre;
    protected double base,altura;
    protected double masa;
    
	public Componente (String nombre,double base, double altura)
	{
		this.nombre = nombre;
                this.base = base;
                this.altura = altura;
                this.masa = (base*altura)/100; /*Formula random para hallar masa*/
	}
	abstract public void agregar(Componente c);
	abstract public void eliminar(Componente c);
	abstract public void mostrar();
        abstract public double getMasa();
}
