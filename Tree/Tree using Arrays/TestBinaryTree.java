class BinaryTree{
	int maxSize;
	int currentSize=0;
	int array[];
	
	public BinaryTree(int max){
		array=new int[max];
		maxSize=max;
		
	}
	public boolean isFull(){
		return maxSize==currentSize;
	}
	public boolean isEmpty(){
		return currentSize==0;
	}
	public void insertElement(int value){
		if(isFull()){
			System.out.println("array is full"); 
		}else{
			array[currentSize]=value;
			currentSize++;
		}
	}
	public void levelDisplay(){
		for(int i=0;i<currentSize;i++){
			if(array[i]!=0){
				System.out.print(array[i]+" ");
			}
			
		}
		System.out.println("");
	}
	public int Search(int value){
		if(isEmpty()){
			System.out.print("Tree is empty");
		}
		for(int i=0;i<currentSize;i++){
			if(array[i]==value){
				return i;
			}
		}
		return -1;
		
	}
	public void delete(int value){
		int deleteindex=Search(value);
		if(deleteindex!=-1){
			array[deleteindex]=0;
			System.out.println("Value deleted.");
		}else{
			System.out.print("index not found");
		}
	
	}
	public void inOrder(int left,int right,int root){
		if(array[left]==0){
			System.out.println(root);
			return;
		}
		if((right<=currentSize||right==0)){
			inOrder(2*left+1,2*left+2,left);
		    System.out.println(array[right]);
		}
		
		
	
		
		
	}
	public void postOrder(int index){
		if(isEmpty()) {System.out.println("Tree is empty");}
		else{
			if(index<0||index>=currentSize){
				System.out.println("index is not correct");
				return;
			}
			else{
				postOrder(2*index+1);
				postOrder(2*index+2);
				System.out.println(array[index]+" ");
			}
		}
	}
}
class TestBinaryTree{
	public static void main(String args[]){
		BinaryTree Tree1=new BinaryTree(7);
		Tree1.insertElement(5);
		Tree1.insertElement(3);
		Tree1.insertElement(9);
		Tree1.insertElement(2);
		Tree1.insertElement(4);
		Tree1.insertElement(7);
		Tree1.insertElement(1);
		// Tree1.delete(45);
		Tree1.inOrder(0,0,0);
		// System.out.print(Tree1.Search(120));
		

	}
}