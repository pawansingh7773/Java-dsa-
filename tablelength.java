import java.util.*;
public class tablelength {
    static int lenghtoftable(int [] bag){
        HashSet<Integer> hs = new HashSet<>();
        int max = 0;
        for(int i =0 ; i<bag.length;i++){
            int num = bag[i];
            if(!hs.contains(num)){
                hs.add(num);
                max = Math.max(max, hs.size());
            }else{
                hs.remove(num);
            }
        }
        return max;
    }
  public static void main(String[] args) {
      int [] bag = {1,1};
      System.out.println("answer ::" +lenghtoftable(bag));
  }  
}
