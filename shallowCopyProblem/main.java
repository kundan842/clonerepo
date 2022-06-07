package clonnig.shallowCopyProblem;

public class main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address a1=new Address("vapi","396191");
	
		     Employee employee1=new Employee("kundan",22,"kundan842@gmail.com","kuandan121",a1);
		     System.out.println("creted object");
		     System.out.println(employee1);
		     
		     System.out.println("shalllow copying object");
		       Object empObjRef= employee1.clone();  // will copy employee1 and retun no constructot of emplyee class calledS
		        Employee employee2= (Employee)empObjRef;  // typecasting to employee
		        
		         employee1.setName("rohan");
		         employee2.getAdrsref().setCity("surat");
		         employee2.getAdrsref().setPincode("814133");
		         System.out.println("created object after aking changes in both object");
		         System.out.println(employee1);
		         System.out.println("clonned object");
		        System.out.println(employee2);
		        
		        // by chaning address of one object changes is made in output of both object
		    

	}

}
