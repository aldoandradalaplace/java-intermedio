package Edu.utn.modelo;

import java.time.LocalDate;

public class Boxeadore extends Persona {

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMinutos() {
		return minutos;
	}


	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	private int minutos;
	private int intensidad;


	public int getIntensidad() {
		return intensidad;
	}


	public void setIntensidad(int intensidad) {
		this.intensidad = intensidad;
	}


	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
		
	}

	private String nombre;
	private Categorias categoria;
	
	public Boxeadore (String x){
		this.setNombre(x);
		}
	
	
	
	@Override
	public String toString() {
		String laCategoria = (categoria==null?"Sin Categoria": categoria.toString());
		return this.getNombre() + "-" + laCategoria;
	}

	@Override
	public void presentarse () {
		String presentacion = "%s : %s : %s";
		String.format(presentacion, getIdentificacion(),getCategoria(),getNombre());
		System.out.println(String.format(presentacion, getIdentificacion(),getCategoria(),getNombre()));
	}
	

	public void entrenarse(int minutos) {
	for(int i = 0; i < minutos; i++ ) {
		System.out.println("x");
		try {
			Thread.sleep(500);		
		}catch(InterruptedException e) {
			e.printStackTrace();
		}	
	}
	System.out.println("Fin de entrenamiento");
	}
	
	public void entrenarse (int minutos, boolean intensidad){
		System.out.println("Comienzo entrenamiento");
		String marcaEntrenamiento = intensidad? "X": "x";
		for(int i =0; minutos > i; i++) {
			System.out.println(marcaEntrenamiento);
			try {
				Thread.sleep(500);		
			}catch(InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}
	
		
	


	@Override
	public boolean ValidarMayoriaDeEdad() {
		LocalDate fecha = LocalDate.now();
		int añoActual=  fecha.getYear();
		return añoActual - añoNacimiento >= 15;
	}
	
	

}
	



