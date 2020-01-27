/*purpose : clinic management system
File    : Clinic.java*/
package com.bridgelabz.oops.ClinicManagement.Controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import com.bridgelabz.oops.ClinicManagement.Details.Appointment;
import com.bridgelabz.oops.ClinicManagement.Details.Docter;
import com.bridgelabz.oops.ClinicManagement.Details.Patient;
import com.bridgelabz.oops.ClinicManagement.Details.Utility;
import com.bridgelabz.oops.ClinicManagement.Services.Find;

public class Clinic{
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws ParseException {
		Utility utility=new Utility();
		Find f=new Find();
		Docter docter=new Docter();
		Patient patient=new Patient();
		ArrayList<Docter> ad=new ArrayList<Docter>();
		ArrayList<Patient> ap=new ArrayList<Patient>();
		HashMap<Appointment,Integer> appoint=new HashMap<Appointment,Integer>();
		int c=0;
		do{
			//printing data about management
			System.out.println("**CINIC MANAGEMANT**");
			System.out.println();
			System.out.println("1.Add Docter:");
			System.out.println("2.Add Patients:");
			System.out.println("3.print docter");
			System.out.println("4.print patients:");
			System.out.println("5.take appointments:");
			System.out.println("6.print no of appointments");
			System.out.println("7.search docter by Id ");
			System.out.println("8.search patient by Id");
			System.out.println("9.exit");
			System.out.println();
			System.out.println("enter ur choice");
			int ch=utility.getInt();
			switch(ch) {
			case 1://add doctor details
				System.out.println("Add doctor");
				docter.addDocter();
				ad.add(docter);
				
				break;
			case 2://add patient details
				System.out.println("Add patient");
				patient.addPatient();
				ap.add(patient);
				break;	
			case 3://printing docter details
				System.out.println("All the doctor details");
				System.out.println(ad.toString());
				break;
			case 4://printing patient details
				System.out.println("All the patient details");
				System.out.println(ap.toString());
				break;
			case 5://taking appointment
				System.out.println("Take an appointment ");
				System.out.println("Enter doctor id");
				int drid=utility.getInt();
				ArrayList<Docter>doc=f.findById(ad,drid);
				if(doc!=null)
				{
					if(doc.size()>=1)
					{
						System.out.println("Enter date of appointment ex:26/2/2020");
						Date date =utility.printDate(utility.getString());
						System.out.println(date);
						if(date==null)
						{
							System.out.println("Date format is not correct");
						}
						//Checking availability of doctors
						else
						{
							//creating object for appointment class
							Appointment newApp=new Appointment(drid,date);
							System.out.println(newApp.toString());
							if(appoint.containsKey(newApp))
							{
								Integer appointment=appoint.get(newApp);
								if(appointment<=5)
								{
									appointment++;
									appoint.put(newApp,appointment);
									System.out.println("Appointment Scheduled on"+date.toString()+" "+"with DoctorId"+drid);

								}
								else
								{
									System.out.println("please select another date");
								}

							}
							appoint.put(newApp,1);

						}
					}
					else
						System.out.println("Invalid doctor id");
				}
				else
					System.out.println("Invalid doctor id");
				break;

			case 6:
				System.out.println("Printing All Appointments...");
				appoint.putAll(appoint);
				System.out.println(appoint);
				break;
			case 7:	
				int ch1=0;
				do
				{//searching  docter id,name,availability
					System.out.println();
					System.out.println("Search a doctor");
					System.out.println("1.search by id");
					System.out.println("2.exit");
					System.out.println();
					System.out.println("Enter your choice");
					int choice1=utility.getInt(); 
					switch(choice1)
					{
					case 1 ://searching docter by id
						System.out.println("1.Enter doctor id");
						int drid1=utility.getInt();
						ad=f.findById(ad, drid1);
						System.out.println(ad);
					case 2 ://to exit
						System.exit(0);
					default :
						System.out.println("Invalid choice");
						break;
					}
				}while(ch1<5);

			case 8:
				Find f1=new Find();
				int ch2=0;
				do
				{   //searching patients by id,name,mobilenumber
					System.out.println();
					System.out.println("----------Search Patients---------");
					System.out.println();
					System.out.println("1.Search Patients By Id");
					System.out.println("2.Exit");
					System.out.println();
					System.out.println("Enter your Choice: ");
					int ch3=utility.getInt();
					switch (ch3) 
					{
					case 1:
						//Search Patients by id
						System.out.println("Enter Patients  Id");
						int pid1=utility.getInt();
						ap=f1.findByPtId(ap,pid1);
						System.out.println(ap);
						break;
					case 2://to exit
						System.exit(0);
					default:
						System.out.println("Invalid choice");
						break;
					}
				}
				while(ch2<3);
			case 9 :
				System.exit(0);
			default :
				System.out.println("Invalid choice");
				break;

			}

		}while(c<10);

	}

}