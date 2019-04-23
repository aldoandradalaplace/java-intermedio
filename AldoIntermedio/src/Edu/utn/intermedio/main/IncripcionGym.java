package Edu.utn.intermedio.main;

import java.util.ArrayList;
import java.util.Collection;

import Edu.utn.modelo.Boxeadore;
import Edu.utn.modelo.Categorias;
import Edu.utn.modelo.Entrenador;
import Edu.utn.modelo.Recurso;

public class IncripcionGym {

	public static void main(String[] args) {
	
		Collection <Identificable> activosGimnasio = new ArrayList();
		
		Boxeadore box= new Boxeadore("Pepe");
		activosGimnasio.add(box);
		Boxeadore box2= new Boxeadore ("Pipo");
		activosGimnasio.add(box2);
		box2.setCategoria(Categorias.pesado);
		box2.setMinutos(120);
		Boxeadore box3 = new Boxeadore ("Pepo");
		activosGimnasio.add(box3);
		Entrenador ent= new Entrenador("Juan", Categorias.welter, Categorias.pesado, 2);
		box3.presentarse();
		
		ent.setIdentificacion("123454321");
		ent.setAñoNacimiento(1999);
		System.out.println(ent.ValidarMayoriaDeEdad());
		
		
		box2.setAñoNacimiento(2002);
		System.out.println(box2.ValidarMayoriaDeEdad());
		
		ent.asignarBoxeador(box2);
		ent.entrenar();
		ent.presentarse();
		System.out.println("Mostrar Boxeadores");
		ent.imprimirBoxeadores();
		Recurso recurso1= new Recurso();
		recurso1.setEtiqueta("MN-0419");
		Recurso recurso2= new Recurso();
		recurso1.setEtiqueta("MN-0420");
		Recurso recurso3= new Recurso();
		recurso1.setEtiqueta("MN-0421");
		
		for (Identificable identificable : activosGimnasio) {
			System.out.println(activosGimnasio);
		}
		
}
}
