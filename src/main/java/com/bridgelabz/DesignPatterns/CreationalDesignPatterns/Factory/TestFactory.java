package com.bridgelabz.DesignPatterns.CreationalDesignPatterns.Factory;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Computer pc= ComputerFactory.getComputer("PC","2 GB","500 GB","2.4 GHz");
     Computer Server=ComputerFactory.getComputer("Server", "16 GB","1 TB","2.9 GHz");
     System.out.println("computer factory of Pc:"+pc);
     System.out.println("computer factory of server:"+Server);
	}

}
