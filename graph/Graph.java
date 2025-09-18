class GraphADT{
	int matrix[][];
	int maximum;
	int current=0;
	
	public GraphADT(int size){
			maximum=size;	
		    matrix=new int[size][size];		
	}
	public boolean isFull(){
		return current==maximum;
	}
	public boolean isEmpty(){
		return current==0;
	}
	public void insert(int vertex){
		if(isFull()){
			System.out.println("Graph is full.");
			return;
		}
		else{
			current++;
		}
	}
	public void delete(int vertex){
		if(isEmpty()){
			System.out.println("Graph is empty.");
			return;
		}
		if((0<=vertex && vertex<current)){
			for(int i=0;i<current;i++){
					 matrix[i][vertex]=0;
					 matrix[vertex][i]=0;
				}				
			}
		else{
			System.out.println("Invalid Nodes");
		}
	}
	public void insertEdge(int source,int dest,int weight){
		if((0<=source && source<current) && (0<=dest && dest<current) && weight>=1){
			matrix[source][dest]=weight;
			matrix[dest][source]=weight;
			System.out.println("Inserted");
			return;
		}else{
			System.out.println("Invalid Nodes");
		}
	}
	public void deleteEdge(int source,int dest){
		if((0<=source && source<current) && (0<=dest && dest<current)){
			matrix[source][dest]=0;
			matrix[dest][source]=0;
			System.out.println("deleted");
			return;
		}else{
			System.out.println("Invalid Nodes");
		}
	}
	public boolean SearchEdge(int source,int dest){
			if((0<=source && source<current) && (0<=dest && dest<current)){
				return (matrix[source][dest]!=0)
			}
			else return false;
			     
		
	}
	public void searchDistance(int dist){
	 boolean check=false;
			for(int i=0;i<current;i++){
			for(int j=0;j<current;j++){
				if(matrix[i][j]==dist){
					System.out.println(i+"=> "+j+":"+matrix[i][j]+"\t");
					check=true;
			    
				}
				
				
			}
		}
		if(!check){
			System.out.println("Not in graph");
		}
		
	}
	public void travelersal(){
		for(int i=0;i<current;i++){
			for(int j=0;j<current;j++){
				if(matrix[i][j]!=0)
				System.out.println(i+"=> "+j+":"+matrix[i][j]+"\t");
				
			}
		}
	}
	
}
class Graph{
	public static void main(String args[]){
		GraphADT graph=new GraphADT(4);
		graph.insert(0);
		graph.insert(1);
		graph.insertEdge(0,1,6);
		graph.insert(2);
		graph.insert(3);
		graph.insertEdge(1,2,2);
		graph.insertEdge(1,3,10);
		graph.delete(2);
		graph.search(10);
		// graph.travelersal();		
	}
}