/* 
 * @purpose : Demonstrate the elapsed time in stopwatch
 * @ file   : stopwatch.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Logicalprogramming;

import com.bridgelabz.utility.Utility;

public class StopWatch {
	 static long starttime=0;
	 static long endtime=0;
	 static long elapsed;
//stating time
	public static long start(int s) {
		starttime = System.currentTimeMillis();
		return starttime;
	}
//ending time
	public static  long end(int e) {
		endtime = System.currentTimeMillis();
		return endtime;
	}
//to calculate elapsed time by using formula endtime-starttime
	public static long elapsed() {
		elapsed = endtime - starttime;
	System.out.println("elapsed time:"+elapsed);
	return elapsed;
		
	}
//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopWatch StopWatch=new StopWatch();
     System.out.println("start time to press 0:");
     int s=Utility.getint();
     StopWatch.start(s);
     System.out.println("end time to press 1");
     int e=Utility.getint();
     StopWatch.end(1);
     long l=StopWatch.elapsed();
    //changing milliseconds  to seconds and prints
     System.out.println("In seconds:"+(l/1000)+"sec");
     	}

}
