class StackADT{
	int stackArr[];
	int top;
	int maximum;
	public StackADT(int size){
		stackArr=new int[size];
		maximum=size;
		top=-1;
	}
	public boolean isEmpty(){
		return top==-1;
	}
	public boolean isFull(){
		return top==maximum-1;
	}
	public void push(int value){
		if(isFull()){
			System.out.println("Stack Overflow");
		}
		else{
			stackArr[++top]=value;
			// System.out.println(top);
			
		}
	}
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return -1;
		}
		else{
			return stackArr[top--];
				
		}
	}
	public int peek(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return -1;
		}
		else{
			 return stackArr[top];
				
		}
	}
	public void display(){
		// if()
		for(int i=top;i>=0;i--){
			System.out.println(stackArr[i]);
		}
	}
	
	
	
	
	
}