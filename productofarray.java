public class productofarray {
    static int[] method(int [] arr){
        int n = arr.length;
        int [] ans = new int[n];
        int [] pref = new int[n];
        int [] suff = new int[n];
        //prefix array
        pref[0] = arr[0];
        for(int i =1 ; i<n;i++){
            pref[i] = pref[i-1]*arr[i];

        }
        suff[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            suff[i] = suff[i+1]*arr[i];
        }
        ans[0] = suff[1];
        ans[n-1] = pref[n-2];
        for(int i =1 ;i<ans.length-1;i++){
            ans[i] = suff[i+1] * pref[i-1];
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int [] arr = {-1,1,0,-3,3};
        int [] ans = method(arr);
        for(var e : ans){
            System.out.println(e);
        }
    }
    
}
