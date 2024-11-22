package abstractclasses;

public class repall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "Kv no 2";
		String ch= name.replaceAll("[a-zA-Z]", "nothing");
		String n="I am The Boss";
		String c= n.replaceAll("[A-Z]", "nothing");
		System.out.println(ch);
		System.out.println(c);
	}

}
