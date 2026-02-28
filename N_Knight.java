package Backtracking;

public class N_Knight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=2;
		
		boolean[][] board=new boolean[n][n];
		Print(board,n,0);
		System.out.println("\n"+count);

	}
	static int count=0;
	public static void Print(boolean[][] board, int tk, int idx) {

	    if (tk == 0) {
	        Display(board);
	        count++;
	        System.out.print(" ");
	        return;
	    }

	    // saare cells check ho gaye
	    if (idx == board.length * board.length) return;

	    int row = idx / board.length;
	    int col = idx % board.length;

	    // place knight
	    if (isSafe(board, row, col)) {
	        board[row][col] = true;
	        Print(board, tk - 1, idx + 1);
	        board[row][col] = false;
	    }

	    // skip cell
	    Print(board, tk, idx + 1);
	}

	public static Boolean isSafe(boolean[][] board,int row,int col) {
		//direction matrix
		//they check for L SHAPES
		int[][] moves = {{-2, -1}, // 2 MOVES UPWARD IN A ROW THEN LEFT
					 {-2, 1},//2 MOVES UPWARD IN A ROW THEN RIGHT
					 {-1, -2},//2 MOVES TO LEFT THEN UP
					 {-1, 2},//2 MOVES TO RIGHT THEN UP
					 {1, 2} ,//2 MOVES TO RIGHT THEN DOWN
					 {2, 1},//2 MOVES DOWN 1 TO THE RIGHT
					 {2,-1},//2 MOVES DOWN THEN LEFT
					 {1,-2}}; //2 MOVES TO LEFT THEN DOWN
		
		for (int[] m : moves) {
			int r = row + m[0];
			int c = col + m[1];

			if (r >= 0 && c >= 0 && r < board.length && c < board.length) {
				if (board[r][c]) return false;
			}
		}
		return true;
		
	}
	public static void Display(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j]) {
					System.out.print("{"+i+"-"+j+"}"+" ");	
				}
						
			}
		
		}
	}

}
