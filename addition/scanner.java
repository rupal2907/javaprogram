package addition;

import java.util.Scanner;
import java.lang.*;

public class scanner {


public static void main(String[]args)
{ Scanner s1=new Scanner(System.in);
System.out.println("enter the name");
String name=s1.next();
System.out.println("enter the age a");
	int a=s1.nextInt();
	System.out.println("enter the age b");
	int b=s1.nextInt();
	int sum=a+b;
	System.out.println("sum"+sum);
	
	
}
}
