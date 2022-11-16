package com.jspiders.springautowire1;

public class Person {
	private String name;
	private String email;
	private long contact;
	private Address address;

	public Person(String name, String email, long contact, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", contact=" + contact + ", address=" + address + "]";
	}
}
