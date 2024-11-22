package abstractclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	Vector li=new Vector();
	li.add(76);
	li.add(7);
	li.add(6);
	li.add(760);//760 is an object
	li.add(607);
	//Collections.sort(li);
	//System.out.println(li);
	Enumeration e1=li.elements();
	while(e1.hasMoreElements())//boolean valueis taken in has next
	{
		System.out.println(e1.nextElement());
	}

		

	}

}
