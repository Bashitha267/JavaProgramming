public class CheckSorted{
	public static boolean check(int arr[]){
		for (int i=0;;){
				if(i==arr.length-1){
					break;
				}
				if(arr[i]>arr[i+1])
				return false;
			
			
			i=i+1;
		}
		return true;
	}
	public static void main(String args[]){
		int arr[]={1,5,6,7,2};
		int arr1[]={1,5,6,7,7,8};
		System.out.println(check(arr));
		System.out.println(check(arr1));
	}
}