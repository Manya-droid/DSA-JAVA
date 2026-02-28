package Recursion;

import java.util.Scanner;

public class Replace_Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0){
            String str=sc.next();
            System.out.println(Replace_Pi(str,0));
            n--;
        }

	}
	public static String Replace_Pi(String str,int i){
        if(i > str.length() - 2){
            return str;
        }
        if(str.substring(i,i+2).equals("pi")){
            return Replace_Pi(str.substring(0,i)+"3.14"+str.substring(i+2),i);
        }
        return Replace_Pi(str,i+1);

    }

}
