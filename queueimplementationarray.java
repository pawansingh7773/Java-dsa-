public class queueimplementationarray {
    public static class queuearray{
        int f = -1;
        int r =-1;
        int size = 0;
        int [] arr = new int [10];


        void add(int val){
            if(r == arr.length-1){
                System.out.println("queue is fully fulled !!!!");
                return;
            }
            if(f == -1){
                f = r = 0;
                arr[0] = val;
                size++;
                return;
            }
            arr[++r] = val;
            size++;
        }
        int remove(){
            
            if(size == 0) return -1;
            f++;
            size--;
            return arr[f-1];
        }
        int peek(){
            if(size == 0){
                System.out.println("queue is fully empty ");
                return -1;
            }
            return arr[f];
        }
        void display(){
            if(size == 0) return;
            for(int i =f ; i<=r ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }
        public static void main(String[] args) {
            queuearray q = new queuearray();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
          //  q.display();
            q.remove();
            q.remove();
            q.display();
            
            System.out.println(q.peek());
            System.out.println(q.size);
            System.out.println(q.r);
            
        }

    }
    
}
