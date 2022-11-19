import java.util.Scanner;
public class Problem1 {   
    public class Node
    {  
        int data;  
        Node next;  
        public Node(int data) 
        {  
            this.data = data;  
        }  
    }   
    public Node head = null;  
    public Node tail = null;  
    public void add(int data)
    {    
        Node newNode = new Node(data);  
        if(head == null) 
        {  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else 
        {  
            tail.next = newNode;  
            tail = newNode;   
            tail.next = head;  
        }  
    }  
    public void display() 
    {  
        Node current = head;  
        if(head == null) 
        {  
            System.out.println("Circulr Linked List is empty");  
        }  
        else 
        {  
            System.out.println("Nodes of the circular linked list are: ");  
             do
             {   
                System.out.print("->"+ current.data);  
                current = current.next;  
            }while(current != head);  
        }  
    }
     public int operation(int a, int b) {
    	Node temp = head; 
    	Node temp1 = head; 
    	 if(head == null)
    	 {
    		 System.out.println("List is empty");  
    	 }
    	 else
    	 {
    		 while(temp.data !=a)
    		 {
    			 temp =temp.next;
    		 }
    		 while(temp1.data !=b)
    		 {
    			 temp1 =temp1.next;
    		 }
    		 while(temp.data != temp1.data)
        	 {
        		 temp =temp.next;
        		 temp =temp.next;
        		 temp1 =temp1.next;
        	 }
    	 }
    	 return temp.data;
    	 
     }
    public static void main(String[] args) {  
        Problem1 cl = new Problem1();  
        cl.add(1);  
        cl.add(2);  
        cl.add(3);  
        cl.add(4); 
        cl.add(5); 
        cl.add(6); 
        cl.add(7); 
        cl.add(8); 
        cl.add(9); 
        cl.add(10); 
        cl.add(11); 
        cl.add(12); 
        cl.display();  
        int v,x,y;
        Scanner sc =new Scanner(System.in);
        System.out.println();
        System.out.println("Enter node x value:");
        x = sc.nextInt();
        System.out.println("Enter node y value:");
        y= sc.nextInt();
        v = cl.operation(x,y);
        System.out.println("Point at which both x and y meet each other is :"+v);
    }  
} 

