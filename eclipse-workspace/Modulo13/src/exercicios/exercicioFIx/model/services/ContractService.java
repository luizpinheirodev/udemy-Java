package exercicios.exercicioFIx.model.services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import exercicios.exercicioFIx.model.entities.Contract;
import exercicios.exercicioFIx.model.entities.Installment;

public class ContractService {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private OnlinePaymentService ops;

	public ContractService(OnlinePaymentService ops) {
		this.ops = ops;
	}

	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			Date date = addMonths(contract.getDate(), i);
			double updateQuota = basicQuota + ops.interest(basicQuota, i);
			double fullQuota = updateQuota + ops.paymentFee(updateQuota);
			contract.addInstallment(new Installment(date, fullQuota));
		}
	}
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}

}
