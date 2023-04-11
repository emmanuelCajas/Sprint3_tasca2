package Tasca2.N1ejercicio22;

public class PagoPayPal implements MetodoPago {

	@Override
	public void pago(double monto) {
		System.out.println("Procesando pago PayPal " + monto + "Euros");
	}

}
