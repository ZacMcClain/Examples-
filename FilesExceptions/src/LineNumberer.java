import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class LineNumberer {
	private String inputName;
	private String outputName;
	
	public void setOutputName(String outputName) {
		this.outputName = outputName;
	}

	public void setInputName(String inputName) {
		this.inputName = inputName;
	}
	
	public void numberLines() throws FileNotFoundException {
		FileReader reader = new FileReader(inputName);
		Scanner in = new Scanner(reader);
		PrintWriter out = new PrintWriter(outputName);
		int lineNumber = 1;
		while (in.hasNextLine()) {
			String line = in.nextLine();
			out.println("/* " + lineNumber + " */ " + line);
			lineNumber++;
		}
		out.close();
	}
	
	public void promptForInputFile() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the input file name: ");
		inputName = scan.next();
	}
	
	public void chooseFileName() {
		JFileChooser chooser = new JFileChooser();
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			// static int
			File selectedFile = chooser.getSelectedFile();
			inputName = selectedFile.getAbsolutePath();
			System.out.println(inputName);
			// could do FileReader reader = new FileReader(selectedFile);
		}
			
	}

	public static void main(String[] args) throws FileNotFoundException {
		// Option 1: hardcode names
		LineNumberer lines1 = new LineNumberer();
		lines1.setInputName("srcCode.txt");
		lines1.setOutputName("srcCode1.out");
		lines1.numberLines();
		// Option 2: prompt user
		LineNumberer lines2 = new LineNumberer();
		lines2.setOutputName("srcCode2.out");
		lines2.promptForInputFile();
		lines2.numberLines();
		// Option 3: file chooser
		LineNumberer lines3 = new LineNumberer();
		lines3.setOutputName("srcCode3.out");
		lines3.chooseFileName();
		lines3.numberLines();
		// Option 4: command line arg
		LineNumberer lines4 = new LineNumberer();
		lines4.setOutputName("srcCode3.out");
		if (args.length > 0)
		{
			lines4.setInputName(args[0]);
			lines4.numberLines();
		}
	}

}
