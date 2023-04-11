package Tasca2.N1ejercicio22;

public class PagoCuentaBancaria implements MetodoPago{

	@Override
	public void pago(double monto) {
		System.out.println("Procesando pago con deuda en cuenta bancaria por " + monto + " Euros");
	}

}
