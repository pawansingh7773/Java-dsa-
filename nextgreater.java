//important code using stack;
import java.util.*;
public class nextgreater {
    public static int[] nextgrea(int [] arr){
        int n = arr.length;
        int [] result = new int[n];
        if(n == 0) return new int[0];
        Stack<Integer> st = new Stack<>();
        result[n-1] = -1;
        st.push(arr[n-1]);
        
        for(int i = n-2 ; i>=0 ; i--){
            while(arr[i]> st.peek() && st.size()>0){
                st.pop();
                if(st.size()==0) st.push(arr[i]);
                
            }
            
            if(st.peek()>arr[i]){
                result[i] = st.peek();
                st.push(arr[i]);
            }
                else{
                result[i] = -1;
                st.push(arr[i]);
            }
                
            
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arr = {};
        int [] result = nextgrea(arr);
    for(int val : result){
        System.out.print(val +" ");
    }
    System.out.println();
    }

    
}
