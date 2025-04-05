import java.util.*;
public class stockproblem {
    public static int[] stock(int [] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int [] result = new int [n];
        result[0] = 1;
        st.push(arr[0]);
        
        for(int i =1 ; i<n ; i++){
            //
            if(st.peek()> arr[i]){
                result[i] = i- (i-1);
                st.push(arr[i]);
            }else if(st.peek()< arr[i]){
                result[i] = i-1;
                st.push(arr[i]);
            
        } if(  i == n-1){
            result[i] = i;
        }
            
            }
            return result;
        }
        
    
    
    public static void main(String[] args) {
        int [] arr = {100,80,60,70,60,75,85 , 110};
        int [] result = stock(arr);
        for(int val : result){
            System.out.print(val +" ");
        }
        System.out.println();
    }
    
}
