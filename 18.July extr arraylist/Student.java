public class Student{
	private String name;
	private int age;
	private double grade;
	public Student(String name,int age,double grade){
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	public String toString(){
		return "Name:"+name+"\n"+"Age:"+age+"\n"+"Grade:"+grade;
	}
}