import java.util.*;
public class minstack1 {
    public static int getmin(int [] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        Stack<Integer> gt = new Stack<>();
        st.push(arr[0]);
        gt.push(arr[0]);
        
        for(int i =1 ; i<n ; i++){
            if(st.peek() <= gt.peek()){
                gt.push(st.peek());
                st.push(i);
            }else{
                gt.push(gt.peek());
                st.push(i);
            }
            if(st.size()!= gt.size() ){
                gt.pop();

            }
        }
        return gt.peek();
    }
    public static void main(String[] args) {
        int [] arr = {7,8,5,6,4};
        System.out.println(getmin(arr));
    }
    
}
