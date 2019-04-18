package Edu.utn.modelo;

public class Boxeadore extends Persona {

	public String getNombre() {
		return nombre;
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

}
	



