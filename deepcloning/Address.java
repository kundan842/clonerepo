package clonnig.deepcloning;

public class Address  implements  Cloneable
{
	
	  private String city;
	  private String pincode;
	  
	public Address(String city, String pincode) {
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "city=" + city + ", pincode=" + pincode ;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	  

}
