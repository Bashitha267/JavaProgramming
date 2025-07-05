public class Combinations{
	public static void Combi(char arr[],String current,int index){
		System.out.println(current);
		for(int i=index;i<arr.length;i++){
			Combi(arr,current+arr[i],i+1);
		}
	}
	 
	public static void main(String args[]){
		char[] arr={'a','b','c','d'};
		Combi(arr,"",0);
	
	
	
}
}