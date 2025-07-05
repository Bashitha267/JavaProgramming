import java.util.*;
public class Grade{
	public static void getGrade(int mark){
		if (mark>=90 && mark<=100)
			System.out.println("A");
		else if (mark>=80 && mark<90)
			System.out.println("B");
		else if (mark>=70 && mark<80)
			System.out.println("C");
		else if (mark>=60 && mark<=70)
			System.out.println("D");
		else 
			System.out.println("E");
	}
	public static void main(String args[]){
		Scanner key=new Scanner(System.in);
		int mark=key.nextInt();
		getGrade(mark);
		
	}
}