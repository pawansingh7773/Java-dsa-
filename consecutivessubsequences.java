import java.util.*;
public class consecutivessubsequences {
    public static int[] removesubs(int [] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<n ; i++){
            if(st.size() == 0 || st.peek()!=arr[i]) st.push(arr[i]);
            else if(arr[i] == st.peek())
                if( arr[i]!=arr[i+1] || i == n-2) st.pop();
              }
        int [] arr2 = new int [st.size()];
        int m = arr2.length;
        for(int i = m-1;i>=0;i--){
            arr2[i] = st.pop();
        }
        return arr2;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int [] arr2 = removesubs(arr);
        for(int i = 0 ; i<arr2.length;i++){
            System.out.print(arr2[i] +" ");
        }
        System.out.println();
    }
    
}
