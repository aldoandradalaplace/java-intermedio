package Edu.utn.intermedio.main;

import Edu.utn.modelo.Boxeadore;
import Edu.utn.modelo.Categorias;
import Edu.utn.modelo.Entrenador;

public class IncripcionGym {

	public static void main(String[] args) {
	
		Boxeadore box= new Boxeadore("Pepe");
		Boxeadore box2= new Boxeadore ("Pipo");
		box2.setCategoria(Categorias.pesado);
		Boxeadore box3 = new Boxeadore ("Pepo");	
		Entrenador ent= new Entrenador("Juan", Categorias.welter, Categorias.pesado, 2);
		box3.presentarse();
		
		
		System.out.println(ent.asignarBoxeador(box));
		System.out.println(ent.asignarBoxeador(box2));
		System.out.println(ent.asignarBoxeador(box3));
		
		ent.presentarse();
		System.out.println("Mostrar Boxeadores");
		ent.imprimirBoxeadores();
	}

}
