package ar.edu.unju.fi.model;

public class Cliente {
	private GenericoDosAtributos<String, String> documentoIdentificacion;
	private String apellido;
	private String nombre;
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public Cliente(GenericoDosAtributos<String, String> documentoIdentificacion, String apellido, String nombre) {
		this.documentoIdentificacion = documentoIdentificacion;
		this.apellido = apellido;
		this.nombre = nombre;
	}


	public GenericoDosAtributos<String, String> getDocumentoIdentificacion() {
		return documentoIdentificacion;
	}


	public void setDocumentoIdentificacion(GenericoDosAtributos<String, String> documentoIdentificacion) {
		this.documentoIdentificacion = documentoIdentificacion;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
}
