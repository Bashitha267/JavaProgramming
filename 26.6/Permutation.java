public class Permutation{
	
	public static void Combi(String name,String current,int index){
		if(current.length()==name.length()){
			System.out.println(current);
		}
		
		for(int i=index;i<name.length();i++){
			Combi(name,current+name.charAt(i),index+1);
		}
	}
	 
	public static void main(String args[]){
		String name="abc";
		Combi(name,"",0);
	
	
	
}
}
