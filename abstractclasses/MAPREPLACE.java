package abstractclasses;

import java.util.HashMap;
import java.util.Map;

public class MAPREPLACE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String,Integer>m1=new HashMap<String,Integer>();
		m1.put("rupal", 1);
		m1.put("rupal",2);
		m1.put("parashant", 45);
		m1.put("reyansh",56);
		m1.replace("rupal", 54);
		System.out.println(m1);
		m1.replace("reyansh",56,90 );
		System.out.println(m1);
		m1.remove("prashant");
		System.out.println(m1);
	}

}
