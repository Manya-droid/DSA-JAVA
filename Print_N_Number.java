package Recursion;

import java.util.Scanner;

public class Print_N_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printN(n);

	}
	public static void printN(int n){
        if(n==1){
        	System.out.println(1+" ");
            return;
        }
        if(n%2!=0) {
        	System.out.println(n+" ");
        }
        printN(n-1);
        if(n%2==0) {
        	System.out.println(n+" ");
        }

    }

}
