package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Dict_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//"cab" print all the arrangements which are lexicographically shorter than this;
		Scanner sc=new Scanner(System.in);
        String str=sc.next();
        //char array
        char[] arr=new char[str.length()];
        //storing charater of string in the array
        for(int i=0;i<arr.length;i++){
            arr[i] = str.charAt(i);
        }
        //sort in asce order
        Arrays.sort(arr);
        //convert array to string
        String result=new String(arr);
        Dict_order(result,str,"");

	}
	public static void Dict_order(String result,String original,String ans){
        if(result.length()==0){
        	//comparing condition
        	//it works on the diff
            if(ans.compareTo(original)<0){  //if ans>org(>0)
                 System.out.println(ans);//if ans<org(<0)
            }
            return;
        }
        //permutaion loop
        for(int i=0;i<result.length();i++) {
			char ch=result.charAt(i);
			String s1=result.substring(0, i);
			String s2=result.substring(i+1);
			Dict_order(s1+s2, original, ans+ch);
			
		}
    }

}
