package com.bridgelabz.oops.ClinicManagement.Services;

import java.util.ArrayList;

public class Find {
	//finding by docter id
	public ArrayList<Docter> findById(ArrayList<Docter> ald, int did) {
		ArrayList<Docter> temp=new ArrayList<Docter>();
		for(Docter docter:ald)
		{
			if(docter.getDrid()==did)
			{
				temp.add(docter);
			}
		}


		return temp;
	}
//finding by docter  name
	public ArrayList<Docter> findByDrname(ArrayList<Docter> ald, String dname) {

		ArrayList<Docter> temp=new ArrayList<Docter>();

		for(Docter docter:ald)
		{
			if(docter.getDrname()==dname)
			{
				temp.add(docter);
			}
		}
		return temp;
	}
	//finding by docter availability
	public ArrayList<Docter> FindByDravl (ArrayList<Docter> ald, String availability)  //search doctor by availability
	{
		ArrayList<Docter> temp=new ArrayList<Docter>();

		for(Docter docter:ald)
		{
			if(docter.getDravl()==availability)
			{
				temp.add(docter);
			}
		}
		return temp;	
	}
//finding by patient id
	public ArrayList<Patient> findByPtId(ArrayList<Patient> alp, int pid1) {
		ArrayList<Patient> temp=new ArrayList<Patient>();

		for(Patient patient:alp)
		{
			if(patient.getPtid()==pid1)
			{
				temp.add(patient);
			}
		}
		return temp;
	}
//finding by patient availability
	public ArrayList<Patient> findByPtavl(ArrayList<Patient> alp, String mobile) {



		ArrayList<Patient> temp=new ArrayList<Patient>();

		for(Patient patient:alp)
		{
			if(patient.getPtmobile()==mobile)
			{
				temp.add(patient);
			}
		}
		return temp;

	}
//finding by patient name
	public ArrayList<Patient> findByPtname(ArrayList<Patient> alp, String pname1) {
		ArrayList<Patient> temp=new ArrayList<Patient>();

		for(Patient patient:alp)
		{
			if(patient.getPtname()==pname1)
			{
				temp.add(patient);
			}
		}
		return temp;
	}		
}
                 