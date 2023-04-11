package Tasca2.N1ejercicio3;

public class App {

	
	public static void main(String[] args) {
		
		
		Articulos Articulo1 = new Articulos("jabon", 2.0);
		Articulos Articulo2 = new Articulos("shampoo", 3.0);
		Articulos Articulo3 = new Articulos("cepillo", 5.3);
		Articulos Articulo4 = new Articulos("esponja", 4.4);
		
		
		ListaArticulos lista= new ListaArticulos(new ConvertidorMoneda("Dolares"));
		
		
		lista.agregarArticulo(Articulo1);
		lista.agregarArticulo(Articulo2);
		lista.agregarArticulo(Articulo3);
		lista.agregarArticulo(Articulo4);
		
		lista.listarArticulos();
		
		lista.mostrarPrecios();
		
	}
	
	
}
