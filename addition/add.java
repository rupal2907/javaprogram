package addition;

public class add {
	
	void addition()
{ int a=102;
int b=20;
int add=a+b;
System.out.println("add"+add);	
}
	void subtract()
{ int a=102;
int b=20;
int subtract=a-b;
System.out.println("subtract"+subtract);	
}
	void multiply()
{ int a=102;
int b=20;
int multiply=a*b;
System.out.println("multiply"+multiply);	
}
	void divide()
{ int a=100;
int b=20;
int divide=a/b;
System.out.println("divide"+divide);	
}
	void modulus()
{ int a=102;
int b=20;
int mod=a%b;
System.out.println("modulus"+mod);	}



public static void main(String[]args)
{add a= new add();
	a.modulus();
	a.addition();
	a.divide();
	a.multiply();
	a.subtract();
}


}
