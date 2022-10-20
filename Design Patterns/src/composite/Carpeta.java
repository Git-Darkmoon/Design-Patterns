/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public class Carpeta extends Componente {
    private ArrayList<Componente> hijo = new ArrayList<Componente>();
    
    public Carpeta (String nombre,double base, double altura){
		super(nombre,base,altura);
	}

    @Override
    public void agregar(Componente componente) {
        hijo.add(componente);
        componente.agregar(componente);
    }

    @Override
    public void eliminar(Componente componente) {
        hijo.remove(componente);
    }

    @Override
    public void mostrar() {
        System.out.println(nombre);
		for (int i = 0; i < hijo.size(); i++)
			hijo.get(i).mostrar();
    }

    @Override
    public double getMasa() {
        double masaTotal = 0;
        for (int i = 0; i < hijo.size(); i++){
            masaTotal+=hijo.get(i).getMasa();
        }
        masaTotal += this.masa;
        return masaTotal;   
        }
   }

