package addition;
class test
{
	void set()
	{
		System.out.println("set");
	}
}
class testing extends test
{
void set()
{
	super.set();
	System.out.println("get");
}
	
}
public class Super extends testing
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Super s=new Super();
//super();
s.set();


	}

}
