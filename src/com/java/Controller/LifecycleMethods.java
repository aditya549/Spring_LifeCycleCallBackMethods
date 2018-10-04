package com.java.Controller;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifecycleMethods {
	
	private int eid;
	private String ename;
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	public void printProperties() {
		System.out.println("THe Eid is:"+getEid());
		System.out.println("THe Name is:" +getEname());
	}
	public void myDestroy()  {
		System.out.println(" My Destroy Method Exicution.....!!!!!");
		
	}
	public void myInit() {
		System.out.println("My Init Method Exicuting......!!!!!");
		
	}

}
