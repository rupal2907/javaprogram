package EXCEP;

public class thiskey {
String name;
int age;
double salary;
void stud(String name,int age,
int salary) {
	//System.out.println("my name is "+name);
	//System.out.println("my name is "+age);
	//System.out.println("my name is "+salary);
	this.name=name;
	this.age=age;
	this.salary=salary;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
thiskey t1 = new thiskey();
t1.stud("ram",4,5);
System.out.println(t1.name);
System.out.println(t1.age);
System.out.println(t1.salary);
	}

}
