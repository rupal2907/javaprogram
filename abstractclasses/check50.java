package abstractclasses;

public class check50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []test=new int[4];
test[0]=34;
test[1]=50;
test[2]=67;
test[3]=90;
int notocheck=50;
for (int i=0;i<test.length;i++)
{
	if(notocheck == test[i])
	{
		System.out.println("equalvalue");
	}
}

	}

}
