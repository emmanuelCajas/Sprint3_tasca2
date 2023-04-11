package Tasca2.N1ejercicio2;

public class App {

	public static void main(String[] args) {

		Tienda pago = new Tienda();

		PagoCuentaBancaria pc = new PagoCuentaBancaria(pago);
		PagoPayPal pp = new PagoPayPal(pago);
		PagoTrajetaCredito pt = new PagoTrajetaCredito(pago);

		pc.procesa();
		pp.procesa();
		pt.procesa();
	}

}
