package Edu.utn.modelo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
public class Entrenador extends Persona implements Identificable{

	int CantidadMaxBox;
	
	
	private Collection<Boxeadore> boxeadores;
	private Categorias [] categorias;
	
	public Entrenador (String y, Categorias cat1, Categorias cat2, int maximo) {
		this.setNombre(y);
		this.setIdentificacion(y);
		categorias= new Categorias [2];
		categorias[0] =cat1;
		categorias [1] =cat2;
		
		boxeadores= new ArrayList<Boxeadore>();
		CantidadMaxBox= maximo;
		}
	
	public void entrenar() {
	Random random= new Random();
		for (Boxeadore boxeadore : boxeadores) {
			boxeadore.entrenarse(random.nextInt(30), random.nextBoolean());
		}
	}
	
	public boolean asignarBoxeador(Boxeadore b) {
		if(boxeadores.size()>= CantidadMaxBox) {
			return false;
		}else {
			boxeadores.add(b);
		}
		return true;
	}
	
	public void imprimirBoxeadores() {
		for(Boxeadore boxeadore : boxeadores) {
			System.out.println(boxeadore);
		}
	}
		@Override
		public void presentarse() {
			StringBuilder presentacion = new StringBuilder();
			presentacion.append(getIdentificacion());
			presentacion.append(" : ");
			presentacion.append("[") .append (this.categorias[0]);
			presentacion.append(",") .append (this.categorias[1]);
			presentacion.append("]");
			System.out.println(presentacion.toString());
		}
			
		@Override
		public String identificacion() {
			return "entrenador:"  + this.getIdentificacion();
		}
			
		
	}
	
	

