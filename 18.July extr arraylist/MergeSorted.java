import java.util.*;
public class MergeSorted{
	public static ArrayList<Double> mergeSorted(double[] arr1,double[] arr2){
		ArrayList<Double> sorted=new ArrayList<Double>();
		for(double num:arr1){
			sorted.add(num);
		}
		for(double num:arr2){
			sorted.add(num);
		}
		// for(int i=0;i<sorted.size();i++){
			// for(int j=0;j<arr2.length;j++){
				// if(arr2[i]<=sorted.get(j)){
					// sorted.add(i,arr2[i]);
				// }
				// sorted.add(arr2[i]);
			// }
			
		// }
		
		sorted.sort(null);
		return sorted;
	}
	public static void main(String args[]){
		double[] arr1={15.55,18.65,25.65,28.35,30.54};  //sorted initaly
		double[] arr2={40.54,35.48,28.45,14.56,8.76};
		
		System.out.println(mergeSorted(arr1,arr2));
		
		
	}
}