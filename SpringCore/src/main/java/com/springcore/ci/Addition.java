package com.springcore.ci;

public class Addition {

	public int a;
	public int b;

	public Addition(int a, int b) {
		System.out.println("int int constructor called");
		this.a = a;
		this.b = b;
	}

	public Addition(double a, double b) {
		System.out.println("double double constructor called");
		this.a = (int) a;
		this.b = (int) b;
	}

	public Addition(String a, String b) {
		System.out.println("String String constructor called");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}

}
