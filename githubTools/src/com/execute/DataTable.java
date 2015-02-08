package com.execute;

public class DataTable {
	private int id=0;

	private String name="unknow";

	private String address="unknow";
	private String content="null";
	public DataTable(int id) {
		super();
		this.id = id;
	}
	public DataTable(int id, String name, String address, String content) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.content = content;
	}

	public String getAddress() {
		return address;
	}

	public String getContent() {
		return content;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DataTable [id=" + id + ", name=" + name + ", address="
				+ address + ", content=" + content + "]";
	}
}
