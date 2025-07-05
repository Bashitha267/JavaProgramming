public class Employee{
	private String Emp_id;
	private String name;
	private double salary;
	
	public Employee(String name,String Emp_id,double salary){
		this.Emp_id=Emp_id;
		this.name=name;
		this.salary=salary;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public void setEmpID(String id){
		Emp_id=id;
	}
	public String getName(){
		return name;
	}
	public String getID(){
		return Emp_id;
	}
	public double getSalary(){
		return salary;
	}
	
	
}