package Tasca2.N1ejercicio3;

public class ConvertidorMoneda {

	private String tipoMoneda;
	
	
	public ConvertidorMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}


	public String getTipoMoneda() {
		return tipoMoneda;
	}


	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}


	public double convertir() {
		switch (tipoMoneda) {
		case "Dolar":
			 return 1.09;
			 
		case "Soles":
			 return 4.07;	 
		default:
			break;
		}
		return 1;
	}
}
