package exercicios.exercicioAbstrato.entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double taxFinal = 0.00;
		if(getAnualIncome()<20000.00) {
			taxFinal = getAnualIncome() * 0.15;
		}else {
			taxFinal = getAnualIncome() * 0.25;
		}
		if(healthExpenditures>0.00) {
			taxFinal -= healthExpenditures * 0.5;
		}
		return taxFinal;
	}
	
	

}
