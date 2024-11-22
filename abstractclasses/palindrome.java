package abstractclasses;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="MOM";
		String output="";//from last to first
		for(int i=input.length()-1;i>=0;i-- )
		{
		char c1= input.charAt(i);
		output=output+c1;
		//System.out.println(output);
		}
		System.out.println(output);
		

	boolean b1= input.equals(output);
	
	if(b1==true)
	{
		System.out.println("this is palin");
	}
	else
	{
		System.out.println("not palin");
	}
	}

}
