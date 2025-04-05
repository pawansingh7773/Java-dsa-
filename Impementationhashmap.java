import java.util.*;
public class Impementationhashmap {
    static class pawanHashmap<K , V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private class Node{
            K key;
            V value;
            Node(K key , V value){
                this.key = key;
                this.value = value;

            }
        }
        private void initbucket(int N){
            buckets = new LinkedList[N];
            for(int i =0 ; i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }

        }

        public pawanHashmap(){
            initbucket(DEFAULT_CAPACITY);
        }
        private LinkedList<Node>[] buckets;
        private int n;
        private int hashfunction(K key){
            int hc = key.hashCode();
            return (Math.abs(hc))%buckets.length;
        }
        private int SearchInbucket(LinkedList<Node> ll , K key){
            for(int i =0 ; i< ll.size(); i++){
                if(ll.get(i).key == key){
                    return i ;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node>[] oldbucket = buckets;
            initbucket(oldbucket.length*2);
            n= 0;
            for(var bucket : oldbucket){
                for(var node : bucket){
                    put(node.key , node.value);
                }

            }

        }


        public void put(K key , V value){
            int bi = hashfunction(key);
            LinkedList<Node> currbucket = buckets[bi];
            int ei = SearchInbucket(currbucket , key);
            if(ei == -1){
                Node node = new Node(key, value);
                currbucket.add(node);
                n++;
                
            }else{
                Node currnode = currbucket.get(ei);
                 currnode.value = value;
                

            }
            if(n >= buckets.length*DEFAULT_LOAD_FACTOR){
                rehash();
            }


        }
        public  V get(K key){
            int bi = hashfunction(key);
            LinkedList<Node> currbucket = buckets[bi];
            int ei = SearchInbucket(currbucket , key);
            if(ei != -1){
                Node currnode =  currbucket.get(ei);
                return currnode.value;
            }
            return null;


        }
        public V remove(K key){
            int bi = hashfunction(key);
            LinkedList<Node> currbucket = buckets[bi];
            int ei = SearchInbucket(currbucket , key);
            if(ei != -1){
                V val = currbucket.get(ei).value;
                currbucket.remove(ei);
                n--;
                return val;
            }
            return null;

        }
        public int size(){
            return n;
        }
        public int capacity(){
            return buckets.length;
        }







    }




    public static void main(String[] args) {
        pawanHashmap<Integer, Integer> mp = new pawanHashmap<>();
        mp.put(1, 9);
        mp.put(2, 8);
        mp.put(3, 7);
        mp.put(4, 6);
        mp.put(5, 5);
        System.out.println(mp.get(5));
        mp.remove(5);
        System.out.println(mp.get(5));
        System.out.println(mp.size());
        System.out.println(mp.capacity());

        
    }
    
}
