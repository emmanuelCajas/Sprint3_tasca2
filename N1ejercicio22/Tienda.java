package Tasca2.N1ejercicio22;

public class Tienda {

//	 private PasarellaPago pasarella;

//	    public Tienda(PasarellaPago pasarella) {
//	        this.pasarella = pasarella;
//	    }

	    public void procesarOrden(double MontoTotal, MetodoPago metodoPago) {
	    	
	    	metodoPago.pago(MontoTotal);
	    	
//	        boolean pagoExitoso = pasarella.procesoPago(metodoPago, MontoTotal);
//	        if (pagoExitoso
//	        		) {
//	            System.out.println("Pago exitoso. ¡Gracias por su compra!");
//	        } else {
//	            System.out.println("El pago no se pudo procesar. Por favor, intente de nuevo.");
//	        }
	    }
	
}
