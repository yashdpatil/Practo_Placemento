public class Main
{
    static Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
        int count = 0;
        public  void InsertFirst(int data){
            Node n = new Node(data);
            if(head == null)
            {
                head = n;
            }else{
            n.next=head;
            head = n;
            }
        }
        public void Display(){
          Node temp = head;
                while(temp!=null){
                    count++;
                System.out.print(temp.data+"->");
                temp=temp.next;
                }
                System.out.println();
        System.out.println("The LEngth is"+count);

        
        }
        public void DeleteElementAtfirst(){
            if(head==null){
                
                System.out.print("Linkdlist is empty");
                     }
            head=head.next;
            
        }
        public int getMidddle(){
            Node fast = head;
            Node slow = head;
            while(fast!=null && slow!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }
     public void DeleteElementAtLast(){
            Node temp = head;
            Node pnext = null;
            while(temp.next!=null){
                pnext = temp;
                temp=temp.next;
            }
            pnext.next =null;
            
            
        }
        
        public void InsertLast(int data){
            Node temp = head;
            Node n = new Node(data);
            if(temp == null){
                temp = n;
            }
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
                n=head;
        }
        public void InsertMiddle(int index,int val){
            Node n = new Node(val);
            Node temp =head;
            for(int i = 0;i<index;i++){
                temp = temp.next;
            }
            n.next=temp.next;
            temp.next=n;
        }
        public void rev(Node n){
           // Node n = head;
            if(n==null){
                return;
            }
            rev(n.next);
            System.out.print(n.data+"->");
        }
    
    
	public static void main(String[] args) {
	    Main m = new Main();
	    m.InsertFirst(10);
	    m.InsertFirst(20);
	    m.InsertFirst(30);
	    m.InsertFirst(40);
	    m.InsertLast(50);
	    m.InsertMiddle(0,15);
	   // m.rev(head);
	    //m.DeleteElementAtfirst();
	   // m.DeleteElementAtLast();
	   m.Display();
	   System.out.println(m.getMidddle());
	   
	   System.out.println();
	   	    m.rev(head);


        

	}
}
