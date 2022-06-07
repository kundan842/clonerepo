package clonnig.shallowCopy;

public class main {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		     Employee employee1=new Employee("kundan",22,"kundan842@gmail.com","kuandan121");
		     System.out.println("created object");
		     System.out.println(employee1);
		     
		     System.out.println("shalllow copying object");
		       Object empObjRef= employee1.clone();  // will copy employee1 and retun no constructot of emplyee class calledS
		        Employee employee2= (Employee)empObjRef;  // typecasting to employee
		        System.out.println(employee2);

	}

}
