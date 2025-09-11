class Node{
	int data;
	Node left;
	Node right;
	public Node(int value){
		data=value;
		left=null;
		right=null;
		}
	
}
class BinaryTreeADT{
	Node root;
	public BinaryTreeADT(){
		root=null;
	}
	public boolean isEmpty(){
		return root==null;
	}
	public Node insert(Node cnode,int data){
		if(cnode==null){
			cnode=new Node(data);
			return cnode;
		}
		if(data<cnode.data){
			cnode.left=insert(cnode.left,data);
		}
		else if(data>=cnode.data){
			cnode.right=insert(cnode.right,data);
		}
		return cnode;
		
		
	}
	public void inOrder(Node cNode){
		if(cNode!=null){
			inOrder(cNode.left);
			System.out.println(cNode.data);
			inOrder(cNode.right);
		}	
	}
	public void postOrder(Node cNode){
		if(cNode!=null){
			postOrder(cNode.left);
			postOrder(cNode.right);
			System.out.println(cNode.data);
			
		}
	}
	public void preorder(Node cNode){
		if(cNode!=null){
		
			System.out.println(cNode.data);
			preorder(cNode.left);
			preorder(cNode.right);
		}
	}
	public boolean Search(Node cNode,int value){
		if(cNode==null){
			return false;
		}
		if(cNode.data==value){
			return true;
		}
		if(cNode.data<value){
			return Search(cNode.right,value);
		}else {
			 return Search(cNode.left,value);
		}
	}
	public Node SearchNode(Node cNode,int value){
		if(cNode==null){
			return null;
		}
		if(cNode.data==value){
			return cNode;
		}
		if(cNode.data<value){
			return SearchNode(cNode.right,value);
		}else {
			 return SearchNode(cNode.left,value);
		}
	}
	public int getMinimum(Node cNode){
		if(cNode.left==null){
			return cNode.data;
		}
		return getMinimum(cNode.left);
	}
		public int getMaximum(Node cNode){
		if(cNode.right==null){
			return cNode.data;
		}
		return getMaximum(cNode.right);
	}
	public Node deletion(Node cNode,int data){
		
		if(cNode==null){
			return cNode;
		}
		if(data<cNode.data){
			cNode.left=deletion(cNode.left,data);
		}
		else if(cNode.data>cNode.data){
			cNode.right=deletion(cNode.right,data);
		}
		else{
			if(cNode.left==null && cNode.right==null){
				cNode=null;
			}
			else if(cNode.left==null){
				cNode=cNode.right;
				
			}else if(cNode.right==null){
				cNode=cNode.left;
			}
			else{
				int minValue=getMinimum(cNode.right);
				cNode.data=minValue;
				cNode.right=deletion(cNode.right,minValue);
				
			}
			return cNode;
		}
		
		
	}
	
}
class TestBinaryTree{
	public static void main(String args[]){
		BinaryTreeADT tree=new BinaryTreeADT();
		tree.root=tree.insert(tree.root,50);
		tree.root=tree.insert(tree.root,30);
		tree.root=tree.insert(tree.root,70);
		tree.root=tree.insert(tree.root,20);
		tree.root=tree.insert(tree.root,40);
		tree.root=tree.insert(tree.root,60);
		tree.root=tree.insert(tree.root,80);
		tree.root=tree.insert(tree.root,10);
		tree.root=tree.insert(tree.root,25);
	    tree.deletion(tree.root,10);
			
		System.out.println("InOrder");
		
		tree.inOrder(tree.root);
		
	System.out.println("----------------------------------------------");
		
	System.out.println("PostOrder");
		
		tree.postOrder(tree.root);
		
	System.out.println("----------------------------------------------");
		
	System.out.println("PreOrder");
		
		tree.preorder(tree.root);	
	
			System.out.println(tree.Search(tree.root,60));
			System.out.println(tree.SearchNode(tree.root,100));
			System.out.println("Minimum Value: "+tree.getMinimum(tree.root));
			System.out.println("Maximum Value: "+tree.getMaximum(tree.root));
			
			
			
		
	// System.out.println(tree.isEmpty());
	}
	
}