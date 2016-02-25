
public class GameBoard 
{
	private char[][] theBoard;
	
	public GameBoard()
	{
		this.theBoard = new char[3][3];
		this.clearBoard();
	}
	
	public boolean makeMove(char moveChar, int row, int col)
	{
		if(this.theBoard[row][col] == '_')
		{
			this.theBoard[row][col] = moveChar;
			return true;
		}
		return false;
	}
	
	private void clearBoard()
	{
		for(int i = 0; i < this.theBoard.length; i++)
		{
			for(int j = 0; j < this.theBoard[i].length; j++)
			{
				this.theBoard[i][j] = '_';
			}
		}
	}
	
	public boolean hasWinner()
	{
		//row winners
		boolean row1WinnerA = this.theBoard[0][0] == 'X' && 
				this.theBoard[0][1] == 'X' && 
				this.theBoard[0][2] == 'X';
		boolean row1WinnerB = this.theBoard[0][0] == 'O' && 
				this.theBoard[0][1] == 'O' && 
				this.theBoard[0][2] == 'O';

		boolean row2WinnerA = this.theBoard[1][0] == 'X' && 
				this.theBoard[1][1] == 'X' && 
				this.theBoard[1][2] == 'X';
		boolean row2WinnerB = this.theBoard[1][0] == 'O' && 
				this.theBoard[1][1] == 'O' && 
				this.theBoard[1][2] == 'O';

		boolean row3WinnerA = this.theBoard[2][0] == 'X' && 
				this.theBoard[2][1] == 'X' && 
				this.theBoard[2][2] == 'X';
		boolean row3WinnerB = this.theBoard[0][0] == 'O' && 
				this.theBoard[2][1] == 'O' && 
				this.theBoard[2][2] == 'O';


		//col winners
		boolean col1WinnerA = this.theBoard[0][0] == 'X' && 
				this.theBoard[1][0] == 'X' && 
				this.theBoard[2][0] == 'X';
		boolean col1WinnerB = this.theBoard[0][0] == 'O' && 
				this.theBoard[1][0] == 'O' && 
				this.theBoard[2][0] == 'O';

		boolean col2WinnerA = this.theBoard[0][1] == 'X' && 
				this.theBoard[1][1] == 'X' && 
				this.theBoard[2][1] == 'X';
		boolean col2WinnerB = this.theBoard[0][1] == 'O' && 
				this.theBoard[1][1] == 'O' && 
				this.theBoard[2][1] == 'O';

		boolean col3WinnerA = this.theBoard[0][2] == 'X' && 
				this.theBoard[1][2] == 'X' && 
				this.theBoard[2][2] == 'X';
		boolean col3WinnerB = this.theBoard[0][2] == 'O' && 
				this.theBoard[1][2] == 'O' && 
				this.theBoard[2][2] == 'O';

		//diagonal winners
		boolean dia1WinnerA = this.theBoard[0][0] == 'X' && 
				this.theBoard[1][1] == 'X' && 
				this.theBoard[2][2] == 'X';
		boolean dia1WinnerB = this.theBoard[0][0] == 'O' && 
				this.theBoard[1][1] == 'O' && 
				this.theBoard[2][2] == 'O'; 

		boolean dia2WinnerA = this.theBoard[0][2] == 'X' && 
				this.theBoard[1][1] == 'X' && 
				this.theBoard[2][0] == 'X';
		boolean dia2WinnerB = this.theBoard[0][2] == 'O' && 
				this.theBoard[1][1] == 'O' && 
				this.theBoard[2][0] == 'O'; 

		return row1WinnerA || row1WinnerB || 
				row2WinnerA || row2WinnerB ||
				row3WinnerA || row3WinnerB ||
				col1WinnerA || col1WinnerB ||
				col2WinnerA || col2WinnerB ||
				col3WinnerA || col3WinnerB ||
				dia1WinnerA || dia1WinnerB ||
				dia2WinnerA || dia2WinnerB;
 	}
	
	public void display()
	{
		System.out.println("*****************");
		for(int i = 0; i < this.theBoard.length; i++)
		{
			for(int j = 0; j < this.theBoard[i].length; j++)
			{
				System.out.print(this.theBoard[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
