package abstractclasses;
abstract class Class3
{
	abstract void method1();   //abscta method
	abstract void method2();  //abscta method
	void method4() ////concrete method
	{
		System.out.println("Logic for loggout from system");
	}

}
abstract class Class2 extends Class3
{
	abstract void method3();//abscta method
	abstract void method5();//abscta method
}
public class concrete extends Class2
{
public static void main(String[] args) //concrete method
{
	concrete c=new concrete();
c.method1();
c.method2();
c.method3();
}

void method3() {//concrete me
	System.out.println("method3");
}

void method5() {//concrete method
	System.out.println("method5");
}

void method1() {//concrete method
	System.out.println("method1");
}
void method2() {//concrete method
	System.out.println("method2");
}
}
