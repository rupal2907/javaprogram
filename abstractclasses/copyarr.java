package abstractclasses;

import java.util.Arrays;

public class copyarr {

	public static void main(String[] args) {
	int array1[]=new int [4];
	array1[0]=78;
	array1[1]=34;
	array1[2]=73;
	int array2[]=new int[4];
	for(int i=0;i<array1.length;i++) {
	array2[i]=array1[i];
	
	}
	System.out.println(Arrays.toString(array1));
	System.out.println(Arrays.toString(array2));
	}
}
