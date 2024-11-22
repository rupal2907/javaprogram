package addition;


class abc
{
	static void test()
	{
		System.out.println("catch");
	}
}
 class singleinh extends abc {
 static void display()
 {
	 System.out.println("display");
}

 
public static void main(String[] args)
{
	singleinh s=new singleinh();
	s.display();
	s.test();
	
}
}