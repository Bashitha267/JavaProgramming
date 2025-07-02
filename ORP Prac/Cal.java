import java.util.*;
public class Cal{
	public static void performCal(String op,int a,int b){
		if(op.equals("+")){
			System.out.println(a+"+"+b+"="+(a+b));
		}
		else if(op.equals("-")){
			System.out.println(a+"-"+b+"="+(a-b));
		}
		else if(op.equals("*")){
			System.out.println(a+"*"+b+"="+(a*b));
		}
		else if(op.equals("/")){
			System.out.println(a+"/"+b+"="+(a/b));
		}
		else 
			System.out.println("Enter a valid operator from + - * /");
			
		
		
		
		
	}
	public static void main(String args[]){
		Scanner key=new Scanner(System.in);
		System.out.print("Enter the operator(+ ,- ,* ,/):");
		String op=key.nextLine();
		System.out.println();
		System.out.print("Enter the number 1:");
		int a=key.nextInt();
		System.out.println();
		System.out.print("Enter the number 2:");
		int b=key.nextInt();
		performCal(op,a,b);
		// String op2="+";
		// System.out.print(op.equals(op2));
	}
}
