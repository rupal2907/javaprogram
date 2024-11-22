package abstractclasses;

import java.util.Arrays;

public class equarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1[]=new int[4];
num1[0]=78;
num1[1]=45;
num1[2]=25;
num1[3]=98;
int num2[]=new int[4];
num2[0]=78;
num2[1]=45;
num2[2]=25;
num2[3]=98;
boolean b1= Arrays.equals(num1, num2);
System.out.println(b1);
if(b1== true)
{
	System.out.println("arrays are equal");

}
else
{
	System.out.println("arrays are not equal");
}
	}

}
