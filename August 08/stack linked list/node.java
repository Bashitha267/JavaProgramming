public class Node{
	String data;
	Node next;
	public node(int data){
		this.data=data;
		this.next=null;
	}
}
public class stackADT{
	// node head;
	node top;
public stackADT(){
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
		top.next=newnode;
		top=newnode;
	}
	
}
public void display(){
	while(top!=null){
		System.out.println(top.data);
	}
}
}
public class StackTest{
	public static void main(String args[]){
		stackADT list=new stackADT();
		list.push("Nimesh");
		list.push("Bashitha");
		list.display();
	}
}