public class queuewithll2 {

    public static class Node{
        Node next;
        int val;
        Node(int val){
            this.val = val;
        }
    }
    public static class queue2{
        Node head = null;
        Node tail  = null;

        void add(int val){
            Node temp = new Node(val);
            if(head == null){
                
                head = tail = temp;
            }
            tail.next = temp;
            tail = temp;

        }

        int remove(){
            if(head == null) return -1;
            int x = head.val;
            head = head.next;
            return x;
        }

        int peek(){
            if(head == null) return -1;
            return head.val;
        }

        void display(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.val +" ");
                temp = temp.next;

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        queue2 n = new queue2();
        n.add(3);
        n.add(4);
        n.add(5);
        n.add(6);
        n.display();
        System.out.println(n.peek());
        System.out.println(n.remove());

        n.remove();
        System.out.println(n.peek());
        n.display();
        System.out.println(n.remove());
        n.display();
    }
    
}
