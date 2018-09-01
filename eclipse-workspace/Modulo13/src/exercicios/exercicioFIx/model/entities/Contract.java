package exercicios.exercicioFIx.model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Date date;
	private Double totalValue;

	private List<Installment> installmentList = new ArrayList<>();

	public Contract(Integer number, Date date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Installment> getInstallment() {
		return installmentList;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public void addInstallment(Installment installment) {
		installmentList.add(installment);
	}

	public void removeInstallment(Installment installment) {
		installmentList.remove(installment);
	}
}