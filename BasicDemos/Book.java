
public class Book {
	public static final int MAX_HIGHLIGHTS = 100;
	private int numPages;
	
	private int[] highlights;
	private int numHighlights;
	private int currentPage;


	public Book(int numPages) {
		super();
		this.numPages = numPages;
		currentPage = 1;
		highlights = new int[MAX_HIGHLIGHTS];
	}

	public void addHighlight() {
		highlights[numHighlights] = currentPage;
		numHighlights++;		
	}
	
	public void addHighlight(int whichPage) {
		highlights[numHighlights] = whichPage;
		numHighlights++;		
	}

	public void printHighlights()  {
		System.out.println("Highlighted Pages\n");
		for (int i=0; i<numHighlights; i++)
			System.out.println(highlights[i]);
		//System.out.println(highlights[MAX_HIGHLIGHTS]);
	}
	
	public void moveToNextPage() {
		currentPage++;
	}
	
	public void moveToPage(int whichPage) {
		currentPage = whichPage;
	}
	public static void main(String[] args) {
		Book aBook = new Book(300);
		aBook.moveToPage(15);
		aBook.addHighlight();
		aBook.moveToNextPage();
		aBook.moveToNextPage();
		aBook.addHighlight();
		aBook.addHighlight(45);
		aBook.printHighlights();

	}

}
