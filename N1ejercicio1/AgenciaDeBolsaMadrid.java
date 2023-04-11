package Tasca2.N1ejercicio1;

public class AgenciaDeBolsaMadrid extends Observador {

	public AgenciaDeBolsaMadrid(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {
		System.out.println("Madrid: " + (sujeto.getEstado()));
	}

}
