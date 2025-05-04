import java.util.*;
public class randomizedset {
    public class  RandomizedSet {
        ArrayList<Integer> ac = new ArrayList<>();
        HashMap<Integer , Integer> hm = new HashMap<>();
         

        public RandomizedSet(){
             
        }

        
    
    
    public boolean insert(int val) {
        if(hm.containsKey(val)) return false;
        ac.add(val);
        hm.put(val, ac.size()-1);
        return true;
        
    }
    
    public boolean remove(int val) {
        if(!hm.containsKey(val)) return false;
        int idx = hm.get(val);
        Collections.swap(ac, idx, ac.size()-1);
        int element = ac.get(idx);
        hm.put(element, idx);
        ac.remove(ac.size()-1);
        hm.remove(val);
        return true;
        
    }
    
    public int getRandom() {
        Random rand = new Random();
        int n = rand.nextInt(ac.size());
        return ac.get(n);
        
    }
}

public static void main(String[] args) {
    randomizedset rs = new randomizedset();
    boolean val = rs.insert(6);
}
}

