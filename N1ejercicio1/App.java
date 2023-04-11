package Tasca2.N1ejercicio1;

public class App {

	public static void main(String[] args) {

		Subject subject = new Subject();

		new AgenciaDeBolsaBarcelona(subject);
		new AgenciaDeBolsaMadrid(subject);
		
		System.out.println("\n" + "Prueba1: ");
		subject.setEstado(10);
		System.out.println("-----------------");
		System.out.println("\n" + "Prueba2 : ");
		subject.setEstado(100);
	}

}
