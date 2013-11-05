package firstPackage;

public abstract class ChessPiece {
	private int row, col;
	
	

	public ChessPiece(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}
	
	abstract public void move();



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ChessPiece piece = new ChessPiece();
		ChessPiece piece = new Queen(2, 3);
		

	}

}
