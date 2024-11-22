package abstractclasses;
import java.util.HashMap;
import java.util.Map;
public class mapsecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map <String,Integer>m1 = new HashMap<String,Integer>();
m1.put("rashmi", 8532);//double can have int value also by typecasting
m1.put("meenu", 987);
m1.put("reta", 4567);
m1.remove("rashmi");
System.out.println(m1);
Map <String,Integer>m2=new HashMap<String,Integer>();
m2.put("reta", 8532);
m2.putAll(m1);
System.out.println(m2);
//boolean b1=m1.isEmpty();
//System.out.println(b1);
m1.clear();
System.out.println();
	}

}
