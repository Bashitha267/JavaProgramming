class Riverse{
	public static void riverseList(DoublyLinkedListADT list,DoublyLinkedListADT rivList){
		int count=list.getSize();
		Node current=list.head;
		
		for(int i=0;i<count;i++){
			rivList.insertAtFront(current.data);
			current=current.next;
		}
		
	}
	public static void main(String args[]){
		DoublyLinkedListADT list = new DoublyLinkedListADT();
		DoublyLinkedListADT rivList = new DoublyLinkedListADT();
		
		list.insertAtFront(1);
		list.insertAtFront(2);
		list.insertAtFront(3);
		list.insertAtFront(4);
		list.insertAtFront(5);
		list.insertAtFront(6);
		
		list.display();
		
		riverseList(list,rivList);
		rivList.display();
	}
}