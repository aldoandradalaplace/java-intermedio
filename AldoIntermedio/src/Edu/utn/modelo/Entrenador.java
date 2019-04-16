package Edu.utn.modelo;
import java.util.ArrayList;
import java.util.Collection;

public class Entrenador {

	int CantidadMaxBox;
	private String nombre;
	
	private Collection<Boxeadore> boxeadores;
	private Categorias [] categorias;
	
	public Entrenador (String y, Categorias cat1, Categorias cat2, int maximo) {
		nombre=y;
		categorias= new Categorias [2];
		categorias[0] =cat1;
		categorias [1] =cat2;
		
		boxeadores= new ArrayList<Boxeadore>();
		CantidadMaxBox= maximo;
		}
	
	public void entrenar() {
		
		
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
	
	
}
