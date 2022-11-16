package com.jspiders.springautowire2;
import org.springframework.beans.factory.annotation.Autowired;

public class Person1 {
	private String name;
	private String email;
	private long contact;
	
	@Autowired
	private Address address;


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
