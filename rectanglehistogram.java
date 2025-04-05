import java.util.*;
public class rectanglehistogram {
    public static int rectangle(int [] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int [] nse = new int[n];
        int [] pse = new int[n];
        nse[n-1] = n;
        st.push(n-1);
        for(int i = n-2 ; i>=0 ; i--){
            while(arr[st.peek()] > arr[i] && st.size()>0){
                st.pop();
                if(st.size() == 0) st.push(i);
            }
            if(arr[st.peek()] < arr[i]) nse[i] = st.peek();
            else nse[i] = n;
            st.push(i);
        }
        while(st.size()>0){
            st.pop();
        }
        pse[0] = -1;
        st.push(0);
        for(int i =1 ; i<n ; i++){
            while(arr[st.peek()] > arr[i] && st.size()>0){
                st.pop();
                if(st.size() == 0) st.push(i);
            }
            if(arr[st.peek()] < arr[i]) pse[i] = st.peek();
            else pse[i] = -1;
            st.push(i);
        }
        int max = -1;
        for(int i =0 ; i<n ; i++){
            int area = arr[i] * (nse[i] - pse[i] - 1);
            max = Math.max(area, max);
        }
        return max;

    }
    public static void main(String[] args) {
        int [] arr = {1,1};
        System.out.println(" YOUR REQUIRED MAX AREA IS :" +rectangle(arr));

    }
    
}
