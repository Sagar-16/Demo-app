package com.sagar.demo.model;

public class Student {
	// Fields (Attributes)
	private String studentId;
	private String firstName;
	private String lastName;
	private int age;
	private String major;

	// Constructor
	public Student(String studentId, String firstName, String lastName, int age, String major) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.major = major;
	}

	// Getter and Setter Methods
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	// Other Methods
	public void study() {

	}
}
