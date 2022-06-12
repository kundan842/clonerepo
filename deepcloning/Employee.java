package clonnig.deepcloning;

public class Employee  implements Cloneable
{

         // adding comment to it
	
	       private String name;
	       private int age;
	       private String email;
	       private String password;
	       private Address adrsref;
	       
		public Employee(String name, int age, String email, String password,Address ref) {
		
			     System.out.println("constructor is called");
			this.name = name;
			this.age = age;
			this.email = email;
			this.password = password;
			this.adrsref=ref;
		}
		@Override
		public  Object clone() throws CloneNotSupportedException {
		
		        Employee employee=(Employee) super.clone();
		        employee.setAdrsref(new Address(this.getAdrsref().getCity(),this.getAdrsref().getPincode()));
		        return employee;
		}
		
		@Override
		public String toString() {
		
			   return this.name+" "+this.age+" "+this.email+" "+this.password +" "+this.adrsref;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Address getAdrsref() {
			return adrsref;
		}
		public void setAdrsref(Address adrsref) {
			this.adrsref = adrsref;
		}
	       
	       
	       
	      

}
