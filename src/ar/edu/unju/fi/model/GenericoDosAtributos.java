package ar.edu.unju.fi.model;

public class GenericoDosAtributos <K,V>{
	private K codigo;
	private V numero;
	
	public GenericoDosAtributos() {
		// TODO Auto-generated constructor stub
	}

	public GenericoDosAtributos(K codigo, V numero) {
		this.codigo = codigo;
		this.numero = numero;
	}

	public K getCodigo() {
		return codigo;
	}

	public void setCodigo(K codigo) {
		this.codigo = codigo;
	}

	public V getNumero() {
		return numero;
	}

	public void setNumero(V numero) {
		this.numero = numero;
	}
	
	
	
	

}
