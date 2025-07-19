import java.util.*;
public class StudentList{
	public static void main(String args[]){
		ArrayList<Student> studentList=new ArrayList<>();
		Student S1=new Student("John Doe",18,85.5);
		Student S2=new Student("Jane Smith",17,92.0);
		Student S3=new Student("Michael Johnson",19,78.3);
		studentList.add(S1);
		studentList.add(S2);
		studentList.add(S3);
		for(Student student:studentList){
			System.out.println(student.toString());
		}
	}
	
	
	
}