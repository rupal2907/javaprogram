package abstractclasses;



public class ass21 {
	
		void rest()
		{
			System.out.println("login with email");
			}
}
		class test extends ass21
		{
			void rest()
			{super.rest();
				System.out.println("login with mobile");
				}

			public static void main(String[] args) {
				test c= new test();
				c.rest();
			}		

			


}
