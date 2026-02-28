package Recursion;

import java.util.Scanner;

public class Generate_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t-->0){
	            String str = sc.next();
	            // convert string to a char array
	            BinaryString(str.toCharArray(),0);
	            System.out.println();
	        }

	}
	public static void BinaryString(char[] arr,int index){
		//base case

        if(index==arr.length){
            System.out.print(new String(arr) + " ");
            return;
        }
        if(arr[index]=='?'){
            //replace with '0'
            arr[index]='0';
            BinaryString(arr,index+1);

            //replace with '1'
            arr[index]='1';
            BinaryString(arr,index+1);

            // restore (backtrack)
            arr[index] = '?';
        }
        else{
            BinaryString(arr,index+1);
        }
        
    }

}
