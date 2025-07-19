import java.util.ArrayList;
class ArrayListPerson{
	public static void main(String args[]){
	ArrayList<Person> personList=new ArrayList<Person>();
	Person P1=new Person("Nirmal",24);
	Person P2=new Person("Anjula",25);
	Person P3=new Person("Nipuna",14);
	Person P4=new Person("Chanka",44);
	Person P5=new Person("Dimuthu",45);
	
	personList.add(P1);
	personList.add(P2);
	personList.add(P3);
	personList.add(P4);
	personList.add(P5);
	for (Person p:personList) {
		System.out.println(p.toString());
	}
	}
	
	
}