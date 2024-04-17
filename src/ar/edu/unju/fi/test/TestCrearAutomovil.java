package ar.edu.unju.fi.test;

import ar.edu.unju.fi.model.Automovil;
import ar.edu.unju.fi.model.constantes.Colores;

public class TestCrearAutomovil {

	public static void main(String[] args) {
		
		Automovil automovil = new Automovil();
		automovil.setMarca("Renault");
		automovil.setColor(Colores.AZUL);
		
		System.out.println("Marca: "+automovil.getMarca());
		System.out.println("Color: "+automovil.getColor());

	}

}
