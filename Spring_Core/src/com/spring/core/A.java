package com.spring.core;

public class A {
	
	private int a;
	
	private String msg;

	public void setA(int a) {
		this.a = a;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void show() {
		System.out.println(a);
		System.out.println(msg);
	}

}
