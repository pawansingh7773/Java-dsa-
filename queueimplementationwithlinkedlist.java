
public class queueimplementationwithlinkedlist {
          public static class Node{
            int val;
            Node next;
            Node(int val ){
                this.val = val;
            }}
            public static class queuell{
                Node head = null;
                Node tail = null;
                int size = 0;
                  void add(int val){
                    Node temp = new Node(val);
                    if(head == null){
                        head = tail = temp;
                    }else{
                        tail.next = temp;
                        tail = temp;
                    }
                    size++;

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
                    while(temp!=null){
                        System.out.print(temp.val +" ");
                        temp = temp.next;
                    }
                    System.out.println();
                  }
            }

            
                
            











            
          public static void main(String[] args) {
              queuell p = new queuell();
              p.add(1);
              p.add(2);
              p.add(3);
              p.add(4);
              p.add(5);
              p.display();
          }
}
