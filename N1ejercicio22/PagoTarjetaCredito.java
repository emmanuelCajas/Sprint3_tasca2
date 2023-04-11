package Tasca2.N1ejercicio22;

public class PagoTarjetaCredito implements MetodoPago {

	
	@Override
	public void pago(double monto) {
		System.out.println("Procesando pago con tarjeta de crédito por " + monto + " Euros");
	}

}
