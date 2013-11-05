
public class BankAccount {
	private String name;
	private double balance;
	private int accountNum;
	private static int lastAccountNum;

	
	public BankAccount(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
		lastAccountNum++;
		accountNum = lastAccountNum;
	}
	
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", balance=" + balance
				+ ", accountNum=" + accountNum + "]";
	}


	public static void main(String[] args) {
		BankAccount mine = new BankAccount("Jim", 5000);
		BankAccount yours = new BankAccount("Sally", 10000);
		System.out.println(mine);
		System.out.println(yours);

	}

}
