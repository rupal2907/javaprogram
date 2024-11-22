package inheritance;
class Report
{Report(String a)
	{
	System.out.println("report");
	}
}
class Screenshot extends Report
{Screenshot(int a,int b)
	{
	super("rsd");
	System.out.println("screenshot");
	
	}
}
public class testcase2 extends Screenshot {

	testcase2()
	{
		//super();//implicitly and explicitly
		super(10,12);
		System.out.println("test");
		
		
	}
	public static void main(String[] args)
	{
		new testcase2();
	}
}
