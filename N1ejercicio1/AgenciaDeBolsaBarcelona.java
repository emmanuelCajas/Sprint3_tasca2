package Tasca2.N1ejercicio1;

public class AgenciaDeBolsaBarcelona extends Observador{

	public AgenciaDeBolsaBarcelona(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {
		
		System.out.println("Barcelona: " + (sujeto.getEstado()));
	}

}
