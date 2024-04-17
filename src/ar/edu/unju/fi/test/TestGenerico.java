package ar.edu.unju.fi.test;

import ar.edu.unju.fi.model.GenericoDosAtributos;

public class TestGenerico {

	public static void main(String[] args) {
		
		GenericoDosAtributos<Integer, Integer> telefono = 
				new GenericoDosAtributos<Integer, Integer>(388, 11111111);
		
		GenericoDosAtributos<String, String> documentoIdentidad = 
				new GenericoDosAtributos("DNI", "M2222222");
		
		
		System.out.println(telefono.getNumero());
		
		System.out.println(documentoIdentidad.getCodigo());

	}

}
