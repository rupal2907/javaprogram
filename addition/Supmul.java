package addition;
class rest
{
	rest()
	{
		System.out.println("const1");
	}
}
class const2 extends rest
{
	const2()
	{
		super();
		System.out.println("const2");
	}
}
public class Supmul extends const2 {
	Supmul()
	{
		super();
		System.out.println("const3");
	}

	public static void main(String[] args) {
new Supmul();
	
	}

}
