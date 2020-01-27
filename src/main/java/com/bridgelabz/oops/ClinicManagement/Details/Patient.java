package com.bridgelabz.oops.ClinicManagement.Details;

public class Patient {
	private int ptid;
	private String ptname;
	private int ptage;
	private String ptmobile;
	public int getPtid() {
		return ptid;
	}
	public void setPtid(int ptid) {
		this.ptid = ptid;
	}
	public String getPtname() {
		return ptname;
	}
	public void setPtname(String ptname) {
		this.ptname = ptname;
	}
	public int getPtage() {
		return ptage;
	}
	public void setPtage(int ptage) {
		this.ptage = ptage;
	}
	public String getPtmobile() {
		return ptmobile;
	}
	public void setPtmobile(String ptmobile) {
		this.ptmobile = ptmobile;
	}//adding details of patient
	public  void addPatient() {
		System.out.println("enter the patient details");
		System.out.println("enter patient id");
		this.ptid=Utility.getInt();
		System.out.println("enter patient name");
		this.ptname=Utility.getString();
		System.out.println("enter patient age:");
		this.ptage=Utility.getInt();
		System.out.println("enter patient mobile number");
		this.ptmobile=Utility.getString();
}
	public String toString() {
		return "Patient[ptid:"+ptid+", ptname:"+ptname+", ptage:"+ptage+", ptmobile:"+ptmobile+"]";
}
}
