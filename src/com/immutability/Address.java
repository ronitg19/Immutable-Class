package com.immutability;
public class Address {
	private String city;
    private String state;
    //Parameterize Constructor
    public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	//Copy Constructor
	public Address(Address address) {
		this(address.getCity(),address.getState());
	}
	//Non argument constructor
	public Address() {	
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
}
