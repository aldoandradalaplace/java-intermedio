package Edu.utn.modelo;

public class Boxeadore {

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		this.nombre = x;
		}
	@Override
	public String toString() {
		String laCategoria = (categoria==null?"Sin Categoria": categoria.toString());
		return nombre + "-" + laCategoria;
	}

	


}
