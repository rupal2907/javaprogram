package addition;
class Report
	{
	void test2()
		{
		System.out.println("report");
		}
	}
class creta extends Report
{
	void test1()
	{
	System.out.println("creta");
	}

}
	class Screenshot extends creta
	{
		static void test3()
		{
		System.out.println("screenshot");
		
		}
	}
	 class mulinh extends Screenshot {

		void testcase()
		{
			//super();//implicitly and explicitly
	
			System.out.println("test");
			
			
		}
		public static void main(String[] args)
		{
			mulinh m =new mulinh();
			m.test1();
			m.test2();
			m.testcase();
			m.test3();
		}
	}

