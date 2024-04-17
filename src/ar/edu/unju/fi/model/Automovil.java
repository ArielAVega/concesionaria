package ar.edu.unju.fi.model;

import ar.edu.unju.fi.model.constantes.Colores;

public class Automovil {
	private String patente;
	private String marca;
	private String modelo;
	private Short anio;
	private Double precio;
	private Colores color;
	
	public Automovil() {
		// TODO Auto-generated constructor stub
	}

	public Automovil(String patente, String marca, String modelo, Short anio, Double precio, Colores color) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.precio = precio;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Automovil [patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio
				+ ", precio=" + precio + ", color=" + color + "]";
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Short getAnio() {
		return anio;
	}

	public void setAnio(Short anio) {
		this.anio = anio;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Colores getColor() {
		return color;
	}

	public void setColor(Colores color) {
		this.color = color;
	}
	
	

}
