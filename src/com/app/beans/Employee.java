package com.app.beans;

public class Employee {
	private String ename;
	private int eid;
	
	private EmployeeAddress eaddress;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public EmployeeAddress getEaddress() {
		return eaddress;
	}
	public void setEaddress(EmployeeAddress eaddress) {
		this.eaddress = eaddress;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", eaddress="
				+ eaddress + "]";
	}
	

}
