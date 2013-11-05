
public class Invoice {
	public enum Status { PAID, UNPAID, WRITE_OFF};
	private Status status;
	private double balance;
	
	public Invoice(Status status, double balance) {
		super();
		this.status = status;
		this.balance = balance;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Invoice [status=" + status + ", balance=" + balance + "]";
	}
	
	

}
