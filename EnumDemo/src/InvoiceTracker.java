import java.util.ArrayList;


public class InvoiceTracker {
	private ArrayList<Invoice> invoices;
	
	public InvoiceTracker() {
		invoices = new ArrayList<Invoice>();
	}
	
	public void addInvoices() {
		Invoice invoice = new Invoice(Invoice.Status.UNPAID, 300);
		invoices.add(invoice);
	}
	
	public void printInvoices() {
		System.out.println("Invoices");
		for (Invoice invoice : invoices)
			System.out.println(invoice);
	}
	
	public static void main(String[] args) {
		InvoiceTracker tracker = new InvoiceTracker();
		tracker.addInvoices();
		tracker.printInvoices();

	}

}
