package abstractclasses;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List li=new ArrayList();
li.add(76);
li.add(7);
li.add(6);
li.add(760);//760 is an object
li.add(607);
Collections.sort(li);
//System.out.println(li);
Iterator i1= li.iterator();
while(i1.hasNext())//boolean valueis taken in has next
{
	System.out.println(i1.next());
}

	}

}
