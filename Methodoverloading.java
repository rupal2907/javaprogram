package addition;

public class Methodoverloading {
	 void addition(double a,double b)
	{ 	double sum=a+b;
	System.out.println("add"+sum);
	}
	
	static void addition(int a,int b)
	{
		int sum=a+b;
		System.out.println("add"+sum);	}
	
	static void addition(double a,int b)
	{
		double sum=a+b;
		System.out.println("add"+sum);	}
	static void addition(boolean b,String c,char d)
	{
		
		System.out.println("add"+c);	}
	public static void main(String[]args)
	{
		Methodoverloading m= new Methodoverloading();
		addition(true,"rupal",'c');
		addition(32,64);
		m.addition(23.4,34.5);
		addition(23.3,23);
}

}
