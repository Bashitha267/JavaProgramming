
	class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedListADT {
	Node tail;

	public LinkedListADT() {
		this.tail = null;
	}
	
	public boolean isEmpty() {
		return (tail == null);
	}

	public void insertAtFront(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			tail = newNode;
			tail.next=tail;
		} else {
			newNode.next=tail.next;
			tail.next=newNode;
			
		}
	}

	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			tail = newNode;
			tail.next=tail;
		} else {
			newNode.next=tail.next;
			tail.next=newNode;
			tail=newNode;
			
			
			
		}
	}

	public void insertAtIndex(int data, int index) {
		if (index < 1 || index > getSize()+1) {
			System.out.println("Invalid index");
			return;
		}
		if (index == 1) {
			insertAtFront(data);
			return;
		}
		Node newNode = new Node(data);
		Node current = tail.next;
		for (int c = 1; c < index - 1; c++){
			current = current.next;				
		}
		current=current.next;
		
		// System.out.println(current.data);
		
		 newNode.next = current.next;
		current.next = newNode;
	}

	public void deleteAtFront() {
		if (isEmpty()) {
			System.out.println("Linked list is empty");
		} else {
			tail.next=tail.next.next;
		}
	}

	public void deleteAtEnd() {
		if (isEmpty()) {
			System.out.println("Linked list is empty");
		} else if (tail.next == tail) {
			tail = null;
		} else {
			Node current = tail.next;
			int size=getSize();
			for(int i=0;i<size-2;i++){
				current=current.next;
			}
			// System.out.println(current.data);
			
			current.next=tail.next;
			tail=current;
			
		}
	}

	// public void deleteAtIndex(int index) {
		// if (index < 1 || index > getSize()) {
			// System.out.println("Invalid index");
			// return;
		// }
		// if (index == 1) {
			// deleteAtFront();
			// return;
		// }
		// Node current = head;
		// for (int c = 1; c < index - 1; c++){
			// current = current.next;				
		// }
		// current.next = current.next.next;
	// }

	public boolean search(int data) {
		Node current = tail.next;
		int size=getSize();
		for(int i=0;i<size;i++){
			if(data==current.data){
				return true;
				
			}
			current=current.next;
		}
		return false;
	}

	public int getSize() {
		int count = 0;
		Node current = tail.next;
		while (current != tail) {
			count++;
			current = current.next;
		}
		return count+1;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Linked list is empty");
		} else {
			Node current = tail.next;
			int count=0;
			while(current != tail) {
				count++;
				current = current.next;
			}
			Node current12 = tail.next;
			count++;
			for(int i=0;i<count;i++){
				System.out.println(current12.data);
				current12 = current12.next;
			}
			
		}
	}
}

public class CircularLinkedList {
	public static void main(String[] args) {
		LinkedListADT linkedList = new LinkedListADT();
linkedList.insertAtFront(4);

		linkedList.insertAtFront(3);
		linkedList.insertAtFront(2);
		linkedList.insertAtFront(1);
        linkedList.insertAtEnd(6);
		
		// System.out.println("Size is:"+linkedList.getSize());
		// System.out.println(linkedList.search(9));
		// System.out.println(linkedList.search(2));
		linkedList.insertAtIndex(5,4);
		linkedList.deleteAtFront();
		linkedList.deleteAtEnd();
		linkedList.display(); // Output:  2 3 4 5 
		
	}
}

