package Stacks;

import java.util.Stack;

public class InsertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
//        int index = 2;
//        int val =7;
//        Stack<Integer> temp = new Stack<>();
//        while(st.size()>index){
//            temp.push(st.pop());
//        }
//        st.push(val);
//        while(temp.size() >0){
//            st.push(temp.pop());
//        }
//        System.out.println(st);
       Stack q =InsertAtBase(st,7);
        System.out.println(q);
    }
    public static Stack InsertAtBase(Stack<Integer>st, int val){
        if(st.size() == 0){
            st.push(val);
            return st ;
        }
        int x =st.pop();
        InsertAtBase(st,val);
        st.push(x);
        return st;
    }
}
