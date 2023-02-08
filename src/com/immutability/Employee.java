package com.immutability;
public final class Employee {
	final private int id;
	final private String name;
	final private Address address;
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = new Address(address); // take object from copy constructor.
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Address getAddress() {
		return new Address(address); //return copy of mutable object (address)
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
