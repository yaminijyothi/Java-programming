package com.bridgelabz.oops.ClinicManagement.Details;

public class Docter {
	int drid;
	 String drname;
	 String drspl;
	 String dravl;
	Utility utility=new Utility();
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
	public void addDocter() {
		System.out.println("enter the docter details");
		System.out.println("enter docter id");
		this.drid=Utility.getInt();
		System.out.println("enter docter name");
		this.drname=Utility.getString();
		System.out.println("enter docter Specialization");
		this.drspl=Utility.getString();
		System.out.println("enter docter availability");
		this.dravl=Utility.getString();
		System.out.println();
		System.out.println("Docotor added..");
	}
	public String toString() {
	return "Doctor[drid="+drid+", drname="+drname+", drspl="+drspl+", dravl="+dravl+"]";
	}
	
}