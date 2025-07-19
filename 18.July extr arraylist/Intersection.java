import java.util.*;
public class Intersection{
	public static ArrayList<Integer> getIntersection(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
		ArrayList<Integer> arr3=new ArrayList<>();
		if(arr1.isEmpty()&&arr2.isEmpty()){
			return arr3;
		}
		for(int i=0;i<arr1.size();i++){
			if((arr2.contains(arr1.get(i)))&& !(arr3.contains(arr1.get(i)))){
				arr3.add(arr1.get(i));
			}
		}
		return arr3;
		
	}
	public static void main(String args[]){
		ArrayList<Integer> arr1=new ArrayList<>();
		ArrayList<Integer> arr2=new ArrayList<>();
		arr1.add(1);
		arr1.add(4);
		arr1.add(15);
		arr1.add(15);
		
		arr1.add(25);
		arr1.add(100);
		arr2.add(15);
		arr2.add(14);
		arr2.add(100);
		arr2.add(45);
		arr2.add(38);
		arr2.add(15);
		
		System.out.println(getIntersection(arr1,arr2));
		
		
		
		
	}
	
	
	
	
	
}