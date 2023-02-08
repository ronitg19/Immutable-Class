package com.immutability;
public class Test {
	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("Ngp");
		address.setState("MH");
		Employee emp = new Employee(1, "Ronit",address);
		System.out.println(emp);
		
		Address address2 = emp.getAddress();
		address2.setCity("pune");
		address2.setState("dfg");
		System.out.println(emp);
	}
}