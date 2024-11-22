package abstractclasses;

public class checkarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int student[]=new int[4];//array of size 4
student[0]=74;
student[1]=4;
student[2]=94;
student[3]=72;
int notocheck=72;
for (int i=0;i<student.length;i++)
{
if(notocheck == student[i])
{
	System.out.println("value is at"+i);
}}


	
	}

}
