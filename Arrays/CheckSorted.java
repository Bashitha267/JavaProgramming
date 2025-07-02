public class CheckSorted{
	public static boolean check(int arr[]){
		for (int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1])
				return false;
		}
		return true;
	}
	public static void main(String args[]){
		int arr[]={1,5,6,7,2};
		System.out.println(check(arr));
	}
}