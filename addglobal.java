package addition;
import java.util.Scanner;
public class addglobal {
	
	

	//static void add()
	//{	int sum=a+b;
	//System.out.println(sum);}
	//static void sub()
	//{int sum=b-a;
	//System.out.println(sum);}
	//static void mul()
	//{int sum=a*b;
	//System.out.println(sum);}
	//static void div()
	//{int sum=b/a;
	//System.out.println(sum);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		
		System.out.println("enter  a");
			int a=s1.nextInt();
			System.out.println("enter b");
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println(sum);
		int diff=b-a;
		System.out.println(diff);
//add();
//sub();
//mul();
//div();
	}

}
