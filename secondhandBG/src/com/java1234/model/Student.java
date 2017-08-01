package com.java1234.model;

public class Student {

	private Integer id;
	private String name;
	private Integer age;
	private Address address;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Student(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}




	public Student(Integer id, String name, Integer age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}




	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}







	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age
				+ ", address=" + address + "]";
	}



	
	
	
}
