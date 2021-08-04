package SimpleLinkedLists;

public class LinkedList {
	static Node head;

	// List creation ,An empty list defined by setting head to null
	public void LinkedList()
	{
		head = null;
	}
	
	public void insert(int data)
	{
		Node<Integer> newElement =new Node<Integer>(data);
		
		if(head==null)
		{
			head=newElement;
			return;
		}
		
		newElement.next=head;
		head=newElement;
	}
	
	//return the size of the linked list
	public static int size()
	{
		int count =1;
		Node node=head;
		while(node.next != null)
		{
			count++;
			node=node.next;
		}
		return count;
	}
	//this function delete the element next to head
	public static void deleteList(Node aNode)
	{
		aNode.next=aNode.next.next;
	}
	
	public static Node<Integer> search(Node L,Integer key)
	{
		
		while(L!= null && L.data != key)
		{
			L=L.next;
		}
		return L;
	}
	
	// this function prints the contents of the linked list starting from head
	public void Display()
	{
		if(this.head == null)
		{
			return;
		}
		
		//print all nodes
		Node tempNode =this.head;
		
		while(tempNode != null)
		{
			System.out.print(tempNode.data+"--->");
			tempNode=tempNode.next;
		}
		System.out.println("NULL");
	}
	
	public static void main(String[] args) 
	{
		//Node<Integer> head =new Node<Integer>(1);
		LinkedList ls =new LinkedList();
		
		//insert 4 elements in the list
		for(int i=0;i<4;i++)
		{
			ls.insert(i+2);
		}
		
		System.out.print("The elements in the linked list: ");
		ls.Display();
		
		int length=size();
		System.out.print("The size of the linked list "+length);
		
		//elements next to head will be deleted
		System.out.print("The linked list, after deletion of elements next to head: ");
		deleteList(head);
		ls.Display();
		
		System.out.print("The list of elements in the linked list after finding the search element: ");
		
		head=search(head,3);
		//display(head)
		ls.Display();
		
		//element next to head will be deleted
		
		System.out.print("The linked List, after deletion of elements next to head: ");
		deleteList(head);
		ls.Display();
		
		

	}

}

	
			
			
		