public class stackwithll {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class Stack{
        Node head = null;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
        }
        int pop(){
            if(head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = head.val;
            head = head.next;
            return top;
        }
        int peek(){
            if(head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }
        void displayrec(Node h){
            if(h == null) return;
            displayrec(h.next);
            System.out.print(h.val);
            System.out.println();
        }
        void display(){
            
            displayrec(head);
            

        }
        boolean isEmpty(){
            if(head == null) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        st.pop();
        st.pop();
        st.display();
        System.out.println(st.peek());
    }
    
}
