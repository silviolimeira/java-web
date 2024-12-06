package com.sl.demo.model;

import java.util.Objects;

public class Person {
	
	String name;
	String email;
	int age;

	public Person() {
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, String email, int age) {
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;

		Person person = (Person) o;
		return name.equals(person.name);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return name + " == " + age;
	}
}
