package abstractclasses;

import java.util.Arrays;
import java.util.Scanner;

public class equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rollno[]=new int[4];//array of size 4
Scanner s1=new Scanner(System.in);
for (int i=0;i<4;i++) {
rollno[i]=s1.nextInt();
}
System.out.println(Arrays.toString(rollno));
}

}
