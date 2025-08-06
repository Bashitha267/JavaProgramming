class Test{
public static void main(String args[]){
	StackADT stack=new StackADT(5);
	stack.push(5);
	stack.push(6);
stack.push(7);

System.out.println(stack.pop());
System.out.println(stack.peek());
stack.push(76);
stack.push(77);
stack.push(78);
stack.pop();
stack.push(79);

	 stack.display();
	 
}



}	
	
	
