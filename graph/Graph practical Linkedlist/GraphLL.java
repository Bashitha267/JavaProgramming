class Node{
	int destination;
	int weight;
	Node next;
	public Node(int destination,int weight){
		this.destination=destination;
		this.weight=weight;
		next=null;
	}
}
class GraphLLADT{
	Node arr[];
	int currentSize;
	int maxSize;
	
	
	
	public GraphLLADT(int maxSize){
		this.maxSize=maxSize;
		arr=new Node[maxSize];
		currentSize=-1;
	}
	public boolean isFull(){
		return currentSize==maxSize-1;
	}
	public boolean isEmpty(){
		return currentSize==-1;
	}
	public void insertVertex(){
		if(isFull()){
			System.out.println("Graph is full");
			return;
		}
		else{
			currentSize++;
		}
	}
	public void insertEdge(int source,int destination,int weight){
		if(Search(source,destination)){
			System.out.println("Already inserted");
			return;
		}
		if(source>=0 && source<=currentSize && destination>=0 && destination<=currentSize){
		Node node1=new Node(destination,weight);
		node1.next=arr[source];
		arr[source]=node1;
		
		Node node2=new Node(source,weight);
		node2.next=arr[destination];
		arr[destination]=node2;
		}
		else{
			System.out.println("Invalid Source or destination");
		}
		
		
	}
	public boolean Search(int source,int destination){
		if(isEmpty()){
			return false;
		}
		Node currentNode=arr[source];
		if(currentNode==null){
			return false;
		}
		else{
				while(currentNode!=null){
					if(currentNode.destination==destination){
						return true;
					}
					currentNode=currentNode.next;
				}
			
		
		return false;
		}
		
	}
	// public void deleteVertex(int source){
		// if(source>=0 && source<=currentSize){
			// arr[source]=null;
			
		// }else{
			// System.out.println("Invalid Vertex");
		// }
	// }
	// public void deleteEdge(int source,int destination){
		// if(Search(int source,int destination)){
			
		// }
	// }
	private Node deleteNode(Node head,int data){
		if(head==null){
			return null;
		}
		if(head.destination==data){
			return head.next;
		}
		Node curr=head;
		while(curr.next!=null){
			if(curr.next.destination==data){
				curr.next=curr.next.next;
				break;
			}
			curr.next=curr.next.next;
		}
		return head;
	}
	public void deleteEdge(int source,int destination){
		if(source<0|| source>=currentSize||destination<0||destination>=currentSize){
			System.out.println("Invalid Vertex");
			return;
		}
		arr[source]=deleteNode(arr[source],destination);
	}
	public void travel(){
		for(int i=0;i<=currentSize;i++){
			Node currentNode=arr[i];
			System.out.print("Source "+i+"=>");
			while(currentNode!=null){
				System.out.print(currentNode.destination+",");
				currentNode=currentNode.next;
			}
			System.out.println("");
		}
		
		
	}
	public void deleteVertex(int source){
		if(arr[source]==null){
			System.out.println("Not Found");
			return;
		}
	}
	
}
class GraphLL{
	public static void main(String args[]){
		GraphLLADT graph=new GraphLLADT(5);
		graph.insertVertex();
		graph.insertVertex();
		graph.insertVertex();
		graph.insertVertex();
		graph.insertVertex();
		graph.insertVertex();
		graph.insertEdge(0,2,5);
		graph.insertEdge(0,1,2);
		graph.insertEdge(0,1,2);
		graph.deleteEdge(0,2);
		graph.travel();
	}
}