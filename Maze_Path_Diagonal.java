package Recursion;

import java.util.Scanner;

public class Maze_Path_Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		Maze(0,0,n-1,m-1,"");
		System.out.print("\n"+count);

	}
	static int count=0;
	public static void Maze(int cr,int cc,int er,int ec,String ans) {
		if(cr==er && cc==ec) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		if(cr>er || cc>ec ) {
			return;
		}
		Maze(cr+1,cc,er,ec,ans+"V");
		Maze(cr,cc+1,er,ec,ans+"H");
		Maze(cr+1,cc+1,er,ec,ans+"D");
	}

}
