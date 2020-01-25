package com.bridgelabz.oops.ClinicManagement.Details;

public class Docter {
	private int drid;
	private String drname;
	private String drspl;
	private String dravl;
	public int getDrid() {
		return drid;
	}
	public void setDrid(int drid) {
		this.drid = drid;
	}
	public String getDrname() {
		return drname;
	}
	public void setDrname(String drname) {
		this.drname = drname;
	}
	public String getDrspl() {
		return drspl;
	}
	public void setDrspl(String drspl) {
		this.drspl = drspl;
	}
	public String getDravl() {
		return dravl;
	}
	public void setDravl(String dravl) {
		this.dravl = dravl;
	}//adding details of docter
	public static void addDocter() {
		System.out.println("enter the docter details");
		System.out.println("enter docter id");
		int drid=Utility.getInt();
		System.out.println("enter docter name");
		String drname=Utility.getString();
		System.out.println("enter docter Specialization");
		String drspl=Utility.getString();
		System.out.println("enter docter availability");
		String dravl=Utility.getString();
	}
	public String toString() {
	return "Doctor[drid="+drid+", drname"+drname+", drspl"+drspl+", dravl="+dravl+"]";
	}
	
}