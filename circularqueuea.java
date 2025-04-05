public class circularqueuea {
    public static class cqueuea{
        int f = -1;
        int r = -1;
        int size = 0;
        int [] arr = new int[4];
        void add(int x){
            if(size == arr.length){
                System.out.println("Sir size is fullum !!!");
                return ;t
            }
            else if(size == 0){
                f=r=0;
                arr[0] = x;
                size++;
            }
            else if(r == arr.length-1){
                r =0;
                arr[0] = x;
                size++;
            }
            else{
                arr[++r] = x;
                size++;
            }
        }
        int remove(){
            if( size == 0) return -1;
            if(f == arr.length-1){
                int val = arr[f];
                f =0;
                size--;
                return val;
                
            }
            int val = arr[f];
            f++;
            size--;
            return val;
            
        }
        int peek(){
            if(size == 0)return -1;
            return arr[f];
        }
        void display(){
            if(f <= r){
                for(int i = f ; i <= r ; i++){
                    System.out.print(arr[i] +" ");
                }
                System.out.println();
            }
            else if(r <= f){
                for(int i = f ; i <= arr.length-1 ; i++){
                    System.out.print(arr[i] +" ");
                }
                System.out.println();
                for(int i = 0 ; i<=r ; i++){
                    System.out.print(arr[i] +" ");
                    
                }
                System.out.println();

            }
        }
    }
    public static void main(String[] args) {
        cqueuea e = new cqueuea();
        e.add(1);
        e.add(2);
        e.add(3);
        e.add(4);
        e.add(5);
        e.add(8);
        e.display();
        System.out.println(e.peek());
        
    }
    
}
