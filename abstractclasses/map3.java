package abstractclasses;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
public class map3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map <String,Integer>m1=new HashMap<String,Integer>();
m1.put("rupal", 1);
m1.put("rupal",2);
m1.put("parashant", 3);
//m1.put("reyansh",56);
System.out.println(m1.keySet());
for(String s1: m1.keySet())
{
	System.out.println(s1);
}
//System.out.println();m1.values());
for(Integer i1 : m1.values())
{
	System.out.println(i1);
}
for(Entry<String,Integer> i2:m1.entrySet())
{
	System.out.println(i2);
}
	}	}
