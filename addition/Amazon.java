package addition;

public class Amazon
{
Amazon()
{System.out.println("constructor");
}
Amazon(int a)
{System.out.println("secondconstructor");
}
Amazon(int a,int b)
{System.out.println("ndconstructor");
}
public static void main(String[]args)
{Amazon a1=new Amazon();
//a1.Amazon(7);
Amazon b=new Amazon(200);
Amazon c =new Amazon(200,300);
	//new Amazon();
	//new Amazon(500);
	//new Amazon(200,300);
}
}