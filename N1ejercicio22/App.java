package Tasca2.N1ejercicio22;

public class App {
	
	 public static void main(String[] args) {
	        Tienda tienda = new Tienda();
	        MetodoPago tarjetaCredito = new PagoTarjetaCredito();
	        MetodoPago payPal = new PagoPayPal();
	        MetodoPago cuentaBanco = new PagoCuentaBancaria();
	        
	        tienda.procesarOrden(100.00, tarjetaCredito);
	        tienda.procesarOrden(50.0,payPal);
	        tienda.procesarOrden(200.0, cuentaBanco);
	    }
}
