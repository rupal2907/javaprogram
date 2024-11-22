package abstractclasses;

public class reverse {
	
	public static void main (String[] args)
	{
		String in="ram";
	String input="r\r\na\r\nm";
	String output="";//from last to first
	System.out.println(input);
	for(int i=2;i>=0;i-- )
	{
	char c1= in.charAt(i);
	output=output+c1;
	//System.out.println(output);
	}
	
			System.out.println(output);
	}

}
