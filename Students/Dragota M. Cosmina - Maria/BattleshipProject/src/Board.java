import java.util.Random;

public class Board {
	public int[][] board = new int[10][10];

	public Board(int[][] board) {
		this.board = board;
	}

	public void initBoard() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				board[i][j] = 0;
			}
		}
	}

	public Ship generateShip(int length, boolean isVertical) {

		Ship ship = new Ship(length, isVertical);
		Random r = new Random();
		int randomNo = r.nextInt(6);// gen un nr intre 0 si 5
		if (isVertical) {// verticala
			for (int i = randomNo; i < randomNo + length; i++) {// variez i
				board[i][randomNo] = 1;
			}

		} else {// orizontala
			for (int j = randomNo; j < randomNo + length; j++) {// variez j
				board[randomNo][j] = 1;
			}
		}

		return ship;
	}

	public void printBoard() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("board[" + i + "][" + j + "]=" + " "
						+ this.board[i][j] + "  ");
			}
			System.out.println(" ");
		}
	}

	public void updateBoard() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (board[i][j] == 0) {
					board[i][j] = 2;
				} else {
					board[i][j] = 3;
				}
			}
		}
	}

}
