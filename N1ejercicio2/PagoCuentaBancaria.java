package Tasca2.N1ejercicio2;

public class PagoCuentaBancaria {
	
	//interfaz que permite que el pedido sea interpretado afuera de esta clase
	 private Callback  pago; 
	 private boolean pcb; //variable ejemplo

	    // constructor
	    public PagoCuentaBancaria(Callback p){
	        pago = p;
	    }

	    public void procesa(){

	        pcb = true;

	        if (pcb){
	           System.out.println("El pago con deuda en Cuenta Bancaria se ha efectuado correctamente");
	           pago.onPago();
	        }
	    }
}
