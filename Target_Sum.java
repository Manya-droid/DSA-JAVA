package Recursion;

import java.util.Scanner;

public class Target_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        
        
        for(int i=0;i<n;i++){
        	arr[i]=sc.nextInt();
        }
        
        int target=sc.nextInt();
	        
        subset(arr,0,0,target,"");
        System.out.println("\n"+count);
	}
	static int count=0;
	public static void subset(int[] arr,int index,int currsum,int target ,String ans){
		if (index == arr.length) {
			
            if (currsum == target) {
                System.out.print(ans+" ");
                count++;
            }
            return;
        }
        
        subset(arr,index+1,currsum+arr[index],target,ans+arr[index]+" ");
        subset(arr,index+1,currsum,target,ans);
        

    }

}
