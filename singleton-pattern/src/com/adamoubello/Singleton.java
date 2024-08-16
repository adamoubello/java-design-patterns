package com.adamoubello;

import java.io.ObjectStreamException;
import java.io.Serial;
import java.io.Serializable;

public class Singleton implements Serializable {

	@Serial
	private static final long serialVersionUID = -1093810940935189395L;
	private static Singleton singletonInstance = new Singleton();
	private String info = "Initial class info";

	private Singleton() {
		if(singletonInstance != null){
			throw new IllegalStateException("Already created.");
		}
	}

	public static Singleton getInstance(){
		return singletonInstance;
	}
	
	private Object readResolve() throws ObjectStreamException {
		return singletonInstance;
	}
	
	private Object writeReplace() throws ObjectStreamException {
		return singletonInstance;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton, cannot be cloned");
	}
	
	private static Class getClass(String classname) throws ClassNotFoundException {
	    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
	    if(classLoader == null) classLoader = Singleton.class.getClassLoader();
	    return (classLoader.loadClass(classname));
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
