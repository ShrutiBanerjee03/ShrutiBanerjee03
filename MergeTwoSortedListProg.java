package MergeTwoSortedList;

public class MergeTwoSortedListProg {
public static Node<Integer>insert(int d,Node node){
		
		Node<Integer>newNode=new Node<Integer>(d);
		newNode.next = node.next;
		node.next = newNode;
		return node;
	}
	  public static void display(Node node){
		  
		  System.out.print("LinkedList " + node.data + " : ");
		  
		  while(node.next !=null) {
			  
			  System.out.print(node.next.data + " --> ");
			  node = node.next;
		  }
		   System.out.println("null");
	  }
	 public static Node<Integer>mergeTwoSortedLists(Node l1,Node l2){
		 
		 Node<Integer> dummy = new Node<>(3);
		 
		 Node<Integer> current = dummy;
		 
		 Node<Integer> p1 = l1.next;
		 
		 Node<Integer> p2 = l2.next;
		 
		 while(p1!=null&&p2!=null) {
			 
			 if(p1.data<p2.data) {
				 
				 current.next=p1;
				 p1=p2.next;
			 }
			 else {
				 
				 current.next=p2;
				 p2=p2.next;
			 }
			 current=current.next;
		 }
		   if(p1!=null) {
			   
			   current.next=p1;
		   }
		   else {
			   current.next=p2;
		   }
		    return dummy;
	 }
	 
	 public static void main (String[]args){
		  
		 Node<Integer> head1=new Node<>(1);
		 
		 for(int i=7; i>0; i-=2) {
			 head1=insert(i,head1);
		 }
		   display(head1);
		   
		   Node<Integer> head2=new Node<>(2);
		   
		   for(int j=8; j>0; j-=3) {
			   head2=insert(j,head2);
		   }
		    display(head2);
		    
		   Node<Integer> head3=new Node<>(3);
		   
		   head3 = mergeTwoSortedLists(head1,head2);
		   
		   display(head3);
		   
		 
	 }
	  
	
}