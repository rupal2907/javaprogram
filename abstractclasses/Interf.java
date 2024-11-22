package abstractclasses;
interface amazon
{
	void get();
	void set();
}
interface flipkart
{
	void rest();
	
}
public class Interf implements amazon,flipkart {
public void get()
{
	System.out.println("get the values");
}
public void set()
{
	System.out.println("set the values");
}
public void rest()
{
	System.out.println("rest the values");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Interf i=new Interf();
i.get();
i.set();
i.rest();
	}

}
