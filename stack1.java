//STACK RELATED BASIC PROGRAMMES / CONCEPTS ;
import java.util.*;

public class stack1 {
    public static void removerec(Stack<Integer> s  , int idx){
        if(s.size() == idx+1){
            s.pop();
            return;
        }
        int top = s.pop();
        removerec(s, idx);
        s.push(top);
    }
    public static void insertbottomrec(Stack<Integer> s , int x){
        if(s.size() == 0){
            s.push(x);
            return;
        }
        int top = s.pop();
        insertbottomrec(s, x);
        
        s.push(top);
    }
    public static void printreverserec(Stack<Integer> s){
        if(s.size() == 0) return;
        int top = s.pop();
        System.out.print(top +" ");
        printreverserec(s);
        s.push(top);
    }
    public static void printrec(Stack<Integer> s ){
        if(s.size() == 0) return;
        int top = s.pop();
        printrec(s);
        System.out.print(top +" ");
        s.push(top);

    }
    public static void insertatidx(Stack<Integer> s , int idx , int x){
        Stack<Integer> temp = new Stack<>();
        while(s.size()>idx){
            temp.push(s.pop());

        }
        s.push(x);
        while(temp.size()>0){
            s.push(temp.pop());
        }
    }
    public static void insertbottom(Stack<Integer> s , int x){
        Stack<Integer> temp = new Stack<>();
        while(s.size()>0){
            temp.push(s.pop());
        }
        s.push(x);
        while(temp.size()>0){
            s.push(temp.pop());
        }
    }
    public static void move(Stack<Integer> s){
        Stack<Integer> temp = new Stack<>();
        while(s.size()>0){
            temp.push(s.pop());

        }
        Stack<Integer> r = new Stack<>();
        while(temp.size()>0){
           System.out.print( r.push(temp.pop()) +" ");
        }
        System.out.println();
    }
     public static  void displayrev(Stack<Integer> s){
        Stack<Integer> r = new Stack<>();
        while(s.size()>0){
            System.out.print(r.push(s.pop()) +" ");

        }
        System.out.println();
        while(r.size()>0){
            s.push(r.pop());
        }

    }
public static void display(Stack<Integer> s){
   Stack<Integer> r = new Stack<>();
   while(s.size()>0){
    r.push(s.pop());
   }
   while(r.size()>0){
    System.out.print(s.push(r.pop()) +" ");
   }
   System.out.println();
}
public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(9);
    st.push(2);
    st.push(8);
    st.push(3);
    st.push(5);
 removerec(st, 3);
 display(st);
   
   
}
}
