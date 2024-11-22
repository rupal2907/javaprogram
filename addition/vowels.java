package addition;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/* Scanner s1= new Scanner(System.in);
			
			System.out.println("enter the string");
			String str=s1.next();
			int count = 0;
			for(int i=0;i<str.length();i++)
			{
			if ((str.charAt(i) =='a' || str.charAt(i)=='e'||str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u'))
			{
			count++;
			System.out.println("vowels are"+count);
			}
			System.out.println("no vowels");
			}*/
		int count=0;
	       String str ="This iis aa test";
	        for(int i=0;i <str.length();i++){
	            if((str.charAt(i) == 'a') || 
	                (str.charAt(i) == 'e')  ||
	                (str.charAt(i) == 'i') || 
	                (str.charAt(i) == 'o') ||
	                (str.charAt(i) == 'u')) {
	                System.out.println(" The String contains " + str.charAt(i));
	                
	                count++;
	               // int f=0;
	           // f =f+count;
	            
	                System.out.println("vowels are"+count);
	            }
	                
	      
	            
	            }

	}

}
