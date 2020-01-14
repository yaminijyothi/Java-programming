package com.bridgelabz.LogicalprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Logicalprogramming.StopWatch;

class StopWatchTest {

	@Test
	void test() {
		long s=StopWatch.start(0);
		long e=StopWatch.end(1);
		 long elapsed=StopWatch.elapsed();
		 assertEquals(elapsed,StopWatch.elapsed());
		 
		    
	}

}
