public class ArrayADT{
	
	private static int[] array;
	private static  int size;
	
	public ArrayADT(int capacity){
		array=new int[capacity];
		size=0;
		
	}
	public static void traverse(){
		System.out.print("{");
	for(int i=0;i<size;i++){
		System.out.print(array[i]);
		if(i<size-1){
			System.out.print(",");
		}
	}
		System.out.println("}");
	System.out.println();
		}
	
	public static void Insert(int index,int value){
		if(index<0||index>array.length-1){
			throw new IndexOutOfBoundsException("Index is out of range");
		}
		else if(size==array.length){
			System.out.println("Array is full");
		}
		else{
			for(int i=size-1;i>=index;i--){
				array[i+1]=array[i];
			}
			array[index]=value;
			size++;
		}
		
	}
	
	public static void main(String args[]){
		ArrayADT arr=new ArrayADT(5);
		Insert(0,5);
		Insert(1,8);
		Insert(2,4);
		Insert(3,2);
		Insert(4,1);
		traverse();

		
	}
}