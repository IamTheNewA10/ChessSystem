package boardGame;

public class piece {

	protected Position position;
	private Board board;
	
	public piece(Position position, Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
}
