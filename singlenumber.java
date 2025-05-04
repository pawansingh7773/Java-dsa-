import java.util.*;
public class singlenumber {
    static int method(int [] arr){
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i =0;i<n;i++){
           if(hm.containsKey(arr[i])){
            hm.put(arr[i], hm.get(arr[i])+1);
           }else{
            hm.put(arr[i], 1);
           }
           
        }
        for(var e : hm.entrySet()){
            if(e.getValue() == 1) return e.getKey();
        }


        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(method(arr));
    }
    
}
