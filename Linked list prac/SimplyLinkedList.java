 class Node{
	int key;
	Node next;
	public Node(){
		
	}
	public Node(int key){
		this.key=key;
		
	}
}

 class LinkedListADT{
	Node head;
	public LinkedListADT(){
		
	}

	public boolean isEmpty(){
		return(head==null);
	}
	public void insertAtFront(int value){
		Node node=new Node(value);
		
		if(head==null){
			head=node;
			head.next=null;
			return;
		}
		node.next=head;
		head=node;
	}
	public void display(){
		Node current=head;
		while(current!=null){
			System.out.println(current.key);
			current=current.next;
		}
		
	}
	
	public void insertAtEnd(int value){
		Node node=new Node(value);
		if(head==null){
			head=node;
			head.next=null;
			return;
		}
		Node current=head;
		while(current!=null){
			if(current.next==null){
				current.next=node;
				return;
			}
			current=current.next;
		}
	}
	public int Size(){
		if(head==null){
			return 0;
		}
		int count=0;
		Node current=head;
		
		while(current!=null){
			count=count+1;
			current=current.next;
		}
		return count;
	}
	public void insert(int index,int value){
		if(index<0){
			System.out.println("Enter a valid position");
			return;
		}
		if(Size()<=index){
			System.out.println("position exceeds size");
			return;
		}
		if(index==0){
		insertAtFront(value);
		return;
		}
		Node node=new Node(value);
		int count=0;
		Node current=head;

		while(current!=null){
			
			if(count==index-1){
				node.next=current.next;
				current.next=node;
				return;
			}
			current=current.next;
			count=count+1;
		}
		
	}
	public void deleteFirst(){
		if(isEmpty()){
			System.out.println("Array is Empty");
		}
		head=head.next;
		
	}
	public void deleteLast(){
		if(isEmpty()){
			System.out.println("Array is Empty");
		}
		
		int count=0;
		Node lastNode=head;
		int size=Size();
		while(lastNode!=null){
			if(count==size-2){
				lastNode.next=null;
				return;
			}
			lastNode=lastNode.next;
			count++;
		}
	}
	public void delete(int index){
		Node current=head;
		int count=0;
		if(index==0){
			deleteFirst();
		}
		if(index>=Size()){
			System.out.println("Invalid index");
		}
		if(index==Size()-1){
			deleteLast();
			return;
		}
		if(isEmpty()){
			System.out.println("Array is Empty");
		}
		while(current!=null){
			if(count==index-1){
				current.next=current.next.next;
				
			}
			current=current.next;
			count++;
			
		}
	}
	public void riverse(){
		
		
	}
	public int search(int value){
		Node current=head;
		int count=0;
		while(current!=null){
			if(current.key==value){
				return count;
			}
			current=current.next;
			count++;
		}
		return -1;
		
	}
}

public class SimplyLinkedList{
	public static void main(String args[]){
		LinkedListADT linkedList=new LinkedListADT();
	
		linkedList.insertAtFront(3);
		linkedList.insertAtFront(2);
		linkedList.insertAtFront(1);
		linkedList.insertAtEnd(5);
		linkedList.insertAtEnd(6);
		linkedList.insertAtEnd(7);
		
		linkedList.insertAtEnd(8);
		linkedList.insert(3,4);
		linkedList.insert(0,10);
		linkedList.deleteFirst();
		linkedList.deleteLast();
		
		linkedList.delete(6);
		System.out.println("Index:"+   linkedList.search(5));
	  
		
		
		linkedList.display();
	}
}