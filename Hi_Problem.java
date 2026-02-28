package Recursion;

import java.util.Scanner;

public class Hi_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(Count_hi(str,0));
        System.out.println( Remove_hi(str,0));
        System.out.println(Add_Bye(str,0)); 

	}
	
	public static int Count_hi(String str, int i) {
        if (i > str.length() - 2) {
            return 0;
        }

        if (str.substring(i, i + 2).equals("hi")) {
            return 1 + Count_hi(str, i + 2);
        }

        return Count_hi(str, i + 1);
    }
	
	public static String Remove_hi(String str,int i) {
		if(i>str.length()-2){
			return str;
        }
		
		if(str.substring(i,i+2).equals("hi")||str.substring(i,i+2).equals("Hi")){
           return Remove_hi(str.substring(0,i)+str.substring(i+2),i);
       }
		return Remove_hi(str,i+1);
	}
	
	public static String Add_Bye(String str,int i) {
		if(i>str.length()-2){
			return str;
        }
		
		if(str.substring(i,i+2).equals("hi")||str.substring(i,i+2).equals("Hi")){
           return Add_Bye(str.substring(0,i)+"bye"+str.substring(i+2),i);
       }
		return Add_Bye(str,i+1);
	}

}
