package com.hsbc.example;

public class Person {

	private String name, gender, emailId;
	private long phone;

	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public Person(String name, String gender, String emailId) {
		this.name = name;
		this.gender = gender;
		this.emailId = emailId;
	}

	public Person(String name, String gender, String emailId, long phone) {
		this.name = name;
		this.gender = gender;
		this.emailId = emailId;
		this.phone = phone;
	}

	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", emailId=" + emailId + ", phone=" + phone + "]";
	}

	public static void main(String[] args) {
		Person p1 = new Person("Pranoti", "Female");
		Person p2 = new Person("Pranoti", "Female", "pranotikolekar@gmail.com");
		Person p3 = new Person("Pranoti", "Female", "pranotikolekar@gmail.com", 89674523);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
