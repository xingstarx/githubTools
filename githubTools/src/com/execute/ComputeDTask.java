package com.execute;

public class ComputeDTask implements Runnable {
	private DataTable singleTable;
	public ComputeDTask(DataTable singleTable) {
		// TODO Auto-generated constructor stub
		this.singleTable=singleTable;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("singleTable is running !");
		
		try {
			Thread.currentThread().sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(singleTable.getId()+"******************");
	}

	@Override
	public String toString() {
		return "ComputeDTask [singleTable=" + singleTable
				+ ", getSingleTable()=" + getSingleTable() + "]";
	}

	public DataTable getSingleTable() {
		return singleTable;
	}

	public void setSingleTable(DataTable singleTable) {
		this.singleTable = singleTable;
	}

}
