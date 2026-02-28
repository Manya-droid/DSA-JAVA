package Recursion;

public class Possible_Indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,1,2,3};
		int item=2;
		PI(arr,item,0);

	}
	public static void PI(int[] arr,int item,int index){
        if(index==arr.length-1){
            return;
        }
        if(arr[index]==item){
            System.out.println(index);
            
        }
        PI(arr,item,index+1);
    }

}
