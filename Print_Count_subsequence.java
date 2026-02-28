package Recursion;

import java.util.Scanner;

public class Print_Count_subsequence {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ans="";
		
		Print_Subsequence(str,ans);
		System.out.println("\n"+count);
		

	}
	public static void Print_Subsequence(String str,String ans) {
		if(str.length()==0) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		
		char ch=str.charAt(0);
		
		//not include
		Print_Subsequence(str.substring(1), ans);
		//include
		Print_Subsequence(str.substring(1), ans+ch);
		
	}

}
