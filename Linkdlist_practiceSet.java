/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static void CreateNode(){
        Main m = new Main();
        m.head  = new Node(12);
        Node sec = new Node(12);
        Node third = new Node(14);
        Node four = new Node(15);
        Node five = new Node(16);
        Node six = new Node(17);

      m.head.next = sec;
      sec.next = third;
      third.next = four;
      four.next = five;
      five.next = six;
      six.next = null;
    }
    
   
    public static void insertFirst(int data)
	{
	Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
		newNode.next=head;
		head=newNode;
		}
		
	}

    public static void insertAtend(int data)
	{
	Node newnode=new Node(data);
	if(head==null){
	     head = newnode;
	    return;
	}
	Node temp = head;
	while(temp.next!=null){
	    temp = temp.next;
	}
	temp.next=newnode;
	newnode.next = null;
	}
	


    
    public static void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
           
        }
    }
    public static void Reverse(Node head){
        Node temp = head;
        if(temp == null){
            return;
        }
        Reverse(temp.next);
        System.out.print(temp.data+ "->");
    }
     static public void Middle(){
         Node slow= head; 
         Node fast = head;
         while(fast!=null ){
            slow = slow.next;
            fast =fast.next.next;
         }
         System.out.println(slow.data + " ");
     }
     static public boolean Cycle(){
         Node slow = head;
         Node fast = head;
         while(fast!=null){
             slow = slow.next;
             fast = fast.next.next;
             
             if(slow == fast){
                 return true;
             }
         }
         return false;
     }
     
    public static void removeDuplicate() {
    Node curr = head;
    while (curr != null && curr.next != null) {
        if (curr.data == curr.next.data) {
            // Skip the duplicate node
            curr.next = curr.next.next;
        } else {
            // Move to the next node
            curr = curr.next;
        }
    }
}


	public static void main(String[] args) {
	    CreateNode();
	   // insertFirst(20);
	   // insertAtend(20);
	    //removeDuplicate();
	    System.out.println(Cycle());
	    Middle();
	    Display();
	    System.out.println("Reversed");
	    Reverse(head);

	}
}
