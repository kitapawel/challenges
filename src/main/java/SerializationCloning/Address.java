package SerializationCloning;

import java.io.Serializable;

public class Address implements Serializable {
	
	private String city;
	private int pincode;
	
	public Address (String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getPincode() {
		return pincode;
	}
	
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
