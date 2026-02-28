package Recursion;

import java.util.Scanner;

public class Replace_0_To_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Replace05(n));

	}
	public static int Replace05(int n) {
		if(n==0) {
			return 0;
		}
		int digit=n%10;
		if(digit==0) {
			digit=5;
		}
		return Replace05(n/10)*10+digit;
	}

}
