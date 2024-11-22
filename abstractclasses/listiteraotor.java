package abstractclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class listiteraotor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li=new ArrayList();
		li.add(76);
		li.add(7);
		li.add(6);
		li.add(760);//760 is an object
		li.add(607);
		ListIterator l2=li.listIterator();
		System.out.println("forward");
		while(l2.hasNext()) {
			System.out.println(l2.next());
		}
		System.out.println("backward");
		while(l2.hasPrevious())
		{
			System.out.println(l2.previous());
		}
	}

}
