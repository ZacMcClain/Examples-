package firstPackage;

public class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount(double newBalance, String newName, double newInterestRate) {
		super(newBalance, newName);
		this.interestRate = newInterestRate;
	}

	@Override
	public String toString() {
		return super.toString() + "[interestRate=" + interestRate + "]";
	}
	
	public void printName() {
		System.out.println(name);
	}


	

}
