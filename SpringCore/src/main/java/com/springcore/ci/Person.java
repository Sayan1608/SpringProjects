package com.springcore.ci;

import java.util.List;

public class Person {

	private int id;
	private String name;
	private Certificate cert;
	private List<String> list;

	public Person(int id, String name, Certificate cert, List<String> list) {
		super();
		this.id = id;
		this.name = name;
		this.cert = cert;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", cert=" + cert + ", list=" + list + "]";
	}

	
}
