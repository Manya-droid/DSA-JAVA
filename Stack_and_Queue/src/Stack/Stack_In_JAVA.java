package Stack;

import java.util.Stack;

public class Stack_In_JAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st=new Stack<>();
		System.out.println(st.capacity());
		 System.out.println(st.size() + "\n");
		 
		 st.push(5);
	     st.push(10);
	     st.push(5);
	     st.push(10);
	     st.push(5);
	     st.push(10);
	     st.push(5);
	     st.push(10);
	     st.push(5);
	     st.push(10);
		 st.push(5);
		 
		 System.out.println(st.capacity());
	        System.out.println(st.size() + "\n");

	        st.push(11);
	        System.out.println(st.capacity());
	        System.out.println(st.size() + "\n");

	        System.out.println(st.peek());
	        System.out.println(st);
	        st.pop(); // 11
	        st.pop(); // 10
	        st.pop(); // 5

	        System.out.println(st);

	        for(int x: st){
	            System.out.println(x);
	        }
    
        

	}

}
