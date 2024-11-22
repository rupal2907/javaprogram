package abstractclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylistiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList li=new ArrayList();
		li.add(76);
		li.add(7);
		li.add("java");
		li.add("selenium");//760 is an object
		li.add(607);
	ArrayList a2= new ArrayList();
	a2.add("laptop");
	a2.add("system");
	a2.addAll(li);
		System.out.println(li);
		System.out.println(a2);
		a2.remove(0);

			

	}

}
