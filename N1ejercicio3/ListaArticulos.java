package Tasca2.N1ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaArticulos {
	private ConvertidorMoneda convertidor;
	private ArrayList<Articulos> listaArticulos;
	
	public ListaArticulos(ConvertidorMoneda convertidor) {
		this.convertidor = convertidor;
		this.listaArticulos = new ArrayList<Articulos>();
	}

	public void agregarArticulo(Articulos articulo) {
		listaArticulos.add(articulo);
	}
	public void listarArticulos() {
		for (Articulos articulos : listaArticulos) {
			
			System.out.println(articulos);
		}
	}
	
	public void mostrarPrecios() {
		System.out.println("******************************");

		for(int i=0;i<listaArticulos.size();i++) {
			System.out.println(listaArticulos.get(i).getNombre()+" "+
						listaArticulos.get(i).getPrecio()*convertidor.convertir()+" "+convertidor.getTipoMoneda()); 
		}
	}
	
	
}
