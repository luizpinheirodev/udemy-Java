package exercicios.exercicioFIx.model.services;

public class PaypalService implements OnlinePaymentService {


	@Override
	public Double interest(double amount, int month) {
		return amount * 0.01 * month;
	}

	@Override
	public Double paymentFee(double amount) {
		return amount * 0.02;
	}
}
