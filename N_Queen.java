package Backtracking;

public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		
		boolean[][] board=new boolean[n][n];
		Print(board,n,0);
		System.out.println("\n"+count);

	}
	static int count=0;
	public static void Print(boolean[][] board,int tq,int row) {
		
		if(tq==0) {
			Display(board);
			count++;
			System.out.print(" ");
			return;
		}
		for(int col = 0; col < board.length; col++) {
			if(isSafe(board,row,col)) {
				board[row][col]=true;
				Print(board,tq-1,row+1);
				board[row][col]=false;
				
			}
			
		}
	}
	public static Boolean isSafe(boolean[][] board,int row,int col) {
		
		//up
		int r=row;
		while(r>=0) {
			if(board[r][col]) {
				return false;
			}
			r--;
		}
		
		//left diagonal
		 r=row;
		 int c=col;
		 while(r>=0 && c>=0) {
			 if(board[r][c]) {
				 return false;
			 }
			 r--;
			 c--;
		 }
		 //right diagonal
		 r=row;
		 c=col;
		 while(r>=0 && c<board[0].length) {
			 if(board[r][c]) {
				 return false;
			 }
			 r--;
			 c++;
			 
		 }
		 return true;
		
	}
	public static void Display(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j]) {
					System.out.print("{"+(i+1)+"-"+(j+1)+"}"+" ");	
				}
							
			}
			
		}
	}

}
