package addition;

import java.util.Scanner;

public class areacircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double pi=3.15;
		Scanner s1= new Scanner(System.in);
		
		System.out.println("value of pi");
		double pi=s1.nextDouble();
		
		System.out.println("value of r");
		double r=s1.nextDouble();
		double area= pi*r*r;
		System.out.println("area"+area);
		double circumfrance=2*pi*r;
				System.out.println("circumfrance"+circumfrance);	
		
		

	}

}
