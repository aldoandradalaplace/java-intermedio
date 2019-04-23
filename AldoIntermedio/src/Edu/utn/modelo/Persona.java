package Edu.utn.modelo;

import java.time.LocalDate;

public abstract class Persona {

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	private String nombre;
	private String identificacion;
	public abstract void presentarse();
	
	int a�oNacimiento;
	public int getA�oNacimiento() {
		return a�oNacimiento;
	}
	public void setA�oNacimiento(int a�oNacimiento) {
		this.a�oNacimiento = a�oNacimiento;
	}
	
	public boolean ValidarMayoriaDeEdad() {
		LocalDate fecha = LocalDate.now();
		int a�oActual=  fecha.getYear();
		return a�oActual - a�oNacimiento >= 18;
	}
	
	public boolean ValidarNombre() {

		return nombre != null && nombre.length()>10;
				
	}
	
	
}
