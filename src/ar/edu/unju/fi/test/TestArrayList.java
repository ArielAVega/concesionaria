package ar.edu.unju.fi.test;

import java.util.ArrayList;
import java.util.Iterator;

import ar.edu.unju.fi.model.Automovil;
import ar.edu.unju.fi.model.Cliente;
import ar.edu.unju.fi.model.GenericoDosAtributos;
import ar.edu.unju.fi.model.constantes.Colores;

public class TestArrayList {

	public static void main(String[] args) {
	
		ArrayList<Automovil> catalogoAutos = new ArrayList<>();
		
		Colores colorAuto = Colores.valueOf("NEGRO");
		
		Automovil automovil1 = new Automovil("AAAA", "Renault", "Clio",(short)2024, 20000000.0, colorAuto);
		Automovil automovil2 = new Automovil("BBBB", "FIAT", "CRONOS",(short)2024, 30000000.0, Colores.ROJO);
		
		catalogoAutos.add(automovil1);
		catalogoAutos.add(automovil2);
		
		System.out.println("Tamaño lista: "+catalogoAutos.size());
		
		Automovil auto = catalogoAutos.get(0);
		
		Automovil ultimoAuto = catalogoAutos.get(catalogoAutos.size()-1);
		
		System.out.println(auto.getPatente());
		System.out.println(ultimoAuto.getPatente());
		
		System.out.println(catalogoAutos.get(0).getColor());
		
		for(Automovil a:catalogoAutos) {
			System.out.println(a);
		}
		
		Automovil auto3 = new Automovil("CCCCC", "TOYOTA", "Ethios", (short)2024, 11111111., Colores.AZUL);
		
		
		//catalogoAutos.set(0, auto3);
		
		catalogoAutos.add(auto3);
		
		
		for(Automovil a:catalogoAutos) {
			if(a.getMarca().equals("TOYOTA")) {
				System.out.println(a);
			}
		}
		
		//catalogoAutos.remove(catalogoAutos.size()-1);
		
		//catalogoAutos.remove(auto3);
		//System.out.println(catalogoAutos.get(0).getPatente());
		
		
		/*GenericoDosAtributos<String, String> documento = new GenericoDosAtributos<>();
		documento.setCodigo("DNI");
		documento.setNumero("111111");
		
		Cliente cliente = new Cliente(documento, "Vega", "Ariel");*/
		
		//catalogoAutos.add(cliente);
		
		
		Iterator<Automovil> iterador = catalogoAutos.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next().getMarca());
		}
		

	}

}
