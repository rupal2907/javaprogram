package abstractclasses;
import java.util.Collection;
import java.util.Arrays;
public class lettercount {

		

			static int count_of_alpha;
			static int count_of_digit;
			static int count_of_space;
		public static void main(String[] args)
		{String input="kv no 2";
		char c1[]=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<input.length();i++)
		{
		boolean b1=Character.isAlphabetic(c1[i]);
		System.out.println(b1);
		if(b1==true)
		{
			count_of_alpha++;
		}
			boolean b2=Character.isDigit(c1[i]);
			
			if(b2==true)
			{
				count_of_digit++;
			}
			boolean b3=Character.isSpace(c1[i]);
					if(b3==true)
					{
						count_of_space++;
					}

		}
		System.out.println(count_of_alpha);
		System.out.println(count_of_digit);
		System.out.println(count_of_space);
			}

		

	

}
