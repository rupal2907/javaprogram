package addition;
class fest
{
	fest(int a,int b)
	{
		System.out.println("const1");
	}
}
class const5 extends fest
{
	const5(String a)
	{
		super(10,20);
		System.out.println("const2");
	}
}
public class Supmulparam extends const5
{Supmulparam()
	{
	super("RUPAL");
	System.out.println("const3");
}

public static void main(String[] args) {
new Supmulparam();

}


}
