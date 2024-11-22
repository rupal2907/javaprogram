package abstractclasses;

import java.util.Arrays;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]=new int [4];
		array1[0]=78;
		array1[1]=34;
		array1[2]=73;
		array1[3]=90;
		int stud[]=new int[4];
		for(int i=0,k=3;i<array1.length;i++,k--)
		{
		stud[k]=array1[i];
	}
	System.out.println(Arrays.toString(array1));
	System.out.println(Arrays.toString(stud));
}}
