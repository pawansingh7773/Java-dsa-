public class binarytry {

    public static int binary(int [] arr , int target){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int ans = 0;
        for(int i = st ; i<=end ; i++){
            int mid = st + ( end - st)/2;
            if(target == arr[mid] ) ans = mid;
            else if(target> arr[mid] ) st = mid+1;
            else if(target < arr[mid]) end = mid-1;

        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int target = 6;
        System.out.println(binary(arr, target));




    }




    
}
