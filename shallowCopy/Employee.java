package clonnig.shallowCopy;

public class Employee  implements Cloneable
{
	
	       private String name;
	       private int age;
	       private String email;
	       private String password;
	       
		public Employee(String name, int age, String email, String password) {
		
			     System.out.println("constructor is called");
			this.name = name;
			this.age = age;
			this.email = email;
			this.password = password;
		}
		@Override
		public  Object clone() throws CloneNotSupportedException {
		
		return super.clone();
		}
		
		@Override
		public String toString() {
		
			   return this.name+" "+this.age+" "+this.email+" "+this.password;
		}
	       
	       
	       
	      

}
