import java.util.*;
public class validanagram1 {
    static boolean method(String str , String ptr){
        int n = str.length();
        int m = ptr.length();
        if(n != m)return false;

        HashMap<Character , Integer> hm = new HashMap<>();
        for(int i =0; i<n;i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }else{
                hm.put(ch, 1);
            }
        }

        for(int i =0 ; i<m ;i++){
            char ch = ptr.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)-1);
            }
        }
         for( var num : hm.entrySet()){
            if(num.getValue() != 0)
            return false;
         }
         return true;










    }
    public static void main(String[] args) {
        String str = "pawan";
        String ptr = "nawpr";
        System.out.println(method(str, ptr));
    }
    
}
