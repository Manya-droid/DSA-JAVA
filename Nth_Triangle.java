package Recursion;

import java.util.Scanner;

public class Nth_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Val_Nth_Traingle(n));

	}
	public static int Val_Nth_Traingle(int n) {
		
		if(n==0) {
			return 0;
		}
		
		return n+Val_Nth_Traingle(n-1);
	}
}
