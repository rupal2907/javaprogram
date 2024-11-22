package EXCEP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of array");
		int size= s1.nextInt();
	int []rollno=new int [size];
	rollno[0]=78;
	rollno[1]=97;
	rollno[2]=96;
	}
catch(NegativeArraySizeException a1)
		{
	System.out.println("array size is negative");
	Scanner s1=new Scanner(System.in);
	int size= s1.nextInt();
int []rollno=new int [size];
		}
		catch(ArrayIndexOutOfBoundsException a2)
		{
			System.out.println("array size is less");
			Scanner s1=new Scanner(System.in);
			int size= s1.nextInt();
		int []rollno=new int [size];	
		}
		catch(InputMismatchException a2)
		{
			System.out.println("no alphabet");
			Scanner s1=new Scanner(System.in);
			int size= s1.nextInt();
		int []rollno=new int [size];	
		}
		finally
		{
			System.out.println("close connection");
		}
		
	}
}
