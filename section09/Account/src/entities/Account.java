package entities;

public class Account {

	private int number;
	private String holder;
	private double initialDeposit;
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public void deposit(double depositValue) {
		initialDeposit += depositValue;
	}
	
	public void withdraw(double withdrawValue) {
		initialDeposit -= withdrawValue + 5.0;
	}
	
	@Override
	public String toString() {
		return "Account "+number+", Holder: "+holder+", Balance: $ "+String.format("%.2f",initialDeposit);
	}
	
}