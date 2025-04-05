import java.util.*;
public class reorderderqueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        Stack<Integer> st = new Stack<>();
        System.out.println(q);
        while(q.size()!=st.size()){
            st.push(q.remove());
        }
        while(st.size()>0){
            if(st.size()== q.size()){
                for(int i =1 ; i<q.size();i++){
                    q.add(q.remove());
                }
            }
            q.add(st.pop());
            for(int i =1; i<q.size()-1;i++){
                q.add(q.remove());
            }
        
        }
        q.add(q.remove());
        System.out.println(q);
        

    }
}
