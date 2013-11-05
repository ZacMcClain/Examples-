package firstPackage;

public class BankAccount {
	double balance;
	String name;
	
	public void deposit(double amount) {
		double newBalance = balance + amount;
		if (newBalance > 0)
			balance = newBalance;
	}
	
	public void withdraw(double amount) {
		double newBalance = balance - amount;
		if (newBalance > 0)
			balance = newBalance;
		else
			balance = 0;		
	}

	public BankAccount() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", name=" + name + "]";
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//if (getClass() != obj.getClass())
			//return false;
		if (! (obj instanceof BankAccount))
			return false;
		BankAccount other = (BankAccount) obj;
		if (Double.doubleToLongBits(balance) != Double
				.doubleToLongBits(other.balance))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public BankAccount(double balance, String name) {
		super();
		this.balance = balance;
		this.name = name;
	}

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(500, "Cyndi");
		System.out.println(myAccount);
		SavingsAccount mySavings = new SavingsAccount(500, "Cyndi", 0.1);
		System.out.println(mySavings);
		BankAccount secondAccount = new BankAccount(500, "Cyndi");
		System.out.println(myAccount.equals(secondAccount));
		SavingsAccount secondSavings = new SavingsAccount(500, "Cyndi", 0.1);
		System.out.println(myAccount.equals(secondSavings));
		System.out.println(mySavings.equals(secondSavings));
		myAccount = mySavings;
		//mySavings = myAccount;
		
		
	}

}
