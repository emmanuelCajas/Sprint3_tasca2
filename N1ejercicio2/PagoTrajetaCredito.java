package Tasca2.N1ejercicio2;

public class PagoTrajetaCredito {
	
	//interfaz que permite que el pedido sea interpretado afuera de esta clase
	 private Callback  pago; 
	 private boolean pcb; //variable ejemplo

	    // constructor
	    public PagoTrajetaCredito(Callback p){
	        pago = p;
	    }

	    public void procesa(){

	        pcb = true;

	        if (pcb){
	           System.out.println("El pago PayPal se ha efectuado correctamente");
	           pago.onPago();
	        }
	    }
}
