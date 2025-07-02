public class FindMinimum{
	public static void findMin(ArrayADT arr){
		if(arr.getSize()==0){
			System.out.println("Array is empty.");
		}
		else{
			int minimum=arr.get(0);
			for(int i=1;i<arr.getSize();i++){
				if(arr.get(i)<minimum){
					minimum=arr.get(i);
				}
			}
			System.out.print(minimum);
		}
	}
	public static void main(String args[]){
		ArrayADT arr1=new ArrayADT(5);
		arr1.insert(0,4);
		arr1.insert(1,8);
		arr1.insert(2,11);
		arr1.insert(3,6);
		arr1.insert(4,5);
		System.out.print("Minimum Value is: ");
		findMin(arr1);
		
	}
}