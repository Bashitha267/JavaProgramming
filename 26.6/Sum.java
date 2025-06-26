import java.util.*;
public class Sum{
	
	public static int sumOfNumLoops(int arr[]){
		int sum=0;
		for (int i=0;i<arr.length;i++){
			 sum=sum+arr[i];
	 }
	 return sum;
	}
	public static int sumOfNumRc(int arr[],int count){
		if (count==0){
			return arr[0];
		}
		return arr[count]+sumOfNumRc(arr,count-1);
	}
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		//int num=inp.nextInt();
		// int arr[]=new int[num];
		// for (int i=0;i<num;i++){
			// System.out.println("Enter the element "+i+":");
			// arr[i]=inp.nextInt();
	// }
	int arr[]={2,4,5,9,4,9};

	int sum=sumOfNumLoops(arr);
	System.out.println("Sum from loop: "+sum);
	int sumRc=sumOfNumRc(arr,arr.length-1);
	System.out.println("Sum from rec: "+sumRc);
	
}
}