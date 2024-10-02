package addition;



class abcd
{
 void test()
{
	System.out.println("catch");
}
}
class singleinhnon extends abcd {
 void display()
{
 System.out.println("display");
}



public static void main(String[] args)
{
singleinhnon s=new singleinhnon();
s.display();
s.test();
}
}

