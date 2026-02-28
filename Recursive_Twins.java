package Recursion;

import java.util.Scanner;

public class Recursive_Twins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(countTwins(str));

	}
	public static int countTwins(String str) {
		if(str.length()<3) {
			return 0;
		}
		int count=0;
		if(str.charAt(0)==str.charAt(0+2)) {
			count=1;
		}
		return count+countTwins(str.substring(1));
		
	}

}
