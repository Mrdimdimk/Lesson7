package by.vashkevich.StudGroup;

import java.util.Date;

public class Student {
	private String name;
	private int age;
	private int dateAddinGroup;
	
	
	public Student(String name, int age, int date ) {
		this.name = name;
		this.age = age;
		this.dateAddinGroup = date;
	}


	public String getSudentName() {
		return this.name;
	}

	public int getSudentAge() {
		return this.age;
	}
	public int getSudentAddindate() {
		return this.dateAddinGroup;
	}

}