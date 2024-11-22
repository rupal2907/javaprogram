package abstractclasses;

public class upper {

	
		// TODO Auto-generated method stub
		 static char first(String str)
		    {
		        for (int i = 0; i < str.length(); i++)
		            if (Character.isUpperCase(str.charAt(i)))
		                return str.charAt(i);
		        return 0;
		    }
		     
		    // Driver program 
		    public static void main(String args[])
		    {
		        String str = "My name is Ram";
		        char res = first(str);
		        if (res == 0)
		            System.out.println("No uppercase letter");
		        else
		            System.out.println(res);
		    }
	


}
