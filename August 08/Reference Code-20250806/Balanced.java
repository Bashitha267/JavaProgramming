public class Balanced{
	public static void main(String args[]){
		String str="(())";
		// StackADT<String> arr=new StackADTArray<>(str.length());
		StackADT <Character> arr = new StackADT<>(str.length());
		for(int i=0;i<str.length();i++){
			if(str.CharAt(i)==')'){
				arr.pop();
			}
			if(str.CharAt(i)=='('){
				arr.push(str.CharAt(i));
			}
			else {
				continue;
			}
		}
		System.out.println(arr.isEmpty());
	}
}