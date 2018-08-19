package exercicios.exercicioFix.entities;

public class Account {
	
	private static final double TAX = 5.00;
	
	private int number;
	private String name;
	private double balance;
	
	public Account(int number, String name, double amount) {
		this.number = number;
		this.name = name;
		deposit(amount);
	}

	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit (double amount) {
		this.balance += amount;
	}
	
	public void withdraw (double amount) {
		this.balance += -amount - TAX;
	}

	@Override
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

	
	
	
	
	
	
	

}
