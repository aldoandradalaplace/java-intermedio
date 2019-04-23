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
	
	int añoNacimiento;
	public int getAñoNacimiento() {
		return añoNacimiento;
	}
	public void setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}
	
	public boolean ValidarMayoriaDeEdad() {
		LocalDate fecha = LocalDate.now();
		int añoActual=  fecha.getYear();
		return añoActual - añoNacimiento >= 18;
	}
	
	public boolean ValidarNombre() {

		return nombre != null && nombre.length()>10;
				
	}
	
	
}
