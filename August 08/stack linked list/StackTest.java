class Node{
	String data;
	Node next;
	public Node(String data){
		this.data=data;
		this.next=null;
	}
}
class StackADT{
	// node head;
	Node top;
public StackADT(){
	this.top=null;
	
}
public boolean isEmpty(){
	return top==null;
}
public void push(String value){
	Node newnode=new Node(value);
	if(isEmpty()){
		top=newnode;
	}
	else{
		newnode.next=top;
		top=newnode;
	}
	
}
public String peek(){
	if(isEmpty()){
		return "stack is empty";
	}
	return top.data;
}
public String pop(){
	if(isEmpty()){
		return "stack is empty";
	}
	
	else{
		String val=top.data;
		top=top.next;
		return val;
		
	}
}
public void display(){
	Node current=top;
	while(current!=null){
		System.out.println(current.data);
		current=current.next;
	}
}
}
class StackTest{
	public static void main(String args[]){
		StackADT list=new StackADT();
		list.push("Nimesh");
		list.push("Bashitha");
		list.push("Mango");
		list.push("Banana");
		
		System.out.println(list.pop());
		list.display();
		// list.display();
		// System.out.println(list.top.data);
	}
}