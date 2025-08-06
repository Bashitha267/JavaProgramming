class Riverse{
	public static void main(String args[]){
		String str="hello world !!";
		// StackADT<String> arr=new StackADTArray<>(str.length());
		StackADT <Character> arr = new StackADT<>(str.length());
		for(int i=0;i<str.length();i++){
			arr.push(str.charAt(i));
		}
		arr.display();
	}
}