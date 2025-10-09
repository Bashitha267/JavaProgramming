public class MergeSort{
	public static void divide(int divArr[]){
		if(divArr.length==1){
			return;
		}
		
			int n=divArr.length/2;
		int newArr[]=new int[n];
		System.out.println();
		 System.out.println("Left array");
		
		int newArr2[]=new int[divArr.length-n];
				for(int i=0;i<n;i++){
			newArr[i]=divArr[i];
		}
		for(int i=0;i<n;i++){
			System.out.print(newArr[i]+",");
		}
		System.out.println();
		 System.out.println("Right array");
		for(int i=0;i<divArr.length-n;i++){
			newArr2[i]=divArr[n+i];
		}
		for(int i=0;i<divArr.length-n;i++){
			System.out.print(newArr2[i] +",");
		}
		divide(newArr);
		divide(newArr2);
		merge(newArr,newArr2);
		
		
	}
	public static void merge(int[] left,int[] right){
		int n=left.length+right.length;
		int merged[]=new int[n];
		for(int i=0;i<left.length;i++){
			merged[i]=left[i];
		}
		for(int i=left.length;i<n;i++){
			merged[i]=right[n-left.length+i];
		}
		 System.out.println("----------------After mergin--------------");
		for(int i=0;i<merged.length-n;i++){
			System.out.print(merged[i] +",");
		}
		
	}
	public static void main(String args[]){
		int arr[]={7,2,4,5,6,12};
		// System.out.println(arr[0]);
		divide(arr);
		
	}
	
	
	
	
	
}