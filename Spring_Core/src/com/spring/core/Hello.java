package com.spring.core;

public class Hello {
	
	private A aobj;
	
	private B bobj;

	public Hello(B bobj) {
		super();
		this.bobj = bobj;
	}

	public void setAobj(A aobj) {
		this.aobj = aobj;
	}
	
	public void show() {
		aobj.show();
		bobj.show();
	}

	

}
