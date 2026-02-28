package Recursion;

import java.util.Scanner;

public class Split_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        } 
        
         Split(arr,0,0,0,"",""); 
         System.out.print("\n"+count);
	}
	static int count=0;
	public static void Split(int[] arr,int idx,int sum1,int sum2,String g1,String g2){
		//base case
		if(idx==arr.length){
			if(sum1==sum2){//desired condition agr dono arrays ka sum same hogya to
				System.out.println(g1+" and "+g2);
            	count++;
	            }
            return;
       }
	       
       Split(arr,idx+1,sum1+arr[idx],sum2,g1+arr[idx]+" ",g2);//pehle g1 mei add krdo arr[i],sath mei arr[i] ko sum1 
       //mei add kr do
       Split(arr,idx+1,sum1,sum2+arr[idx],g1,g2+arr[idx]+" ");//g2 mei add krdo arr[i],sath mei arr[i] ko sum2 mei add kr do
    } 


}
