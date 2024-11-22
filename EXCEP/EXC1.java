package EXCEP;

public class EXC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int c=1/0;
			System.out.println(c);
	}
catch(ArithmeticException a1)
{
	System.out.println("handle the exception");
}
	}

}
