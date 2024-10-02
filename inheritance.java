package addition;

 class Class1{
void add1()
{
System.out.println("add1");	
}
	
}
 class Class2 extends Class1{

	 void add2()
	 {
		 System.out.println("add2");	
	 }

	}
public class inheritance extends Class2 {
	void add3()
	{
		System.out.println("add3");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
inheritance i=new inheritance();
i.add1();
i.add2();
i.add3();
	}


	}



