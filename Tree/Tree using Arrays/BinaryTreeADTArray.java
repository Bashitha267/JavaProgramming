class BTreeADT {
    String[] treeArray;
    int maxSize;
    int currentSize;

    public BTreeADT(int maxSize) {
        this.maxSize = maxSize;
        this.treeArray = new String[maxSize];
        this.currentSize = 0;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public void insert(String data) {
        if (isFull()) {
            System.out.println("Tree is full.");
        } else {
            treeArray[currentSize] = data;
            currentSize++;
            System.out.println("Inserted " + data);
        }
    }

    public int search(String data) {
        if (isEmpty()){
			System.out.println("Tree is empty.");			
        } else {
			for (int i = 0; i < currentSize; i++) {
				if (treeArray[i].equals(data)) {
					return i;
				}
			}
        }
		return -1;
    }

    public boolean delete(String data) {
        int index = search(data);        
        if (index == -1) {
            System.out.println("Element not found.");
            return false;
        } else {
            treeArray[index] = treeArray[currentSize - 1];
            treeArray[currentSize - 1] = null;
            currentSize--;
            System.out.println("Deleted " + data + " from the tree.");
            return true;
        }
    }

    public void inorderTraversal(int index) {
		if (isEmpty()) System.out.println("Tree is empty.");			
        else {
			if (index < 0 || index >= currentSize){
				System.out.println("Index is not correct!");
				return;
			} else if (treeArray[index] == null) {
				System.out.print("- ");
				return;
			} else {
				inorderTraversal(2 * index + 1);
				System.out.print(treeArray[index] + " ");
				inorderTraversal(2 * index + 2);
			}
		}
    }

    public void preorderTraversal(int index) {
		if (isEmpty()) System.out.println("Tree is empty.");			
        else {
			if (index < 0 || index >= currentSize){
				System.out.println("Index is not correct!");
				return;
			} else if (treeArray[index] == null) {
				System.out.print("- ");
				return;
			} else {
				System.out.print(treeArray[index] + " ");
				preorderTraversal(2 * index + 1);
				preorderTraversal(2 * index + 2);
			} 
		}
    }

    public void postorderTraversal(int index) {
		if (isEmpty()) System.out.println("Tree is empty.");			
        else {
			if (index < 0 || index >= currentSize){
				System.out.println("Index is not correct!");
				return;
			} else if (treeArray[index] == null) {
				System.out.print("- ");
				return;
			} else {
				postorderTraversal(2 * index + 1);
				postorderTraversal(2 * index + 2);
				System.out.print(treeArray[index] + " ");
			} 
		}
    }
	
	public void levelOrderTraversal() {
		if (isEmpty()){
			System.out.println("Tree is empty.");			
        } else {
			for (int i = 0; i < currentSize; i++) {
				if (treeArray[i] != null) {
					System.out.print(treeArray[i] + " ");
				} else {
					System.out.print("- ");
				}
			}
		}
    }


    public String getChildren(String data){
        int index = search(data);
        if (index == -1){
            return "Element not found";
        }
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        String leftChild;
        String rightChild;
        if(left < currentSize && treeArray[left] != null){
            leftChild = treeArray[left];
        }
        else{
            leftChild = "-";
        }
        if(right < currentSize && treeArray[right] != null){
            rightChild = treeArray[right];
        }
        else{
            rightChild = "-";
        }
        return "Children of " + data + " -> Left: " + leftChild + ", Right: " + rightChild;
    } 

    public String getParent(String data) {
        int index = search(data);
        if (index == -1 || index == 0){
            return "No parent found";
        }
        int parentIndex = (index - 1) / 2;
        return "Parent of " + data + " -> " + treeArray[parentIndex];
    }

    public void setRightChild(String parent, String child) {
        int index = search(parent);
        if (index == -1) {
            System.out.println("Parent not found");
            return;
        }
        int right = 2 * index + 2;
        if (right >= maxSize) {
            System.out.println("No space for right child");
            return;
        }
        treeArray[right] = child;
        if (right >= currentSize) currentSize = right + 1;
        System.out.println("Set right child of " + parent + " as " + child);
    }

    public void setParent(String child, String parent) {
        int childIndex = search(child);
        if (childIndex == -1 || childIndex == 0) {
            System.out.println("Child not found or child is root");
            return;
        }
        int parentIndex = (childIndex - 1) / 2;
        treeArray[parentIndex] = parent;
        System.out.println("Set parent of " + child + " as " + parent);
    }

    public int findHeight() {
    int height = 0;
    for (int i = 0; i < currentSize; i++) {
        if (treeArray[i] != null && !treeArray[i].equals("-")) {
            int level = (int) (Math.floor(Math.log(i + 1) / Math.log(2))) + 1;
            height = Math.max(height, level);
        }
    }
    return height;
}


    public int findSize() {
        int count = 0;
        for (int i = 0; i < currentSize; i++) {
            if (treeArray[i] != null && !treeArray[i].equals("-")) {
                count++;
            }
        }
        return count;
    }
}

public class BinaryTreeADTArray {
    public static void main(String[] args) {
        BTreeADT binaryTree = new BTreeADT(15);
		
        binaryTree.insert("b"); 
        binaryTree.insert("i"); 
        binaryTree.insert("n"); 
        binaryTree.insert("-"); 
        binaryTree.insert("a"); 
        binaryTree.insert("r"); 
        binaryTree.insert("-"); 
        binaryTree.insert("-"); 
        binaryTree.insert("-"); 
        binaryTree.insert("-"); 
        binaryTree.insert("y");  

        // 1. Get the children of ‘y’
        System.out.println(binaryTree.getChildren("y"));

        // 2 . Get the parent of ‘r’
        System.out.println(binaryTree.getParent("r"));

        // 3. Set right child of n as o
        binaryTree.setRightChild("n", "o");
        binaryTree.levelOrderTraversal();
        System.out.println();

        // 4. Set parent of y as g
        binaryTree.setParent("y", "g");
        binaryTree.levelOrderTraversal();
        System.out.println();

        // 5. Find height
        System.out.println("Height of tree: " + binaryTree.findHeight());

        // 6. Find size
        System.out.println("Size of tree: " + binaryTree.findSize());
    }
}