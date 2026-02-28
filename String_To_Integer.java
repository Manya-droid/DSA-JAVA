package Recursion;

import java.util.Scanner;

public class String_To_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(Str_To_Int(str,str.length()-1));

	}
	public static int Str_To_Int(String str,int index) {
		 if (index < 0) {
		        return 0;
		    }

		    int digit = str.charAt(index) - '0';
		    return Str_To_Int(str, index - 1) * 10 + digit;
	}
}
