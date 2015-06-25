package com.collectionsdemo;

public class Person implements Cloneable{
	private String number;
	private String name;
	private int count;
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public Person(String number, String name, int count) {
		super();
		this.number = number;
		this.name = name;
		this.count = count;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [number=" + number + ", name=" + name + ", count="
				+ count + "]";
	}

	/**
	 * @desc 重写clone方法
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Person o = null;  
        try {  
            o = (Person) super.clone();  
        } catch (CloneNotSupportedException e) {  
            e.printStackTrace();  
        }  
        return o;  
	}
}
