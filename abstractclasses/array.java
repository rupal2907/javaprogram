package abstractclasses;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//datatype[]variable= new datatype[size]
	//	datatype variable[]= new datatype[size]
		int [] rollno =new int[4];
		
		rollno[0]=2;
		rollno[1]=2;
		rollno[2]=72;
		rollno[3]=9;
		System.out.println(Arrays.toString(rollno));
		String name[]=new String[3];
		name[0]="ram";
		name[1]="ram";
		name[2]="pooja";
	
				//for (int i=0;i<=2;i++)
				//{System.out.println(name[i]);
			//	}
				System.out.println(Arrays.toString(name));
				char gender[]=new char[3];
				gender[0]='f';
				gender[1]='m';
				gender[2]='c';
				System.out.println(Arrays.toString(gender));
	}

}
