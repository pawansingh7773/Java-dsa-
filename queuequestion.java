import java.util.*;
public class queuequestion {
    public static int [] negative(int [] arr , int n , int k){
        int[] ans = new int[n-k+1];
        Queue<Integer> q = new LinkedList<>();
        for(int i =0 ; i<n ; i++){
            if(arr[i]<0){
                q.add(i);
            }
        }
        for(int i =0 ; i <n-k+1 ; i++){
            if( q.size()>0 && q.peek()<i) q.remove();
            if( q.size()>0 && q.peek()>=i) ans[i] = arr[q.peek()];
            else if(q.size()==0) ans[i] =0;
        }
        return ans;


    }
    public static void main(String[] args) {
        int [] arr = {12,-1,-7,8,-15,30,16,28};
        int n = arr.length;
        int k =3;
        int [] ans = negative(arr, n, k);
        for(int i =0 ; i<ans.length;i++){
            System.out.print(ans[i] +" ");
        }
        System.out.println();
    }
    
}
