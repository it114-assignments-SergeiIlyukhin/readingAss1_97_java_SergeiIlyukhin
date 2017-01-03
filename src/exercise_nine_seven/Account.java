package exercise_nine_seven;

import java.util.Date;
/**
 * @author Sergei
 *
 */
public class Account {
	private int id;
	private double balance;
	private static double annual;
	private Date date;

	Account() {
		id = 0;
		balance = 0;
		annual = 0;
		date = new Date(); 
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public double MonthlyInterestRate() {
		return annual / 12;
	}
	public double MonthlyInterest() {
		return balance * (MonthlyInterestRate() / 100);
	}
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		date = new Date();
	}
	public void setId(int newId) {
		id = newId;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public void setAnnual(double newAnnual) {
		annual = newAnnual;
	}
	public int Id() {
		return id;
	}
	public double Balance() {
		return balance;
	}
	public double Annual() {
		return annual;
	}
	public String DateCreated() {
		return date.toString();
	}


	
}
