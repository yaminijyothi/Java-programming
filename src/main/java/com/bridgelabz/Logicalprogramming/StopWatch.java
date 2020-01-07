/* 
 * @purpose : Demonstrate the elapsed time in stopwatch
 * @ file   : stopwatch.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Logicalprogramming;

import com.bridgelabz.utility.Utility;

public class StopWatch {
	 long starttime=0;
	 long endtime=0;
	 long elapsed;
//stating time
	public long start() {
		starttime = System.currentTimeMillis();
		return starttime;
	}
//ending time
	public long end() {
		endtime = System.currentTimeMillis();
		return endtime;
	}
//to calculate elapsed time by using formula endtime-starttime
	public long elapsed() {
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
     StopWatch.start();
     System.out.println("end time to press 1");
     int e=Utility.getint();
     StopWatch.end();
     long l=StopWatch.elapsed();
    //changing milliseconds  to seconds and prints
     System.out.println("In seconds:"+(l/1000)+"sec");
     	}

}
