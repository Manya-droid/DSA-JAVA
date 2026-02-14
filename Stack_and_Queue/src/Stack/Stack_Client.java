package Stack;

public class Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack_Implement st=new Stack_Implement();
		System.out.println(st.size());
		
		st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(9);
        
        System.out.println(st.size());
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());

        System.out.println(st.peek());

        System.out.println(st.pop()); // 9
        System.out.println(st.pop()); // 8
        System.out.println(st.pop()); // 7


	}

}
