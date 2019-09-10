package bankaccountapp;
import java.util.Random;

public abstract class Account implements IBaseRate {
	//properties for accounts common to current and savings
	private String name;
	private String adhaar;
	protected String accountNumber;
	protected double rate;
	private double balance;
	private static int index=10000;
	
	
	//constructor
	public Account(String name,String adhaar,double initialDeposit) {
		this.name=name;
		this.adhaar=adhaar;
		this.balance=initialDeposit;
		this.accountNumber=setAccountNumber();
		setRate();
			
	}
	
	public abstract void setRate();
	
	//methods common to both savings and current
	private String setAccountNumber() {
		index++;
		String lastTwoDigitOfAdhaar=this.adhaar.substring(adhaar.length()-2);
		//int randNum= (int) ((int) Math.random()*Math.pow(1000, 1));
		Random random = new Random();

		// generate a random integer from 0 to 899, then add 100
		int randNum= random.nextInt(900) + 100;
		return lastTwoDigitOfAdhaar+index+randNum;
	}
	
	
	public void interest() {
		double interest=balance*(rate/100);
		balance=balance+interest;
		System.out.println("Interest is "+interest+"Rs");
		showBalance();
	}
	
	public void showInfo() {
		System.out.println("Name: "+name+
				"\nAccount Number: "+this.accountNumber+
				"\nAdhaar: "+adhaar+
				"\nBalance: "+balance+
				"\nRate: "+rate+"%");
		
		
	}
	
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println(amount+"RS successfully deposited to your account");
		showBalance();
	}
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println(amount+"RS successfully withdrawn from your account");
		showBalance();
	}
	public void transfer(String toWhere,double amount) {
		balance=balance-amount;
		System.out.println(amount+"RS successfully transfered to "+toWhere);
		showBalance();
	}
	public void showBalance() {
		System.out.println("Your balance now is "+balance);
	}
	
}
