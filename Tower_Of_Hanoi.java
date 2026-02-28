package Recursion;

import java.util.Scanner;

public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TOH(n,"A","C ","B");//source,help,destination
	}
	public static void TOH(int n,String src,String help,String des) {
		
		if(n==0) {
			return;
		}
		//n-1 disk src se help pr pahochana
		TOH(n-1,src,des,help);
		System.out.println("Move ring "+n+" from "+src+" to "+des);
		// fir baki ki help se destination tk
		TOH(n-1,help,src,des);
	}

}
