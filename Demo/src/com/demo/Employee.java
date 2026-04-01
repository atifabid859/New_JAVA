package com.demo;

public class Employee {

	private Long Id;
	private String nameString;
	private String address;
	private long salary;
	private String number;
	public Employee(Long id, String nameString, String address, long salary, String number) {
		super();
		Id = id;
		this.nameString = nameString;
		this.address = address;
		this.salary = salary;
		this.number = number;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", nameString=" + nameString + ", address=" + address + ", salary=" + salary
				+ ", number=" + number + "]";
	}
	
	
}
