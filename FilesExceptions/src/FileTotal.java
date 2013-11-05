import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileTotal {
	private int sum;
	private String inFile;
	
	public FileTotal(String inFile) {
		this.inFile = inFile;
	}

	public void sumFileValues() {
		FileReader reader = null;
		Scanner in = null;
		try {
			reader = new FileReader(inFile);
			in = new Scanner(reader);
		} catch (FileNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
		}
		String strNum = null;
		try {
			while (in.hasNext()) {
				strNum = in.next();
				int num = Integer.parseInt(strNum);
				sum += num;
			}
		} catch (NumberFormatException e) {
			System.out.println("Error, non-numeric value " + strNum);
		}
	}
	
	public void displaySum() {
		System.out.println("Sum is " + sum);
	}
	
	public static void main(String[] args) {
		FileTotal ft = new FileTotal("numbers.txt");
		ft.sumFileValues();
		ft.displaySum();

	}

}
