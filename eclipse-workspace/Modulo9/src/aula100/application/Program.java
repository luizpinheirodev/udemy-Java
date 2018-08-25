package aula100.application;

import aula98.entities.Account;
import aula98.entities.BusinessAccount;
import aula98.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Luiz", 1000.0);
		acc1.withdraw(200.00);
		System.out.println(acc1.getBalance());
		
		
		Account acc2 = new SavingsAccount(1001, "Luiz", 1000.0, 0.01);
		acc2.withdraw(200.00);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1001, "Luiz", 1000.0, 500.00);
		acc3.withdraw(200.00);
		System.out.println(acc3.getBalance());
		
	}

}
