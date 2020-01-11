/* 
* @purpose : Demonstrate the utility function
* @ file   : Utility.java
* @ author : yaminijyothi
*/
package com.bridgelabz.utility;
import java.util.Scanner;
public class Utility {
	private static final String String = null;
	static Scanner sc=new Scanner(System.in);
	
	public static String getString() {
		return sc.nextLine();
	}
	public static int getint() {
		return sc.nextInt();
	}
	public static  double getDouble() {
		return sc.nextDouble();
		}
   public static float getfloat() {
	   return sc.nextFloat();
   }
   public static long getLong() {
	   return sc.nextLong();
   }
   public static boolean getBoolean() {
	   return sc.nextBoolean();
   }
public static String sort(String string) {
	// TODO Auto-generated method stub
char[] ch=string.toCharArray();
String out=" ";
for(int i=0;i<ch.length;i++)
{
	for(int j=i+1;j<ch.length;j++)
	{
		if(ch[i]>ch[j]);
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
	}
	out=out+ch[i];
	
}
return out;
}
}