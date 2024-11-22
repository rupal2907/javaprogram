package abstractclasses;

public class reverse {
	
	public static void main (String[] args)
	{
	String input="abcd";
	String output="";//from last to first
	for(int i=3;i>=0;i-- )
	{
	char c1= input.charAt(i);
	output=output+c1;
	//System.out.println(output);
	}
	System.out.println(output);
	}

}
