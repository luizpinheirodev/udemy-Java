package exercicios.exercicioFix.util;

public class CurrencyConverter {
	
	public static final double IOF = 6.0;
	
	public static double convertDollars(double price, double qtd) {
		return (price * qtd * IOF/100) + price * qtd;
	}

}
