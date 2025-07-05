class ArrayADT {
    int[] array;
    int size;
    
    public ArrayADT(int capacity) {
        array = new int[capacity];
        size = 0;
    }
    
	public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == array.length;
    }
	
	public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        return array[index];
    }
    
    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        array[index] = value;
    }
    
    public int getSize() {
        return size;
    }
	
    public void insert(int index, int value) {		
        if (index < 0 || index > array.length-1) {
			System.out.println("Index is out of range");
            //throw new IndexOutOfBoundsException("Index is out of range");
        }
		else if(isFull()){
			System.out.println("Array is full");
		}		
		else{
			// Shift elements to the right to make space for the new value
			for (int i = size - 1; i >= index; i--) {
				array[i + 1] = array[i];
			}
			array[index] = value;
			size++;
			System.out.println(value+ " inserted at "+ index);
		}        
    }

	public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
		else if(isEmpty()){
			System.out.println("Array is empty");
		}
		else{
			// Shift elements to the left to remove the element at the given index
			for (int i = index; i < size - 1; i++) {
				array[i] = array[i + 1];
			}
			array[size-1] = 0;
			size--;
		}
    }
    
    public int search(int value) {
		if(isEmpty()){
			System.out.println("Array is empty");
			return -1; 
		}
		else{
			for (int i = 0; i < size; i++) {
				if (array[i] == value) {
					return i;
				}
			}
			return -1;  // Value not found
		}        
    }
    
    public void traverse() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
	
	/*
	private void resizeArray() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    } */
	
        
    
}