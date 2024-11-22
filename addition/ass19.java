package addition;

public class ass19
{
	ass19()
	{
		this(10);
		System.out.println("1st");
	}
	ass19(int a)
	{this(10,20);
	System.out.println("2nd");
	}
	ass19(int a,int b)
	{
	System.out.println("3rd");
	}

	public static void main(String[] args)
	{
		new ass19();
	}
}
