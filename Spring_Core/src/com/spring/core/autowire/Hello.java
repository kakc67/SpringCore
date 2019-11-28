package com.spring.core.autowire;

public class Hello {
	
	private  Hai hai=null;
	private Aclass aobj=null;
	
	public Hello() {
		System.out.println("Hello 0-args constructor");
	}
	
	/*public Hello(Hai hai, Aclass aobj) {
		System.out.println("Hello 2-args constructor");
		this.hai = hai;
		this.aobj = aobj;
	}*/
	
	public Hello(Hai ha1) {
		System.out.println("Hello hai arg constructor");
		this.hai = ha1;
		
	}
	
	public Hello(Aclass ao) {
		System.out.println("Hello Aclass args constructor");
		this.aobj = ao;
	}
	
	
	
	public void setHai(Hai ha1) {
		System.out.println("Hello Hai args setter");
		this.hai = hai;
	}
	//In byName autowire parameter name should match with configuration file
	//for byType parametr name not required to match with config file
	public void setAobj(Aclass ao) {
		System.out.println("Hello Aclass args setter");
		this.aobj = aobj;
	}

	public void displays() {
		hai.show();
		aobj.show();
	}
	

}
