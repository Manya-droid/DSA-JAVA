package Recursion;

import java.util.Scanner;

public class Letter_Keypad {
	static String[] key= {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Letter_combination(str,"");
        System.out.print("\n"+count);
        
	}
	static int count=0;// static variable count
    public static void Letter_combination(String str,String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            count++;
            return;
        }
        char ch=str.charAt(0);//1 or 2 or 3.......
        String press=key[ch-'0'];//abc( we check for particular index in key arr)
        //then we apply loop on the particular selected string
        for(int i=0;i<press.length();i++){
        	//if add "a" in ans and substring hogai "bc"
            Letter_combination(str.substring(1),ans+press.charAt(i));
        }

    }

}
