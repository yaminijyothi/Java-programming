package com.bridgelabz.oops.ClinicManagement.Services;

import java.util.ArrayList;

import com.bridgelabz.oops.ClinicManagement.Details.Docter;
import com.bridgelabz.oops.ClinicManagement.Details.Patient;

public class Find {
	//finding by docter id
	public ArrayList<Docter> findById(ArrayList<Docter> ad, int drid) {
		ArrayList<Docter> temp=new ArrayList<Docter>();
		for(Docter docter:ad)
		{
			if(docter.getDrid()==drid)
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
}
                 